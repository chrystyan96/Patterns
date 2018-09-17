package pontoadapter;

import interfaces.ITarget;

public class Adapter implements ITarget{
    
    private Adaptee adaptee = new Adaptee();

    @Override
    public void move(int x, int y) {
        System.out.println("Adaptee ORIGINAL X: " + adaptee.getX());
        System.out.println("Adaptee ORIGINAL Y: " + adaptee.getY());
        System.out.println("X ORIGINAL: " + x + " Y ORIGINAL: " + y);
        
        x = x - adaptee.getX();
        y = y - adaptee.getY();
        
        System.out.println("X: " + x + " Y: " + y);
        
        adaptee.mover(x, y);
        
        System.out.println("Adaptee X: " + adaptee.getX());
        System.out.println("Adaptee Y: " + adaptee.getY());
    }
}
