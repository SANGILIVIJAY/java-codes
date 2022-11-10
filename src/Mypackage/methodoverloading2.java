package Mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class methodoverloading2 {
    public static void galgadot()throws IOException{
        int x,y;
        System.out.println("Enter two number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        x=Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        y=Integer.parseInt(br.readLine());   // String.parseString()
        if (x > y) {
            System.out.println(x+y);
        }
        else if (x < y) {
            System.out.println(x-y);
        }
        else if (x == y) {
            System.out.println(x*y);
        }
        else {
            System.out.println("other");
        }
    }
        public static void main(String[] args)throws IOException{
        methodoverloading2 m =new methodoverloading2();
        m.galgadot();
    }
}
