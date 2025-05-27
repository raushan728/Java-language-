import java.util.*;

public class LinkedList_method {

    public static void main(String[] args) {
        // LinkedList<Integer> creation
        LinkedList<Integer> numbers = new LinkedList<>();

        // add(E e): Add element to end
        numbers.add(10); // [10]
        numbers.add(20); // [10, 20]
        numbers.add(30); // [10, 20, 30]
        System.out.println("// add(E e): " + numbers);

        // add(int index, E element): Insert at index
        numbers.add(1, 15); // [10, 15, 20, 30]
        System.out.println("// add(int, E): " + numbers);

        // addFirst(E e): Add at beginning
        numbers.addFirst(5); // [5, 10, 15, 20, 30]
        System.out.println("// addFirst(5): " + numbers);

        // addLast(E e): Add at end
        numbers.addLast(35); // [5, 10, 15, 20, 30, 35]
        System.out.println("// addLast(35): " + numbers);

        // addAll(Collection<? extends E> c): Add all from another collection
        LinkedList<Integer> moreNumbers = new LinkedList<>(Arrays.asList(40, 50));
        numbers.addAll(moreNumbers); // [5, 10, 15, 20, 30, 35, 40, 50]
        System.out.println("// addAll(Collection): " + numbers);

        // get(int index): Get element at index
        int secondNum = numbers.get(1); // 10
        System.out.println("// get(1): " + secondNum);

        // getFirst(): Get first element
        System.out.println("// getFirst(): " + numbers.getFirst());

        // getLast(): Get last element
        System.out.println("// getLast(): " + numbers.getLast());

        // set(int index, E element): Replace element at index
        numbers.set(0, 7); // [7, 10, 15, 20, 30, 35, 40, 50]
        System.out.println("// set(0, 7): " + numbers);

        // remove(int index): Remove element at index
        numbers.remove(3); // removes 20
        System.out.println("// remove(3): " + numbers);

        // remove(Object o): Remove first occurrence of object
        numbers.remove(Integer.valueOf(40));
        System.out.println("// remove(Integer.valueOf(40)): " + numbers);

        // removeFirst(): Remove first element
        numbers.removeFirst();
        System.out.println("// removeFirst(): " + numbers);

        // removeLast(): Remove last element
        numbers.removeLast();
        System.out.println("// removeLast(): " + numbers);

        // removeAll(Collection<?> c): Remove all matching elements
        numbers.removeAll(Arrays.asList(15, 35));
        System.out.println("// removeAll([15, 35]): " + numbers);

        // contains(Object o): Check if element exists
        boolean has30 = numbers.contains(30);
        System.out.println("// contains(30): " + has30);

        // indexOf(Object o): First index of element
        int index10 = numbers.indexOf(10);
        System.out.println("// indexOf(10): " + index10);

        // lastIndexOf(Object o): Last index of element
        numbers.add(10);
        int lastIndex10 = numbers.lastIndexOf(10);
        System.out.println("// lastIndexOf(10): " + lastIndex10);

        // isEmpty(): Check if list is empty
        System.out.println("// isEmpty(): " + numbers.isEmpty());

        // size(): Number of elements
        System.out.println("// size(): " + numbers.size());

        // toArray(): Convert to array
        Object[] arr = numbers.toArray();
        System.out.println("// toArray(): " + Arrays.toString(arr));

        // subList(int fromIndex, int toIndex): Get sublist
        System.out.println("// subList(0, 2): " + numbers.subList(0, 2));

        // clear(): Remove all elements
        LinkedList<Integer> temp = new LinkedList<>(numbers);
        temp.clear();
        System.out.println("// clear(): " + temp);

        // clone(): Shallow copy
        LinkedList<Integer> cloned = (LinkedList<Integer>) numbers.clone();
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

        // descendingIterator(): Iterate in reverse
        Iterator<Integer> dit = numbers.descendingIterator();
        System.out.print("// descendingIterator(): ");
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();

        // removeIf(Predicate): Remove by condition (remove numbers < 20)
        numbers.removeIf(num -> num < 20);
        System.out.println("// removeIf(num < 20): " + numbers);

        // replaceAll(UnaryOperator): Replace all elements
        numbers.replaceAll(num -> num * 2);
        System.out.println("// replaceAll(num * 2): " + numbers);

        // retainAll(Collection): Keep only specified elements
        numbers.retainAll(Arrays.asList(60));
        System.out.println("// retainAll([60]): " + numbers);

        // offer(E e): Add element at end (like add)
        numbers.offer(100);
        System.out.println("// offer(100): " + numbers);

        // offerFirst(E e): Add at beginning
        numbers.offerFirst(1);
        System.out.println("// offerFirst(1): " + numbers);

        // offerLast(E e): Add at end
        numbers.offerLast(200);
        System.out.println("// offerLast(200): " + numbers);

        // peek(): Get first element (head), null if empty
        System.out.println("// peek(): " + numbers.peek());

        // peekFirst(): Get first element
        System.out.println("// peekFirst(): " + numbers.peekFirst());

        // peekLast(): Get last element
        System.out.println("// peekLast(): " + numbers.peekLast());

        // poll(): Remove and return first element, null if empty
        System.out.println("// poll(): " + numbers.poll());

        // pollFirst(): Remove and return first element
        System.out.println("// pollFirst(): " + numbers.pollFirst());

        // pollLast(): Remove and return last element
        System.out.println("// pollLast(): " + numbers.pollLast());

        // push(E e): Add at beginning (like stack)
        numbers.push(500);
        System.out.println("// push(500): " + numbers);

        // pop(): Remove and return first element (like stack)
        System.out.println("// pop(): " + numbers.pop());
    }
}
