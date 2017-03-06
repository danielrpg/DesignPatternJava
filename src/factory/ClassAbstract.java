package factory;

/**
 * Created by dany on 05/03/2017.
 */
public abstract class ClassAbstract
{
    public String name;

    public void hello(){
        System.out.println("Hello :"+ name);
    }

    public abstract void goodbye();
}
