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
















