package pontoadapter;

public class Adaptee {
    private int pontoX = 4;
    private int pontoY = 9;
    
    public void mover(int deltaX, int deltaY) {
        pontoX += deltaX;
        pontoY += deltaY;
    } 
    
    public int getX() {
        return pontoX;
    }
    
    public int getY() {
        return pontoY;
    }
}
