package interfaces;

public interface IComponent {
    public abstract boolean add(IComponent grupo) throws Exception;
    public abstract boolean remove(IComponent grupo) throws Exception;
    public abstract IComponent getChild(int child) throws Exception;
    public abstract void changePrice(double percentPrice);
    public abstract double getPrice() throws Exception ;
}