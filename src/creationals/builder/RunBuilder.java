package creationals.builder;

public class RunBuilder {
    public static void main(String[] args){
        Card visa = new Card.CardBuilder("VISA", "000 111 222 333")
                .name("Gabriel Castillo")
                .build();

        System.out.println(visa);

        Card amex = new Card.CardBuilder("AMEX", "111 888 666 999")
                .build();

        System.out.println(amex);
    }
}
