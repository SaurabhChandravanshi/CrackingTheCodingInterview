package string;

/*
count of repeated characters
Prob: 1.6, Pg: 60

 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compressedString("aabcccccaaa"));
    }

    public static String compressedString(String s) {
        String compressedString = "";

        int countConsecutive = 0;
        for(int i=0;i<s.length();i++) {
            countConsecutive++;

            if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedString +=  "" + s.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }

        return compressedString.length() > s.length() ? s : compressedString;
    }
}
