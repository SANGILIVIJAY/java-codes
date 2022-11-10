package Mypackage;
class eren{    // access modifier
    int id,ticket,country; String surname;
    public void superman(){
        System.out.println(id);
        System.out.println(surname);
    }
    public void  batman(){
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
        switch (country){

            case  1:
                // operation 1
                System.out.println("America");
                break;
            case  2:
                //operation 2
                System.out.println("France");
                break;
            case  3:
                //operation 3
                System.out.println("Africa");
                break;
            case  4:
                //operation 4
                System.out.println("India");
                break;
            case  5:
                System.out.println("Japan");
                break;

            default:
                System.out.println("you have entered a wrong country");
        }

    }
}
public class accessmodifier {
    public static void main(String[] args) {
        eren su=new eren();
        su.id=500; su.surname="eren"; su.ticket=200; su.country=4;
        su.superman();
        su.batman();
    }
}
