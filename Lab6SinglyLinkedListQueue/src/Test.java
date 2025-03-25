public class Test {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        System.out.println("Is the queue empty? " + queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Size is " + queue.size());
        System.out.println("first element is " + queue.first());
        System.out.println("dequeue element " + queue.dequeue());
        System.out.println("queue size after dequeue " + queue.size());
        System.out.println("first element after dequeue " + queue.first());
    }
}
