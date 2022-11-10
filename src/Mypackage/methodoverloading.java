package Mypackage;

public class methodoverloading {
    public static void gal(int x,int y) {
                System.out.println((x*y)/x+(x-y)+(x+y));
        }
    public static void gal1() {
        System.out.println("Aaryastark");
    }
    public static void main(String[] args) {
        methodoverloading m =new methodoverloading();
        m.gal(70,65);
        m.gal1();
    }
}
