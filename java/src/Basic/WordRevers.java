package Basic;

public class WordRevers {
    public static void main(String[] args) {

        String s = "java full stack";
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i =0; i< words.length; i++) {
            sb.append(words[i]);
        }

        System.out.println(sb.toString().trim());
    }
}