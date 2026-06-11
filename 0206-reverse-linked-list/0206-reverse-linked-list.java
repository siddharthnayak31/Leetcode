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
    public ListNode reverseList(ListNode head) {

        // curr -> jis node par hum currently khade hain
        ListNode curr = head;

        // prev -> pichla node jiske side me link reverse karna hai
        // null se start karte hain kyunki last node ka next null hona chahiye
        ListNode prev = null;

        // agla -> temporary pointer to store next node (warna list kho jayegi)
        ListNode agla = null;

        // Jab tak list khatam nahi hoti
        while (curr != null) {

            // Step 1: Save next node (so that list lose na ho)
            agla = curr.next;

            // Step 2: Reverse the link
            curr.next = prev;

            // Step 3: prev ko curr par le jao (tail ban jayega)
            prev = curr;

            // Step 4: curr ko agla par move karo (aage traversal)
            curr = agla;
        }

        // Loop khatam hone ke baad prev new head ban chuka hota hai
        return prev;
    }
}
