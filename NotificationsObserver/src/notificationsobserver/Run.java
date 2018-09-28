package notificationsobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import notificationsobserver.interfaces.IObserver;
import notificationsobserver.interfaces.ISubject;
import notificationsobserver.observer.User1;
import notificationsobserver.observer.User2;
import notificationsobserver.observer.User3;
import notificationsobserver.subject.Bank;
import notificationsobserver.subject.Game;
import notificationsobserver.subject.Youtube;

public class Run {

    public static void main(String[] args) {
        IObserver observer1 = new User1();
        IObserver observer2 = new User2();
        IObserver observer3 = new User3();
        ISubject gameDokkan = new Game();
        ISubject bankBradesco = new Bank();
        ISubject youtubeNostalgia = new Youtube();
        List<IObserver> observerList1 = new ArrayList<IObserver>();
        List<IObserver> observerList2 = new ArrayList<IObserver>();
        List<IObserver> observerList3 = new ArrayList<IObserver>();
                
        //observerList1
        observerList1.add(observer1);
        observerList1.add(observer3);
        gameDokkan.addSubject("Game", observerList1);
        
        //observerList2
        observerList2.add(observer2);
        bankBradesco.addSubject("Bank", observerList2);
        
        //observerList3
        observerList3.add(observer1);
        observerList3.add(observer2);
        observerList3.add(observer3);
        youtubeNostalgia.addSubject("Youtube", observerList3);   
        
        //Test
        try {
            System.out.println("Game notification:");
            gameDokkan.setState("Novo festival ativo, use suas Dragon Stones para conseguir novos personagens!");
            System.out.println();
            System.out.println("Bank notification:");
            bankBradesco.setState("Teste nossa nova funcionalidade de pagamento!");
            System.out.println();
            System.out.println("Youtube notification:");
            youtubeNostalgia.setState("Novo vídeo do canal no ar!");
        } catch (Exception ex) {
            System.out.println("Erro no setState: " + ex.getMessage());
        }
    }
}
