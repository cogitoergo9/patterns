package comportamiento.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> col = new HashMap<>();

        col.put("VISA", "122");
        col.put("AMEX", "456");
        col.put("BANCOMER", "562");

        for(Map.Entry<String,String> tarjeta :  col.entrySet()){
            System.out.println(tarjeta.getKey());
            System.out.println(tarjeta.getValue());
        }

        Iterator iterator = col.entrySet().iterator();

        while (iterator.hasNext()){
            Object tarjeta = iterator.next();
            System.out.println(tarjeta.toString());
        }

    }
}
