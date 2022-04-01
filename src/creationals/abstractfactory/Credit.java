package creationals.abstractfactory;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pagando con Credito";
    }
}
