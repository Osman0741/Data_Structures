public class CollectionsQueueTasks {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

    }
}
