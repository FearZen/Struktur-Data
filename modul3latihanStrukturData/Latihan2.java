/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3latihan;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class Latihan2 {
    private Object[] queue;
    private int front, rear;
    private int size;

    public Latihan2() {
        queue = new Object[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void add(Object obj) {
        if (rear == queue.length - 1) {
            Object[] newQueue = new Object[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }
        queue[++rear] = obj;
        size++;
    }

    public Object remove() {
        if (front == rear) {
            return null;
        }
        Object obj = queue[++front];
        size--;
        return obj;
    }

    public Object element() {
        if (front == rear) {
            return null;
        }
        return queue[front + 1];
    }

    public Object poll() {
        if (front == rear) {
            return null;
        }
        Object obj = queue[++front];
        size--;
        return obj;
    }

    public Object peek() {
        if (front == rear) {
            return null;
        }
        return queue[front + 1];
    }

    public static void main(String[] args) {
        Latihan2 q = new Latihan2();
        q.add("Java");
        q.add("DotNet");
        q.add("PHP");
        q.add("HTML");
        System.out.println("remove: " + q.remove());
        System.out.println("element: " + q.element());
        System.out.println("poll: " + q.poll());
        System.out.println("peek: " + q.peek());
    }
}
