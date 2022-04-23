import java.util.*;
import java.io.*;
import java.util.Collections;

class Main {

    public static String MathChallenge(int num) {

        int tempNum = num;
        Stack<Integer> tempStack = new Stack<>();
        List<Integer> seperateNum = new ArrayList<>();
        List<Number> resultList = new ArrayList<>();
        while (tempNum > 0) {
            tempStack.push(tempNum % 10);
            tempNum /= 10;
        }

        while (!tempStack.isEmpty()) {
            seperateNum.add(tempStack.pop());
        }

        if (seperateNum.size() == 1) {
            return "not possible";
        }
        List<Integer> tempNums = new ArrayList<>(seperateNum.subList(1, seperateNum.size()));
        Collections.sort(tempNums, Collections.reverseOrder());
        int sum = seperateNum.get(0);

        for (int number : tempNums) {
            if (number > sum) {
                sum += number;
                resultList.add(new Number(number, "+"));
            }
            else {
                sum -= number;
                resultList.add(new Number(number, "-"));
            }

        }

        String[] result = new String[seperateNum.size() - 1];

        if (sum == 0) {
            seperateNum.remove(0);
            for (Number number : resultList) {
                int position = seperateNum.indexOf(number.getNum());
                seperateNum.set(position, -1);
                result[position] = number.getOperator();
            }
            String sendBack = "";
            for (String s : result) {
                sendBack += s;
            }

            return sendBack;

        } else {
            return "not possible";
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(Integer.parseInt(s.nextLine())));
    }

    private static class Number {
        private int num;
        private String operator;
        public Number(int num, String operator) {
            this.num = num;
            this.operator = operator;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public String getOperator() {
            return operator;
        }
    }

}