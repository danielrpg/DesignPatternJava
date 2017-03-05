package singleton;

/**
 * Created by dany on 04/03/2017.
 */
public final class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("Hello, has been created only once!");
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
