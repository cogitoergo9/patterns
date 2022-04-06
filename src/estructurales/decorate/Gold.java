package estructurales.decorate;

public class Gold implements Credit{
    @Override
    public void showCredit() {
        System.out.println("El credito es de 50 mil");
    }
}
