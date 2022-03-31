package com.example.frameworkdemo.alg.listnode;

public class ListNodeUtil {


    /**
     * 把小于n的节点放到大于等于n的前面，保持节点相对顺序不变
     */
    public static ListNode separate(ListNode head, int n) {
        ListNode big = new ListNode(null, 0);
        ListNode bigDummy = big;
        ListNode small = new ListNode(null, 0);
        ListNode smallDummy = small;
        while (head != null) {
            if (head.value >= n) {
                big.next = head;
                big = big.next;
            } else {
                small.next = head;
                small = small.next;
            }
            head = head.next;
        }
        big.next = null;
        small.next = bigDummy.next;
        return smallDummy.next;
    }

    /**
     * 链表翻转
     */
    public static ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode(null, 0);
        while (head != null) {
            ListNode next = head.next;
            ListNode temp = dummy.next;
            dummy.next = head;
            dummy.next.next = temp;
            head = next;
        }
        return dummy.next;
    }
}
