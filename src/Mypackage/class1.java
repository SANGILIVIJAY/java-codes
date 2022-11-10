package Mypackage;

public class class1 {
    public static void main(String[] args) {
        /*int i=4555;
        System.out.println(i);*/
        int[] i={2,3,4,5};//length of the  array
        int sum=2;
        for(int j=0;j<i.length;j++){//j=0,1,2----> 3 iteration will be there
            sum=sum+i[j];
        }
        System.out.println(sum);

    }

}
