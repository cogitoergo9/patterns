package creationals.prototype;

public class Amex implements PrototypeCard{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Tarjeta de amex clonada");
        return (Amex) super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta de Amex");
    }
}
