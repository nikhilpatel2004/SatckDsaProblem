import java.util.Stack;

public class NextGreaterValue {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> S = new Stack<Integer>();
        int nextGreater[] = new int[arr.length];

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from the stack while they are less than or equal to the current element
            while (!S.isEmpty() && arr[S.peek()] <= arr[i]) {
                S.pop();
            }
            // If the stack is empty, there is no greater element
            if (S.isEmpty()) {
                nextGreater[i] = -1; // Indicating no greater value
            } else {
                nextGreater[i] = arr[S.peek()]; // The next greater element
            }
            // Push the current index onto the stack
            S.push(i);
        }

        // Print the next greater values
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
