package estructurales.decorate;

public class SecureDecorator extends CreditDecorator{

    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
       decoratedCredit.showCredit();
       config();
    }

    private void config(){
        System.out.println("La tarjeta ha sido configurada con SEGURIDAD MAXIMA");
    }
}
