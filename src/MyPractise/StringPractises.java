package MyPractise;

public class StringPractises {
    public static void main(String[] args) {
        String a="lokidemo";
        String b="loki";
        b.concat("demo");

        System.out.println( new StringBuilder(b).reverse());


        System.out.println(a==b);
        int v=0;
        for (int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
           if(ch>='a' && ch<='z'){
               v++;
           }
        }
        System.out.println(v);
    }
}
