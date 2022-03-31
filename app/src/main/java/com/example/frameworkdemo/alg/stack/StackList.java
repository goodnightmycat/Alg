package com.example.frameworkdemo.alg.stack;


/**
 * 链表实现栈
 */
public class StackList<E> {

    public static void main(String[] args) {
        StackList<Integer> stackList = new StackList<>();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        System.out.println("peek->" + stackList.peek());
        stackList.push(4);
        System.out.println("push4->" + stackList.peek());
        System.out.println("pop->" + stackList.pop());
        System.out.println("pop->" + stackList.pop());
    }

    public static class StackItem<T> {
        public StackItem<T> next;
        public T value;

        public StackItem(StackItem<T> next, T value) {
            this.next = next;
            this.value = value;
        }
    }

    public StackItem<E> head;

    public StackList() {

    }

    /**
     * 弹出栈顶元素
     *
     * @return
     */
    public E pop() {
        if (head == null) {
            return null;
        } else {
            StackItem<E> next = head;
            head = head.next;
            return next.value;
        }
    }

    /**
     * 返回栈顶元素
     *
     * @return
     */
    public E peek() {
        return head == null ? null : head.value;
    }

    /**
     * 入栈，把元素加入栈顶
     *
     * @return
     */
    public E push(E value) {
        head = new StackItem<>(head, value);
        return value;
    }

}
