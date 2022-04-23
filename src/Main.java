class Solution {
        public List<String> commonChars(String[] words) {
            int count = 0;
            List<Character> chA = new ArrayList<>();
            List<Character> chB = new ArrayList<>();
            List<String> sA = new ArrayList<>();
            char[] ch = new char[100];
            for(String s : words) {
                ch = s.toCharArray();

                for (int i = 0; i < ch.length; i++) {
                    if(count == 0) {
                        chA.add(ch[i]);
                    } else {
                        if(chA.contains(ch[i])) {
                            chB.add(ch[i]);
                        }
                    }

                }
                chA = new ArrayList<>(chB);
                chB.clear();
                count++;

            }

            for (char c : chA) {
                sA.add(String.valueOf(c));
            }

            return sA;

        }


    public static void main(String[] args) {
	// write your code here
        String[] str = new String[3];
        str[0] = "bella";
        str[1] = "label";
        str[2] = "roller";
        List<String> strL = commonChars(str);
        for (String s : strL) {
            System.out.print(s);
        }
    }
}
