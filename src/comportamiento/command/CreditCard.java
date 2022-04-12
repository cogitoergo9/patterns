package comportamiento.command;

public class CreditCard {

    public void sendPinNumberToCustomer(){
        System.out.println("El pin number ha sido enviado al cliente.");
    }

    public void sendSMSToCustomerActivate(){
        System.out.println("Enviando SMS al cliente informando su tarjeta ha sido activada");
    }

    public void sendSMSToCustomerDeactive(){
        System.out.println("Enviando SMS al cliente informando su tarjeta ha sido desactivada");
    }

    public void activate(){
        System.out.println("La tarjeta ha sido activada");
    }

    public void desactivate(){
        System.out.println("La tarjeta ha sido desactivada");
    }


}
