package factory;

/**
 * Created by dany on 05/03/2017.
 */
public abstract class Shape {
    protected int positionX;
    protected int positionY;

    protected void move (int newX, int newY){
        positionX = newX;
        positionY = newY;
    }

    protected void whereAre(){
        String lugar = "I am x: "+ positionX +" en Y: "+positionY;
        System.out.println(lugar);
    }

    public abstract void draw();
    public abstract void resize();
}
