package video.advertising;

import interfaces.IVideo;
import interfaces.VideoDecorator;

public class Ad2 extends VideoDecorator{
    
    public Ad2(IVideo decorated) {
        super(decorated);
    }

    public void play() {
        decorated.play();
        System.out.println(" | Advertising 2 is playing... | ");
    }    
}
