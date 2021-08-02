package com.learn2earnhub;

public class StringSearching {

    /**
     * indexOf() method implementation in JAVA.
     * Finds the first occurrence of pattern in str.
     * @param pattern
     * @param str
     * @return int
     */
    public int naiveSearch(String pattern, String str){

        for(int i=0; i< str.length()-pattern.length(); i++) {
            int patI = 0;
            while (str.charAt(i + patI) == pattern.charAt(patI)) {
                patI++;
                if (pattern.length() == patI) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StringSearching ss = new StringSearching();
        System.out.println(ss.naiveSearch("at", "hello at atluru"));
    }

}
