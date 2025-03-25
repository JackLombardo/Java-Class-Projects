import java.util.Stack;
import java.util.Arrays;

public class ReverseArray {

    public static void loopReverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void loopStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] loopReverseArray = {1, 2, 3};
        int[] loopStackArray = {1, 2, 3};
        //original
        System.out.println("original" + Arrays.toString(loopReverseArray));
        //loopReverse
        loopReverse(loopReverseArray);
        System.out.println("Reversed with Loop and Swap: " + Arrays.toString(loopReverseArray));
        //loopStack
        loopStack(loopStackArray);
        System.out.println("Reversed with Stack: " + Arrays.toString(loopStackArray));
    }
}
