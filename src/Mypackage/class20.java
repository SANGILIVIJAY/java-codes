package Mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class20 {
    public static void main(String[] args) throws IOException {
        int ticket;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        ticket=Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        if (ticket>=100 && ticket<=120){
            System.out.println("lets go for a movie BEAST");
        }
        else if (ticket>=180 && ticket<=199){
            System.out.println("lets not go for a movie BEAST");
        }
        else if (ticket>=200 && ticket<=250){
            System.out.println("lets go for a movie MASTER ");
        }
        else {
            System.out.println("not eligible");
        }

    }
}