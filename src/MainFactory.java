import factory.InheritanceAbstract;
import factory.Rectangle;
import factory.Shape;

/**
 * Created by dany on 05/03/2017.
 */
public class MainFactory {

    public static void main(String... args){
        //InheritanceAbstract ia = new InheritanceAbstract();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}
