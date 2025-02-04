import java.util.*;

public class SetExample  {
    public static void main(String[] args) {
        // Create a HashSet
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // Iterate using for-loop
        for (Integer element : set) {
            System.out.println("For-loop: " + element);
        }

        // Iterate using forEach
        set.forEach(element -> {
            System.out.println("forEach: " + element);
        });

        // Iterate using Iterator
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Iterator: " + element);
        }

        // Check if an element exists
        System.out.println("Contains 2: " + set.contains(2));

        // Remove an element
        set.remove(2);
        System.out.println("After removing 2: " + set);

        // Convert to list and sort
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}