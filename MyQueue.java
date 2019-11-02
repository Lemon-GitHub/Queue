package Queue;

class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    //入队列
    public void offer(int x){
        Node newNode = new Node(x);
        //队列为空
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
        size++;
    }

    //出队列 保留出队列的元素
    public Integer poll(){
        if(head == null){
            return null;
        }
        int ret = head.val;
        head = head.next;
        size--;
        return ret;
    }

    //取队首元素
    public Integer peek(){
        if(head == null){
            return null;
        }
        return head.val;
    }

    //队列是否为空
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    //队列大小
    public int size(){
       return size;
    }
}
