package video.advertising;

import interfaces.IVideo;
import interfaces.VideoDecorator;

public class Ad1 extends VideoDecorator{
    
    public Ad1(IVideo decorated) {
        super(decorated);
    }
    
    public void play() {
        System.out.println(" | Advertising 1 is playing... | ");
        decorated.play();
    }
}
