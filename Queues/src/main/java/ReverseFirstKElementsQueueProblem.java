import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        reverseFirstKElement(queue,4).printQueue();


    }
    public static MyQueue<Integer> reverseFirstKElement(MyQueue<Integer> queue, Integer k){
        //create a stack
        Stack<Integer> stack = new Stack<>();
        //push first K elements into stack
        for (int i = 0; i <k ; i++) {
            stack.push(queue.dequeue());
        }
        //enqueue elements back into the queue
        while (!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
        // add remaining elements into the queue
        for (int i = 0; i <queue.size()-k ; i++) {
           queue.enqueue(queue.dequeue());
        }

        
        return queue;
    }
}
/*
1. Given an integer K and a queue of integers, write code to reverse the order
of the first K elements of the queue.
-Input: Q = [10, 20, 30, 40, 50], K = 4
-Output: Q = [40,30, 20, 10,50]
Hint: You can use stack to reverse the order of first K elements
 */