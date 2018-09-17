package musicabridge;

import interfaces.IMusica;

public class BohemianRaphsody extends IMusica{

    @Override
    public void play() {
        codec.usarCodec();
        System.out.println("Bohemian Raphsody tocando usando codec: " + codec.getName() + "...");
    }
}
