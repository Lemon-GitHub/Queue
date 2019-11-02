package Queue;

public class TestQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("队列长度： " + queue.size());

        while(!queue.isEmpty()){
            int curFront = queue.peek();
            System.out.print(curFront + " ");
            queue.poll();
        }


    }
}
