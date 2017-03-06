package factory;

/**
 * Created by dany on 05/03/2017.
 */
public class InheritanceAbstract extends ClassAbstract {

    @Override
    public void goodbye(){
        System.out.println("Goodbye "+ super.name);
    }

    public InheritanceAbstract(){
        getName("Daniel");
        hello();
        goodbye();
    }

    public void getName(String name){
        super.name = name;
    }
}
