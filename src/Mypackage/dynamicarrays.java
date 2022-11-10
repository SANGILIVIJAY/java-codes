package Mypackage;

public class dynamicarrays {
    public static int prod(int ...numbers){    // varchar   int[] numbers={2,4,5,4,5}
        int product=1;
        for (int j=0; j<numbers.length; j++){   // 0,1,2,3,4
            product=product*numbers[j];
        }return product;
    }
    public static void main(String[] args) {
        dynamicarrays cw=new dynamicarrays();
        // I want product of  numbers. 1,2,3,4,5,6
        System.out.println( cw.prod(1,2,3,4,5,6));   // array and array list // static and other one is dynamic

    }
}
