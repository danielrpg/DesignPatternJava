package singleton;

/**
 * Created by dany on 04/03/2017.
 */
public final class Marciano {
    private static final Marciano marciano = new Marciano();
    private static int cant;

    private Marciano(){
        cant = 10;
    }

    public static Marciano getMarciano(){
        return marciano;
    }

    public static void deriveMartian(){
        if(cant>0){
            cant--;
            System.out.println("I am the good, derrive a martian");
        }
    }

    public static void createMartian(){
        if(cant>0){
            cant++;
            System.out.println("I am the bad, to create an martian");
        }
    }

    public static void howMuchAre(){
        if(cant>0){
            System.out.println("Remain in the game: "+cant+" martians");
        }else{
            System.out.println("Congratulations, you've won!! ");
        }
    }
}
