/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode head = null;  // result list ka start
        ListNode temp = null;  // pointer move karne ke liye
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            // l1 ka value add karo
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // l2 ka value add karo
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // carry nikalo
            int digit = sum % 10; // last digit

            ListNode newNode = new ListNode(digit);

            // agar first node hai
            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode; // link karo
                temp = temp.next;    // aage badho
            }
        }

        return head;
    }
}