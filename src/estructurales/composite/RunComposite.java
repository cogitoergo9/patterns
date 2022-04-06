package estructurales.composite;

public class RunComposite {
    public static void main(String[] args) {
        AccountComponent currentAccount = new CurrentAccount(1000.00, "Monse");
        AccountComponent savingAccount = new SavingAccount(20000.00, "Monse");

        AccountComposite accountComposite = new AccountComposite();
        accountComposite.addAccount(currentAccount);
        accountComposite.addAccount(savingAccount);

        accountComposite.showAccountName();
        accountComposite.getAmount();
    }
}
