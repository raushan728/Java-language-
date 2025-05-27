import java.util.*;

public class Hashset {

    public static void main(String[] args) {
        // Create an ArrayDeque of Integer
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // add(E e): Adds element at the end (like a queue)
        deque.add(10); // [10]
        deque.add(20); // [10, 20]
        deque.add(30); // [10, 20, 30]
        System.out.println("// add(E e): " + deque);

        // addFirst(E e): Adds element at the front (supports both stack and queue)
        deque.addFirst(5); // [5, 10, 20, 30]
        System.out.println("// addFirst(5): " + deque);

        // addLast(E e): Adds element at the end (same as add)
        deque.addLast(40); // [5, 10, 20, 30, 40]
        System.out.println("// addLast(40): " + deque);

        // offer(E e): Adds element at the end, returns false if capacity is full (not
        // an issue in ArrayDeque)
        deque.offer(50); // [5, 10, 20, 30, 40, 50]
        System.out.println("// offer(50): " + deque);

        // offerFirst(E e): Adds element at the front, returns true/false
        deque.offerFirst(1); // [1, 5, 10, 20, 30, 40, 50]
        System.out.println("// offerFirst(1): " + deque);

        // offerLast(E e): Adds element at the end, returns true/false
        deque.offerLast(60); // [1, 5, 10, 20, 30, 40, 50, 60]
        System.out.println("// offerLast(60): " + deque);

        // getFirst(): Returns the first element without removing, throws exception if
        // empty
        System.out.println("// getFirst(): " + deque.getFirst());

        // getLast(): Returns the last element without removing, throws exception if
        // empty
        System.out.println("// getLast(): " + deque.getLast());

        // peek(): Returns the first element without removing, returns null if empty
        System.out.println("// peek(): " + deque.peek());

        // peekFirst(): Returns the first element without removing, returns null if
        // empty
        System.out.println("// peekFirst(): " + deque.peekFirst());

        // peekLast(): Returns the last element without removing, returns null if empty
        System.out.println("// peekLast(): " + deque.peekLast());

        // remove(): Removes and returns the first element, throws exception if empty
        System.out.println("// remove(): " + deque.remove());
        System.out.println("// after remove(): " + deque);

        // removeFirst(): Removes and returns the first element
        System.out.println("// removeFirst(): " + deque.removeFirst());
        System.out.println("// after removeFirst(): " + deque);

        // removeLast(): Removes and returns the last element
        System.out.println("// removeLast(): " + deque.removeLast());
        System.out.println("// after removeLast(): " + deque);

        // poll(): Removes and returns the first element, returns null if empty
        System.out.println("// poll(): " + deque.poll());
        System.out.println("// after poll(): " + deque);

        // pollFirst(): Removes and returns the first element, returns null if empty
        System.out.println("// pollFirst(): " + deque.pollFirst());
        System.out.println("// after pollFirst(): " + deque);

        // pollLast(): Removes and returns the last element, returns null if empty
        System.out.println("// pollLast(): " + deque.pollLast());
        System.out.println("// after pollLast(): " + deque);

        // push(E e): Adds element at the front (like stack push)
        deque.push(100); // [100, 20, 30, 40]
        System.out.println("// push(100): " + deque);

        // pop(): Removes and returns the first element (like stack pop)
        System.out.println("// pop(): " + deque.pop());
        System.out.println("// after pop(): " + deque);

        // contains(Object o): Checks if the element is present
        boolean has30 = deque.contains(30);
        System.out.println("// contains(30): " + has30);

        // size(): Returns the number of elements in the deque
        System.out.println("// size(): " + deque.size());

        // isEmpty(): Checks if the deque is empty
        System.out.println("// isEmpty(): " + deque.isEmpty());

        // clear(): Removes all elements from the deque
        deque.clear();
        System.out.println("// clear(): " + deque);

        // addAll for demo: Add multiple elements at once
        deque.addAll(java.util.Arrays.asList(1, 2, 3, 4, 5));

        // iterator(): Forward traversal
        Iterator<Integer> it = deque.iterator();
        System.out.print("// iterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // descendingIterator(): Reverse traversal
        Iterator<Integer> dit = deque.descendingIterator();
        System.out.print("// descendingIterator(): ");
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();
    }
}
