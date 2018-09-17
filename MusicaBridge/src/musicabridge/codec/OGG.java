package musicabridge.codec;

import interfaces.ICodec;

public class OGG implements ICodec{

    @Override
    public boolean usarCodec() {
        return true;
    }

    @Override
    public String getName() {
        return "OGG";
    }
}
