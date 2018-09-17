package market;

import java.util.ArrayList;
import interfaces.IComponent;

class Component implements IComponent{
    
    public ArrayList<IComponent> grupos = new ArrayList<IComponent>();

    public boolean add(IComponent grupo) {
        try {
            return grupos.add(grupo);
        } catch (Exception e) {
            System.out.println("Erro!");
        }
        return false;
    }
    
    public boolean remove(IComponent grupo) {
        try {
            return grupos.remove(grupo);
        } catch (Exception e) {
            System.out.println("Erro!");
        }
        return false;
    }
    
    public IComponent getChild(int child) {
        try {
            return grupos.get(child);
        } catch (Exception e) {
            System.out.println("Erro!");
        }
        return null;
    }

    @Override
    public void changePrice(double percentPrice) {
        for(IComponent grupo : grupos) {
            grupo.changePrice(percentPrice);
        }
    }

    @Override
    public double getPrice() throws Exception {
        throw new Exception("Not supported.");
    }

}
