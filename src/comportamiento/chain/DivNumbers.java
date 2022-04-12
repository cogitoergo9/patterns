package comportamiento.chain;

public class DivNumbers implements Chain {
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public int calculate(Numbers request) {
        if ("div".equals(request.getOperation())) {
            return request.getNumber1() / request.getNumber2();
        }
        return Integer.MAX_VALUE;
    }
}
