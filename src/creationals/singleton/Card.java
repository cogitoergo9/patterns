package creationals.singleton;

import java.io.Serializable;

public class Card implements Serializable {
    private static Card INSTANCE;
    private String carNumber;

    private Card(){}

    public synchronized static Card getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Card();
        }
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }


    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
