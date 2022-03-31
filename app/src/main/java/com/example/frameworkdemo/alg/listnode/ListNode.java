package com.example.frameworkdemo.alg.listnode;

public class ListNode {
    public ListNode(ListNode node, int v) {
        this.next = node;
        this.value = v;
    }

    public ListNode next;
    public int value;
}
