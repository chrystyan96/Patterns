package interfaces;

import interfaces.IVideo;

public class VideoDecorator extends IVideo{
    protected IVideo decorated;
    
    protected VideoDecorator() {
    
    }
    
    protected VideoDecorator(IVideo decorated) {
        this.decorated = decorated;
    }

    @Override
    public void play() {
        decorated.play();
    }
}
