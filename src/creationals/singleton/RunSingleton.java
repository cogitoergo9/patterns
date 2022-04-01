package creationals.singleton;

public class RunSingleton {
    public static void main(String[] args) {
        Card.getINSTANCE().setCarNumber("000 222 333");
        System.out.println(Card.getINSTANCE().getCarNumber());
    }
}
