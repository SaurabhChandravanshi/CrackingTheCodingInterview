package string;

/*

Given two string write a function to check if they are one or zero edit away
(edit refers to insert, remove and replace)
Prob: 1.5 Pg: 60
 */

public class OneEditAway {

    public static void main(String[] args) {

        String s1 = "pale";
        String s2 = "bale";

        System.out.println(oneEditWay(s1, s2));
    }


    public static boolean oneEditWay(String s1, String s2) {

        if(s1.length() == s2.length()) {
            return oneReplaceAway(s1, s2);
        } else if (s1.length() + 1 == s2.length()) {
            return oneInsertDeleteAway(s2,s1);
        } else if (s1.length() - 1 == s2.length()) {
            return oneInsertDeleteAway(s1, s2);
        }

       return false;
    }

    public static boolean oneInsertDeleteAway(String s1, String s2) {

        boolean foundDifference = false;

        int p1 = 0;
        int p2 = 0;

        while (p1 < s1.length() && p2 < s2.length()) {

            if (s1.charAt(p1) == s2.charAt(p2)) {
                p1++; p2++;
            }
            else {
                if(foundDifference) return false;
                foundDifference = true;
                p1++;
            }
        }

        if(p1 < s1.length()) {
            if(foundDifference) return false;
            foundDifference = true;
        }

        return foundDifference;
    }

    public static boolean oneReplaceAway(String s1, String s2) {
        boolean foundDifference = false;

        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(foundDifference) return false;
                foundDifference = true;
            }
        }

        return true;
    }
}
