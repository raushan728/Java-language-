import java.util.*;

public class ArratDeque {

    public static void main(String[] args) {
        // ArrayDeque<Integer> creation
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        // add(E e): Add element to end
        numbers.add(10); // [10]
        numbers.add(20); // [10, 20]
        numbers.add(30); // [10, 20, 30]
        System.out.println("// add(E e): " + numbers);

        // addFirst(E e): Add at beginning
        numbers.addFirst(5); // [5, 10, 20, 30]
        System.out.println("// addFirst(5): " + numbers);

        // addLast(E e): Add at end
        numbers.addLast(40); // [5, 10, 20, 30, 40]
        System.out.println("// addLast(40): " + numbers);

        // offer(E e): Add at end (like add)
        numbers.offer(50); // [5, 10, 20, 30, 40, 50]
        System.out.println("// offer(50): " + numbers);

        // offerFirst(E e): Add at beginning
        numbers.offerFirst(1); // [1, 5, 10, 20, 30, 40, 50]
        System.out.println("// offerFirst(1): " + numbers);

        // offerLast(E e): Add at end
        numbers.offerLast(60); // [1, 5, 10, 20, 30, 40, 50, 60]
        System.out.println("// offerLast(60): " + numbers);

        // getFirst(): Get first element
        System.out.println("// getFirst(): " + numbers.getFirst());

        // getLast(): Get last element
        System.out.println("// getLast(): " + numbers.getLast());

        // peek(): Get head (first) element, null if empty
        System.out.println("// peek(): " + numbers.peek());

        // peekFirst(): Get first element
        System.out.println("// peekFirst(): " + numbers.peekFirst());

        // peekLast(): Get last element
        System.out.println("// peekLast(): " + numbers.peekLast());

        // remove(): Remove and return first element
        System.out.println("// remove(): " + numbers.remove()); // removes 1
        System.out.println("// after remove(): " + numbers);

        // removeFirst(): Remove first element
        System.out.println("// removeFirst(): " + numbers.removeFirst()); // removes 5
        System.out.println("// after removeFirst(): " + numbers);

        // removeLast(): Remove last element
        System.out.println("// removeLast(): " + numbers.removeLast()); // removes 60
        System.out.println("// after removeLast(): " + numbers);

        // poll(): Remove and return first element, null if empty
        System.out.println("// poll(): " + numbers.poll()); // removes 10
        System.out.println("// after poll(): " + numbers);

        // pollFirst(): Remove and return first element
        System.out.println("// pollFirst(): " + numbers.pollFirst()); // removes 20
        System.out.println("// after pollFirst(): " + numbers);

        // pollLast(): Remove and return last element
        System.out.println("// pollLast(): " + numbers.pollLast()); // removes 50
        System.out.println("// after pollLast(): " + numbers);

        // push(E e): Add at beginning (stack push)
        numbers.push(100); // [100, 30, 40]
        System.out.println("// push(100): " + numbers);

        // pop(): Remove and return first element (stack pop)
        System.out.println("// pop(): " + numbers.pop()); // removes 100
        System.out.println("// after pop(): " + numbers);

        // contains(Object o): Check if element exists
        boolean has30 = numbers.contains(30);
        System.out.println("// contains(30): " + has30);

        // size(): Number of elements
        System.out.println("// size(): " + numbers.size());

        // isEmpty(): Check if deque is empty
        System.out.println("// isEmpty(): " + numbers.isEmpty());

        // clear(): Remove all elements
        numbers.clear();
        System.out.println("// clear(): " + numbers);

        // addAll for demo
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));

        // iterator(): Forward traversal
        Iterator<Integer> it = numbers.iterator();
        System.out.print("// iterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // descendingIterator(): Reverse traversal
        Iterator<Integer> dit = numbers.descendingIterator();
        System.out.print("// descendingIterator(): ");
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();
    }
}
