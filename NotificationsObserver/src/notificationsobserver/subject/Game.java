package notificationsobserver.subject;

import notificationsobserver.interfaces.ISubject;

public class Game extends ISubject{
    private String subjectState;
    
    @Override
    public String getState() {
        return subjectState;
    }
    
    @Override
    public void setState(String state) {
        subjectState = state;
        notifyObserver("Game");
    }
}
