package Queue;

public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        while(!queue.isEmpty()){
            int curFront = queue.peek();
            System.out.print(curFront + " ");
            queue.poll();
        }
    }
}
