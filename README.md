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


# VendingMachineBottleOfWater

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachineBottleOfWater implements VendingMachine {
    List<Product> productList = new ArrayList<>();
    private List<Product> list;

    public void addBottleOfWater(BottleOfWater bottle) {
        productList.add(bottle);
    }

    @Override
    public void initProducts(List<Product> List) {
        productList = list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product i : productList) {
            if (i.getName().equals(name))
                return i;

        }
        return null;
    }

}


# main

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        VendingMachineBottleOfWater machine = new VendingMachineBottleOfWater() {
            @Override
            public void initProduct(List<Product> List) {

            }
        };
        machine.addBottleOfWater(new BottleOfWater("Вода1", 100, 5));
        machine.addBottleOfWater(new BottleOfWater("Вода2", 100, 0.5));
        machine.addBottleOfWater(new BottleOfWater("Вода3", 100, 1));
        machine.addBottleOfWater(new BottleOfWater("Вода4", 100, 500));

        System.out.println(machine.getProduct("Вода2"));
    }
}
















