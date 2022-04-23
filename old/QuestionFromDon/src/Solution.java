public class Solution {
    public static void main(String[] args) {
        int[] intArray = new int[5000];
        for (int position = 0; position < intArray.length; position++) {
            intArray[position] = position + 1;
        }
        int[] copyArray = intArray.clone();
        int[] helpArray = null;
        while (intArray.length != 1) {
            helpArray = new int[intArray.length / 2];
            for (int index = 0; index < helpArray.length; index++) {
                helpArray[index] = intArray[index * 2 + 1];
            }
            intArray = helpArray;
        }
        System.out.println(intArray[0]);
        System.out.println(getLast(copyArray));

    }

    static int getLast(int[] numbers) {
        if (numbers.length == 1)
            return numbers[0];
        int[] newNums = new int[numbers.length / 2];
        int counter = 0;
        for (int index = 0; index < numbers.length; index++) {
            if (index % 2 == 0)
                continue;
            newNums[counter] = numbers[index];
            counter++;
        }
        return getLast(newNums);
    }
}
