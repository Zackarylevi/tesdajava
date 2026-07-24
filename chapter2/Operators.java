package chapter2;

public class Operators {
    public static void main(String[] args) {
     // shift ops
        System.out.println(2<<2);
        System.out.println(15>>1);
        //Binary
        //0 0 1 0
        //8 4 2 1

        //0 1 1 1 
        int p = 3;
        System.out.println(++p+p++);// (1+3) + 4 =8
        System.out.println(p); //4++
        //❌ ++p++; --p-=-;
        //✅p=+p++;
        System.out.println(!false);
        // (type) value or variable;
        int g = (byte)26;
        byte w = (byte)g;
        boolean isActive = false;
        System.out.println(!!!!!!!!!!!!!isActive);
        System.out.println();
        boolean isActive2 = false, isActive3;
        isActive=isActive2=isActive3=true;
        System.out.println(isActive);
        System.out.println(isActive2);
        System.out.println(isActive3);


}
}