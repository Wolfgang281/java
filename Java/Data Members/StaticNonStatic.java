
public class StaticNonStatic {
    static int i;
    static byte b;
    static short s;
    static long l;
    float f;
    double d;
    char ch;
    boolean o;
    String str;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        StaticNonStatic p = new StaticNonStatic();
        System.out.println(p.f);
        System.out.println(p.d);
        System.out.println(p.ch);
        System.out.println(p.o);
        System.out.println(p.str);
    }
}
