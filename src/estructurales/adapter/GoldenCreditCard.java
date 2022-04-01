package estructurales.adapter;

public class GoldenCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        //no implementar
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Tarjeta Gold: pagando con seguridad BAJA");
    }
}
