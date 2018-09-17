package musicabridge;

import interfaces.ICodec;
import interfaces.IMusica;
import musicabridge.codec.MP3;
import musicabridge.codec.OGG;
import musicabridge.codec.WAV;

public class Run {

    public static void main(String[] args) {
        IMusica bohemian = new BohemianRaphsody();
        IMusica backInBlack = new BackInBlack();
        ICodec mp3 = new MP3();
        ICodec wav = new WAV();
        ICodec ogg = new OGG();
        
        bohemian.setCodec(mp3);
        bohemian.play();
        System.out.println("-------------------------------------");
        backInBlack.setCodec(ogg);
        backInBlack.play();
    }
    
}
