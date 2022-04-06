package estructurales.decorate;

public class InternationalPaymentDecorator extends CreditDecorator{
    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternacional();
    }

    private void configInternacional(){
        System.out.println("La tarjeta ha sido configurada para PAGOS INTERNACIONALES");
    }
}

