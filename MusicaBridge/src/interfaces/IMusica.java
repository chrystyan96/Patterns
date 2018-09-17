package interfaces;

public abstract class IMusica {
    protected ICodec codec;
    
    public void setCodec(ICodec codec) {
        this.codec = codec;
    }
    
    public abstract void play();
}
