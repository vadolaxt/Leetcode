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
            return "ListNode{" + "val=" + val + ", next=" + next + '}';
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // an temp value
        ListNode curr = dummy; // pointer that track dummy val
        int carry = 0; // a value that sum l1, l2 digit
        while (l1 != null || l2 != null || carry > 0) {
            /**
             * carry phải lớn hơn 0 vì khi cộng hết số lương digit thì nếu có phần nhớ thì phải thêm phần nhớ đó vào dummy trc khi dừng
             */
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(carry % 10);
            carry /= 10;
            curr = curr.next;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode x1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode x2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode x3 = new ListNode(9);
        ListNode x4 = new ListNode(9, new ListNode(9, new ListNode(9)));
        System.out.println(addTwoNumbers(x1, x2));
        System.out.println(addTwoNumbers(x3, x4));


    }
}
