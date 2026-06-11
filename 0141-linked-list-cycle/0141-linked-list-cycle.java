/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {

        // If list is empty → no cycle
        if (head == null) {
            return false;
        }

        // If list has only one node → cannot form a cycle
        if (head.next == null) {
            return false;
        }

        // Two pointers
        // slow moves 1 step at a time
        // fast moves 2 steps at a time
        ListNode slow = head;
        ListNode fast = head;

        // Loop until fast pointer reaches end
        // If cycle exists, fast and slow will eventually meet
        while (fast != null) {

            // move slow by 1
            slow = slow.next;

            // fast.next null check to avoid NullPointerException
            if (fast.next == null) return false;

            // move fast by 2
            fast = fast.next.next;

            // If both meet → cycle detected
            if (slow == fast) {
                return true;
            }
        }

        // If fast reached null → no cycle
        return false;
    }
}
