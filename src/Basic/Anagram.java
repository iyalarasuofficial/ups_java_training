package Basic;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "iyal";
        String s2 = "lyai";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        boolean flag = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}