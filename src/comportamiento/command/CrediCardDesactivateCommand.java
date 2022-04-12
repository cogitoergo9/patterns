package comportamiento.command;

public class CrediCardDesactivateCommand implements Command{

    private CreditCard creditCard;

    public CrediCardDesactivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        this.creditCard.desactivate();
        this.creditCard.sendSMSToCustomerDeactive();
    }


}
