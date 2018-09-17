package musicabridge;

import interfaces.IMusica;

public class BackInBlack extends IMusica{

    @Override
    public void play() {
        codec.usarCodec();
        System.out.println("Back In Black tocando usando codec: " + codec.getName() + "...");
    }
}
