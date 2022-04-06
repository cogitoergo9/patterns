package estructurales.decorate;

public class Black implements Credit{

    @Override
    public void showCredit() {
        System.out.println("El credito es de 1 Millon");
    }
}
