package Mypackage;

public class arrays {
    public static void main(String[] args) {
        /*int[] i=new int[5];
        i[0]=56;i[1]=55;i[2]=29;i[3]=25;i[4]=52;
        for (int j=0;j<5;j++){
            System.out.println(i[j]);*/
        String[] j=new String[5];
        j[0]="hola";
        j[1]="hjko";
        j[2]="ljko";
        j[3]="pjko";
        j[4]="ojko";
        System.out.println(j.length);
        for(int i=0;i<=j.length-1;i++){
            System.out.println(j[i]);
        }
    }
}
