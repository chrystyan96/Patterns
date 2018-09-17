package products;

import interfaces.IComponent;

public class Beans implements IComponent{
    
    private double price;
    
    public Beans(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public void changePrice(double percentPrice) {
        price += price * percentPrice;
    }

    @Override
    public boolean add(IComponent grupo) throws Exception {
        throw new Exception("Not supported.");
    }

    @Override
    public boolean remove(IComponent grupo) throws Exception {
        throw new Exception("Not supported.");
    }

    @Override
    public IComponent getChild(int child) throws Exception {
        throw new Exception("Not supported.");
    }
}
