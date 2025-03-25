public class LinkedQueue<E> implements QueueInterface<E> {
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.element;
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.element;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return answer;
    }
}
