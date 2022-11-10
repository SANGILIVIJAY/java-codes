package Mypackage;
class ed{    // parent
    int d=4;

    public int cal(int x, int y){

        return x+y;
    }
}

class ed1 extends ed{      //child
    int sum=d+4;

    public int cal_adv(int x, int y){

        return x-y;
    }
}
class ed2 extends ed1{    // parent

    public int cals(int x, int y){
        return x*y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        ed2 a=new ed2();   // object of child


        System.out.println(a.cal(2,5));
    }

}
