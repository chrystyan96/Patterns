package moveisbridge;

import interfaces.IFerramenta;
import interfaces.IMovel;
import moveisbridge.ferramenta.ChaveDeFenda;
import moveisbridge.ferramenta.Lixa;
import moveisbridge.ferramenta.Serrote;

public class Run {

    public static void main(String[] args) {
        IMovel mesa = new Mesa();
        IMovel cadeira = new Cadeira();
        IFerramenta serrote = new Serrote();
        IFerramenta chaveDeFenda = new ChaveDeFenda();
        IFerramenta lixa = new Lixa();
        
        mesa.setFerramenta(serrote);
        mesa.setFerramenta(chaveDeFenda);
        mesa.setFerramenta(lixa);
        mesa.construir();
        System.out.println("------------------------------------------------");
        cadeira.setFerramenta(serrote);
        cadeira.setFerramenta(lixa);
        cadeira.construir();
    }
}
