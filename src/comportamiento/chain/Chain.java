package comportamiento.chain;

public interface Chain {

    void setNextChain(Chain nextChain);
    int calculate(Numbers request);
}
