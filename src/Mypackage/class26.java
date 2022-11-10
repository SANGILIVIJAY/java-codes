package Mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class26 {
    public static void main(String[] args) throws IOException {
        int day;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        day=Integer.parseInt(br.readLine());// it will take input from the user
        switch (day){

            case  1:
                // operation 1
                System.out.println("monday");
                break;
            case  2:
                //operation 2
                System.out.println("Tuesday");
                break;
            case  3:
                //operation 3
                System.out.println("wednesday");
                break;
            case  4:
                //operation 4
                System.out.println("Thursday");
                break;
            case  5:
                System.out.println("Friday");
                break;
            case  6:
                System.out.println("saturday");
                break;
            case  7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("you have entered a wrong day");
        }

    }
}