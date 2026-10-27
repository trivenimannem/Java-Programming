import java.util.HashMap;
import java.util.TreeMap;

public class ProductPrice {
    public static void main(String[] args) {

        HashMap<Integer, Double> hashMap = new HashMap<>();

        hashMap.put(103, 1500.0);
        hashMap.put(101, 800.0);
        hashMap.put(102, 1200.0);
        hashMap.put(104, 2000.0);

        int productId = 102;

        if (hashMap.containsKey(productId)) {
            System.out.println("Product " + productId + " price: " + hashMap.get(productId));
        } else {
            System.out.println("Product not found");
        }

        hashMap.put(102, 1300.0);

        System.out.println("Updated price of product 102: " + hashMap.get(102));

        TreeMap<Integer, Double> treeMap = new TreeMap<>(hashMap);

        System.out.println("\nProducts in sorted order:");
        System.out.println(treeMap);
    }
}
