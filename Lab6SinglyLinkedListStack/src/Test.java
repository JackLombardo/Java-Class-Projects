public class Test {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        if (stack.isEmpty()) {
            System.out.println("Is the stack empty?  Yes");
        } else {
            System.out.println("Is the stack empty?  No");
        }

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size - " + stack.size());
        System.out.println("Top element - " + stack.top());
        System.out.println("Popped element - " + stack.pop());
        System.out.println("New top element - " + stack.top());

        //pop the last 2 elements out
        stack.pop();
        stack.pop();
        System.out.println("Stack is empty after popping all elements: " + stack.isEmpty());
    }
}
