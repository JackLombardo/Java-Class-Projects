public class LinkedStack<E> implements StackInterface<E> {

    private Node<E> top; 
    private int size;   
    private class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E e) {
        Node<E> newNode = new Node<>(e, top);
        top = newNode;
        size++;
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return top.element;
    }

    public E pop() {
        if (isEmpty()) {
            return null; 
        }
        E result = top.element;
        top = top.next;
        size--;
        return result;
    }
}
