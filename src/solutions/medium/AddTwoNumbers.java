package solutions.medium;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(carry % 10);
            System.out.println(" curr.next= "+ curr.next);
            carry /= 10;
            curr = curr.next;
            System.out.println(curr);
            System.out.println("--dummy="+dummy.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode x1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode x2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(addTwoNumbers(x1,x2));



    }
}
