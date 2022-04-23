import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static List<String> commonChars(String[] words) {
        int count = 0;
        List<Character> chA = new ArrayList<>();
        List<String> sA = new ArrayList<>();
        char[] ch = new char[100];
        for(String s : words) {
            ch = s.toCharArray();
            if (count == 0) {
                for (char c : ch) {
                    chA.add(c);
                }
            } else {
                for (int i = 0; i < chA.size(); i++) {
                    for (int j = 0; j < ch.length; j++) {
                        if (chA.get(i) == ch[j]) {
                            ch[j] = ' ';
                            break;
                        }
                        if (j == ch.length - 1) {
                            chA.remove(i);
                            i--;
                        }
                    }


                }
            }
            count++;

        }

        for (char c : chA) {
            sA.add(String.valueOf(c));
        }

        return sA;

    }


    public static void main(String[] args) {
        // write your code here
        String[] str = new String[8];
        str[0] = "daaccccd";
        str[1] = "adacbdda";
        str[2] = "abddbaba";
        str[3] = "bacbcbcb";
        str[4] = "bdaaaddc";
        str[5] = "cdadacba";
        str[6] = "bacbdcda";
        str[7] = "bacdaacd";
        List<String> strL = commonChars(str);
        for (String s : strL) {
            System.out.print(s);
        }
    }
}
