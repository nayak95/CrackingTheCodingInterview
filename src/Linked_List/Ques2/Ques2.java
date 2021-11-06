package Linked_List.Ques2;

import Linked_List.Ques1.ListNode;

public class Ques2 {
    public ListNode kthToLast (ListNode head, int k){       // Time Complexity = O(n) but Space Complexity = O(1)
        ListNode ptr1 = head, ptr2 = head;
        for (int i = 0; i < k; i++) {
            if (ptr1 == null)   return null;
            ptr1 = ptr1.next;
        }
        while (ptr1 != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr2;
    }
}
