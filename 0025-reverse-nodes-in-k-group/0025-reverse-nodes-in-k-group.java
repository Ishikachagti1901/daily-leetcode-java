class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;
        
        // Check whether k nodes are available
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }
        
        // Reverse first k nodes
        ListNode prev = null;
        ListNode curr = head;
        
        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // head is now the last node of reversed group
        head.next = reverseKGroup(curr, k);
        
        return prev;
    }
}