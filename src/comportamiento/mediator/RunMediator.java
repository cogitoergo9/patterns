package comportamiento.mediator;

public class RunMediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleage1 user1 = new ConcreteColleage1(mediator);
        ConcreteColleage2 user2 = new ConcreteColleage2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola soy el user 1 unas chelas!!");
        user2.send("Hola user1, Soy user 2 si jalo");

    }
}
