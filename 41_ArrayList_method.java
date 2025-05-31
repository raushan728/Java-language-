import java.util.*;

public class ArrayList_method {
    public static void main(String[] args) {

        // ArrayList<Integer> creation
        ArrayList<Integer> numbers = new ArrayList<>();

        // add(E e): Add element to end
        numbers.add(10); // [10]
        numbers.add(20); // [10, 20]
        numbers.add(30); // [10, 20, 30]
        System.out.println("// add(E e): " + numbers);

        // add(int index, E element): Insert at index
        numbers.add(1, 15); // [10, 15, 20, 30]
        System.out.println("// add(int, E): " + numbers);

        // addAll(Collection<? extends E> c): Add all from another collection
        ArrayList<Integer> moreNumbers = new ArrayList<>(Arrays.asList(40, 50));
        numbers.addAll(moreNumbers); // [10, 15, 20, 30, 40, 50]
        System.out.println("// addAll(Collection): " + numbers);

        // addAll(int index, Collection<? extends E> c): Add all at index
        ArrayList<Integer> extraNumbers = new ArrayList<>(Arrays.asList(60, 70));
        numbers.addAll(2, extraNumbers); // [10, 15, 60, 70, 20, 30, 40, 50]
        System.out.println("// addAll(int, Collection): " + numbers);

        // get(int index): Get element at index
        int secondNum = numbers.get(1); // 15
        System.out.println("// get(1): " + secondNum);

        // set(int index, E element): Replace element at index
        numbers.set(0, 5); // [5, 15, 60, 70, 20, 30, 40, 50]
        System.out.println("// set(0, 5): " + numbers);

        // remove(int index): Remove element at index
        numbers.remove(3); // removes 70
        System.out.println("// remove(3): " + numbers);

        // remove(Object o): Remove first occurrence of object
        numbers.remove(Integer.valueOf(40));
        System.out.println("// remove(Integer.valueOf(40)): " + numbers);

        // removeAll(Collection<?> c): Remove all matching elements
        numbers.removeAll(Arrays.asList(60, 50));
        System.out.println("// removeAll([60, 50]): " + numbers);

        // contains(Object o): Check if element exists
        boolean has20 = numbers.contains(20);
        System.out.println("// contains(20): " + has20);

        // indexOf(Object o): First index of element
        int index30 = numbers.indexOf(30);
        System.out.println("// indexOf(30): " + index30);

        // lastIndexOf(Object o): Last index of element
        numbers.add(20);
        int lastIndex20 = numbers.lastIndexOf(20);
        System.out.println("// lastIndexOf(20): " + lastIndex20);

        // isEmpty(): Check if list is empty
        System.out.println("// isEmpty(): " + numbers.isEmpty());

        // size(): Number of elements
        System.out.println("// size(): " + numbers.size());

        // toArray(): Convert to array
        Object[] arr = numbers.toArray();
        System.out.println("// toArray(): " + Arrays.toString(arr));

        // subList(int fromIndex, int toIndex): Get sublist
        System.out.println("// subList(1, 3): " + numbers.subList(1, 3));

        // clear(): Remove all elements
        ArrayList<Integer> temp = new ArrayList<>(numbers);
        temp.clear();
        System.out.println("// clear(): " + temp);

        // clone(): Shallow copy
        ArrayList<Integer> cloned = (ArrayList<Integer>) numbers.clone();
        System.out.println("// clone(): " + cloned);

        // iterator(): Get iterator
        Iterator<Integer> it = numbers.iterator();
        System.out.print("// iterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // listIterator(): Get list iterator
        ListIterator<Integer> lit = numbers.listIterator();
        System.out.print("// listIterator(): ");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();

        // removeIf(Predicate): Remove by condition (remove numbers < 20)
        numbers.removeIf(num -> num < 20);
        System.out.println("// removeIf(num < 20): " + numbers);

        // replaceAll(UnaryOperator): Replace all elements
        numbers.replaceAll(num -> num * 2);
        System.out.println("// replaceAll(num * 2): " + numbers);

        // retainAll(Collection): Keep only specified elements
        numbers.retainAll(Arrays.asList(40));
        System.out.println("// retainAll([40]): " + numbers);

        // ensureCapacity(int): Ensure capacity (no visible effect)
        numbers.ensureCapacity(20);

        // trimToSize(): Trim capacity (no visible effect)
        numbers.trimToSize();
    }
}
