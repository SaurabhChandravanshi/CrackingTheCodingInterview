package string;


/*
Check if string is a palindrome permutation
Prob: 1.4, Pg: 60
 */

public class PalindromePermutation {

    public static void main(String[] args) {

        String s = "tactcoapapa";

        System.out.println(isPalindromePermutation(s));
    }

    public static boolean isPalindromePermutation(String s) {

        s = s.toLowerCase();
        int[] chars = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];


        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int a = Character.getNumericValue('a');
            int z = Character.getNumericValue('z');
            if(ch >= a && ch <= z) {
                chars[ch - a]++;
            }
        }

        boolean foundOdd = false;

        for(int i:chars) {
            if (i % 2 == 1) {
                if(foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }

        return true;
    }
}
