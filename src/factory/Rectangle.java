package factory;

/**
 * Created by dany on 05/03/2017.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        move(5,8);
        whereAre();
    }

    @Override
    public void draw(){
        System.out.println("I am drawing a rectangle.");
    }

    @Override
    public void resize(){
        System.out.println("I am more size");
    }
}
