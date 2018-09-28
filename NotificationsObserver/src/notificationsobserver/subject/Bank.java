package notificationsobserver.subject;

import notificationsobserver.interfaces.ISubject;

public class Bank extends ISubject{
    String subjectState;
    
    @Override
    public String getState() {
        return subjectState;
    }
    
    @Override
    public void setState(String state) {
        subjectState = state;
        notifyObserver("Bank");
    }
}
