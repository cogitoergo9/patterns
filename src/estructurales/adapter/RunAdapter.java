package estructurales.adapter;

public class RunAdapter {
    public static void main(String[] args) {
        CreditCard crediCard = new CreditCard();
        crediCard.pay("classic");
        crediCard.pay("gold");
        crediCard.pay("black");
        crediCard.pay("silver");
    }
}
