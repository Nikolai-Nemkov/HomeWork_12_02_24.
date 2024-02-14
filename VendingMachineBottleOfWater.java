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
