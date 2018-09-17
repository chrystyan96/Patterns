package moveisbridge;

import interfaces.IFerramenta;
import interfaces.IMovel;
import java.util.ArrayList;

public class Cadeira implements IMovel{
    private ArrayList<IFerramenta> ferramentas = new ArrayList<IFerramenta>();

    @Override
    public void setFerramenta(IFerramenta ferramenta) {
        ferramentas.add(ferramenta);
    }

    @Override
    public void construir() {
        if(ferramentas.size() > 0) {
            for (IFerramenta ferramenta : ferramentas) {
                ferramenta.usarFerramenta();
            }
            System.out.println("Cadeira construída!");
        } else {
            System.out.println("Sem ferramentas para construir...");
        }
    }    
}
