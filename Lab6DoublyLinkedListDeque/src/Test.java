public class Test {
    public static void main(String[] args) {
        LinkedDeque<Integer> deque = new LinkedDeque<>();

        System.out.println("Is the deque empty? " + deque.isEmpty());
        System.out.println("size: " + deque.size());
        System.out.println("adding to the front");
        
        deque.addFirst(1);
        deque.addFirst(2);
        
        System.out.println("size: " + deque.size());
        System.out.println("adding to the end");
        
        deque.addLast(3);
        deque.addLast(4);
        
        System.out.println("Is the deque empty? " + deque.isEmpty());
        System.out.println("size: " + deque.size());
        System.out.println("first element " + deque.first());
        System.out.println("last element " + deque.last());
        System.out.println("Remove first " + deque.removeFirst());
        System.out.println("Remove last " + deque.removeLast());
        System.out.println("Remove first " + deque.removeFirst());
        System.out.println("Remove last " + deque.removeLast());
    }
}
