package singleton;

/**
 * Created by dany on 04/03/2017.
 */
public class Computadora {
    private Marciano marciano;

    public Computadora(){
        marciano =  Marciano.getMarciano();
    }

    public void createMartian(){
        marciano.createMartian();
    }
}
