import java.util.HashSet;
import java.util.TreeSet;

public class ProductCategories {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Electronics");
        hashSet.add("Clothing");
        hashSet.add("Books");
        hashSet.add("Electronics");
        hashSet.add("Clothing");

        System.out.println("HashSet Categories:");
        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("\nTreeSet Categories in Alphabetical Order:");
        System.out.println(treeSet);
    }
}
