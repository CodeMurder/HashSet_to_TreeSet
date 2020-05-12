import java.util.*;

public class Main {

    public static void main(String[] args) {


        // Створюємо HashSet
        HashSet<String> h_set = new HashSet<String>();
        //заповнюємо його за допомогою методу add()
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);

        //перетворюємо HashSet на TreeSet
        Set<String> tree_set = new TreeSet<String>(h_set);


        System.out.println("TreeSet elements: ");
        for (String element : tree_set) {
            System.out.println(element);
        }


    }
}
