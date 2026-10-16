package Day8;

public class FirstAppear {
    public static void main (String args[]){
        String s="azbaaa";
        int count[]= new int[26];
        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i)-'a']++;

        }
        for (int i = 0; i < s.length(); i++) {

            if(count[s.charAt(i)-'a']==1){
                System.out.println(s.charAt(i));
                break;
            }

        }

    }
}
