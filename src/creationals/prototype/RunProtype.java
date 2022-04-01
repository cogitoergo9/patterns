package creationals.prototype;

public class RunProtype {

    public static void main(String[] args) {

        PrototypeFactory.loadCards();
        try{
            PrototypeCard visa = PrototypeFactory.getInstance(PrototypeFactory.CardType.VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(PrototypeFactory.CardType.AMEX);
            amex.getCard();
        }
        catch (CloneNotSupportedException cne){
            cne.printStackTrace();
        }
    }
}
