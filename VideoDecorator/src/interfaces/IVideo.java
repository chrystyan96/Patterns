package interfaces;

public abstract class IVideo {
    protected ICodec codec;
    
    public abstract void play();
    
    public void setCodec(ICodec codec) {
        this.codec = codec;
    }
}
