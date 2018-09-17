package video;

import interfaces.VideoDecorator;
import interfaces.IVideo;
import video.advertising.Ad1;
import video.advertising.Ad2;
import video.codec.MP4;
import video.codec.OGV;

public class Run {

    public static void main(String[] args) {
        IVideo video1 = new Video1();
        video1.setCodec(new MP4());
        VideoDecorator advertisingVideo1 = new Ad1(new Ad2(video1));
        advertisingVideo1.play();
        
        System.out.println("-----------------------------------");
        
        IVideo video2 = new Video2();
        video2.setCodec(new OGV());
        VideoDecorator advertisingVideo2 = new Ad1(video2);
        advertisingVideo2.play();
    }
    
}
