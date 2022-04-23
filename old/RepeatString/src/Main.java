import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        if (s.isEmpty() || s.equals(" "))
            return 0;
        if (s.length() == 1)
            return n;
        System.out.println(s.charAt(84));
        HashMap<Character, Long> myMap = new HashMap<>();
        char[] myCharArray = s.toCharArray();
        for (char c : myCharArray) {
            if (myMap.containsKey(c)) {
                myMap.replace(c, myMap.get(c) + 1);
            } else
                myMap.put(c, (long) 1);
        }

        long thePosition = n % s.length();
        long times = n / s.length();
        char theChar = s.charAt((int) thePosition - 1);
        System.out.println(thePosition + " " + times + " " + theChar + " " +
                myMap.get(theChar));
        if (thePosition == 0)
            return times * myMap.get(theChar);
        else {
            long result = times * myMap.get(theChar);
            for (int index = 0; index < thePosition; index++)
                if (s.charAt(index) == theChar)
                    result++;

            return result;

        }

    }

}

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc = new Scanner(System.in);

        String s = "aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbaddcabaacbcaabbaaa";

        long n = 942885108885L;

        long result = Result.repeatedString(s, n);

        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
