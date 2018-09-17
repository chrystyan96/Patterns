package musicabridge.codec;

import interfaces.ICodec;

public class WAV implements ICodec{

    @Override
    public boolean usarCodec() {
        return true;
    }

    @Override
    public String getName() {
        return "WAV";
    }
}
