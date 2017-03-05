import singleton.Computadora;
import singleton.Jugador;
import singleton.Marciano;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Marciano marciano = Marciano.getMarciano();
        Computadora computadora = new Computadora();
        Jugador jugador = new Jugador();
        Scanner sc = new Scanner(System.in);
        int disparos;
        do{
            disparos = sc.nextInt();
            for (int i=0; i<disparos;i++){
                jugador.derriveMartian();
            }
            computadora.createMartian();
            marciano.howMuchAre();
        } while (disparos!=0);
    }
}
