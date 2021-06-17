class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
public class DemoJava {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] l1 = {1,2,3,4};
        int[] l2 = {3,4,5,6};
        ListNode ln1 = createList(l1);
        ListNode ln2 = createList(l2);
        ListNode resultNode = solution.addTwoNumbers(ln1, ln2);
        printListNode(resultNode);

    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ,");
            listNode = listNode.next;
        }
    } 

    public static ListNode createList(int[] arr) {
        ListNode head = null, tail = null;
        for (int i = 0 ; i < arr.length; i++) {
            if (head == null) head = tail = new ListNode(arr[i]);
            else {
                tail.next = new ListNode(arr[i]);
                tail = tail.next;
            }
        }
        return head;
    }
}