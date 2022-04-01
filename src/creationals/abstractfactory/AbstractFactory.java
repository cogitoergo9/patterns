package creationals.abstractfactory;

public interface AbstractFactory<T>{

    T create(String type);
}
