//
//
//package Basic;
//
//public class MergeChar {
//    public static void main(String[] args) {
//
//        char[] f = {'i', 'y', 'a', 'l'};
//        char[] s = {'a', 'r', 'a', 's','u'};
//        char[] c = new char[f.length + s.length];
//        for (int i = 0; i < f.length; i++) {
//            c[i] = f[i];
//        }
//        for (int i = 0; i < s.length; i++) {
//            c[f.length + i] = s[i];
//        }
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i] + " ");
//        }
//    }
//}



package Basic;

public class MergeChar {
    public static void main(String[] args) {

        char[] f = {'i', 'y', 'a', 'l'};
        char[] s = {'a', 'r', 'a', 's', 'u'};

        char[] c = new char[f.length + s.length];

        for (int i = 0; i < c.length; i++) {
            if (i < f.length) {
                c[i] = f[i];
                System.out.print(c[i] + " ");
            } else {
                c[i] = s[i - f.length];
                System.out.print(c[i] + " ");
            }
        }


    }
}