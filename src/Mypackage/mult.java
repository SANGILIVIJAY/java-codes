package Mypackage;

public class mult {
    public static void gal(int x,int y) {
            if (x > y) {
                System.out.println(x * y);
            }
            else {
                System.out.println(x / y);
            }
        }
    public static void main(String[] args) {
        gal(10,5);
    }
}
