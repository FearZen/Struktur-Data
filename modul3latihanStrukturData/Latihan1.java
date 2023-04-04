/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3latihan;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class Latihan1 {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");
        
        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");
        
        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}

class MyStack {
    private Object[] stack;
    private int top;
    
    public MyStack() {
        stack = new Object[10];
        top = -1;
    }
    
    public void push(Object obj) {
        if (top == stack.length - 1) {
            Object[] newStack = new Object[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = obj;
    }
    
    public Object pop() {
        if (top == -1) {
            return null;
        }
        Object obj = stack[top--];
        return obj;
    }
    
    public Object peek() {
        if (top == -1) {
            return null;
        }
        return stack[top];
    }
    
    public int search(Object obj) {
        int i = top;
        int count = 0;
        while (i >= 0) {
            if (stack[i].equals(obj)) {
                count++;
                return count;
            }
            count++;
            i--;
        }
        return -1;
    }
    
    public boolean empty() {
        return top == -1;
    }
}
