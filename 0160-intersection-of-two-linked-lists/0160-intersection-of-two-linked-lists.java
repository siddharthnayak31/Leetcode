/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Temporary pointers to traverse both lists
        ListNode tempA = headA;
        ListNode tempB = headB;

        // Lengths of both lists
        int lA = 0;
        int lB = 0;

        // Count length of List A
        while (tempA != null) {
            tempA = tempA.next;
            lA++;
        }

        // Count length of List B
        while (tempB != null) {
            tempB = tempB.next;
            lB++;
        }

        // Reset pointers back to heads
        // (Because above loops moved them to the end)
        tempA = headA;
        tempB = headB;

        // If List A is longer, move its pointer ahead by difference
        if (lA > lB) {
            int diff = lA - lB;
            for (int i = 0; i < diff; i++) {
                tempA = tempA.next;
            }
        }

        // If List B is longer, move its pointer ahead by difference
        if (lB > lA) {
            int diff = lB - lA;
            for (int i = 0; i < diff; i++) {
                tempB = tempB.next;
            }
        }

        // Now both pointers are equal distance from intersection point
        // Move both together until they meet
        while (tempA != null ) {

            // If both pointers point to same node, intersection found
            if (tempA == tempB) {
                return tempA;
            }

            // move ahead
            tempA = tempA.next;
            tempB = tempB.next;
        }

        // No intersection found
        return null;
    }
}
