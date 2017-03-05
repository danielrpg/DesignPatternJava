package singleton;

/**
 * Created by dany on 04/03/2017.
 */
public class Jugador {
    private Marciano marciano;

    public Jugador(){
        marciano = Marciano.getMarciano();
    }

    public void derriveMartian(){
        marciano.deriveMartian();
    }
}
