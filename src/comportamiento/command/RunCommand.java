package comportamiento.command;

public class RunCommand {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        CreditCard creditCardDesactivate = new CreditCard();

        CredicardInvoker invoker = new CredicardInvoker();
        invoker.setCommand(new CrediCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("--------------------------");
        invoker.setCommand(new CrediCardDesactivateCommand(creditCardDesactivate));
        invoker.run();
    }
}
