package notificationsobserver.observer;

import notificationsobserver.interfaces.IObserver;
import notificationsobserver.interfaces.ISubject;

public class User1 implements IObserver{
    private String observerState;

    @Override
    public void Update(ISubject subject) {
        try {
            observerState = subject.getState();
            System.out.println("User 1: " + observerState);
        } catch (Exception ex) {
            System.err.println("Erro no getState do ISubject: " + ex.getMessage());
        }
    }
}
