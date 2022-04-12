package comportamiento.command;

public class CrediCardActivateCommand implements  Command{

    private CreditCard creditCard;

    public CrediCardActivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        this.creditCard.sendPinNumberToCustomer();
        this.creditCard.activate();
        this.creditCard.sendSMSToCustomerActivate();
    }
}
