package estructurales.decorate;

public class RunDecorador {

    public static void main(String[] args) {
        Credit gold = new Gold();

        Credit blackWithInternationalPayment = new Black();
        blackWithInternationalPayment = new InternationalPaymentDecorator(blackWithInternationalPayment);

        Credit goldWithSecureAndInternationalPayment = new Gold();
        goldWithSecureAndInternationalPayment = new SecureDecorator(goldWithSecureAndInternationalPayment);
        //goldWithSecureAndInternationalPayment = new InternationalPaymentDecorator(goldWithSecureAndInternationalPayment);

        System.out.println("---------------- Tarjeta gold sin Configuracion");
        gold.showCredit();
        System.out.println("---------------- Tarjeta black con Configuracion");
        blackWithInternationalPayment.showCredit();
        System.out.println("---------------- Tarjeta gold2 con Configuracion");
        goldWithSecureAndInternationalPayment.showCredit();


    }
}
