import java.util.ArrayList;
import java.util.LinkedList;

public class StudentWaitingList {
    public static void main(String[] args) {

       
        ArrayList<String> arrayList = new ArrayList<>();

       
        arrayList.add("Rahul");
        arrayList.add("Priya");
        arrayList.add("Anil");
        arrayList.remove("Priya");

        
        System.out.println("ArrayList Waiting List:");
        System.out.println(arrayList);

      
        LinkedList<String> linkedList = new LinkedList<>();

       
        linkedList.add("Sneha");
        linkedList.add("Kiran");
        linkedList.add("Arjun");

      
        linkedList.remove("Kiran");

     
        System.out.println("\nLinkedList Waiting List:");
        System.out.println(linkedList);
    }
}
