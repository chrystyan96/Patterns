package notificationsobserver.subject;

import notificationsobserver.interfaces.ISubject;

public class Youtube extends ISubject{
    String subjectState;
    
    public String getState() {
        return subjectState;
    }
    
    public void setState(String state) {
        subjectState = state;
        notifyObserver("Youtube");
    }
}
