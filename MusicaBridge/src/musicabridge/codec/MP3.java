package musicabridge.codec;

import interfaces.ICodec;

public class MP3 implements ICodec{

    @Override
    public boolean usarCodec() {
        return true;
    }

    @Override
    public String getName() {
        return "MP3";
    }
}
