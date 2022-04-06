package estructurales.bridge;

public class UnSecureCreditCard implements ICreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado sin Seguridad");
    }
}
