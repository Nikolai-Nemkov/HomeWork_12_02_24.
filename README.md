# HomeWork_12_02_24.

Tекст задачи:

Реализуйте класс Товар, содержащий данные о товаре,

и ТорговыйАвтомат, содержащий в себе методы initProducts

(List ) сохраняющий в себе список исходных продуктов

и getProduct(String name)

Сделать класс Товар абстрактным, создать нескольких наследников

(к примеру: БутылкаВоды), сделать интерфейсом

ТорговыйАвтомат и реализовать класс какого то одного

типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

Домашнее задание.

Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.

Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать

перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт

соответствующий имени, объему и температуре

В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и

воспроизвести логику заложенную в программе

Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.


# Product.java



public abstract class Product {
    private String name;
    private int cost;
    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

# BotteOfWater


public class BottleOfWater extends Product{

    private double volume;
    public BottleOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                "volume=" + volume +
                '}';
    }
}

# VendingMachine



import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {     // торговый автомат

    void initProduct(List <Product> List);

    void initProducts(List<Product> List);

    Product getProduct(String name);

}















