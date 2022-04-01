package creationals.prototype;

public class Visa implements PrototypeCard{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Tarjeta de visa clonada");
        return (Visa) super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta de visa");
    }
}
