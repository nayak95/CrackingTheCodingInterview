package Linked_List.Ques1;

import java.util.HashSet;
import java.util.Set;

public class Ques1 {
    // Time Complexity = O(N)
    public ListNode deleteDuplicates(ListNode head){
        ListNode previous = null, current = head;
        Set<Integer> set = new HashSet<>();
        while (current != null){
            if (set.contains(current.val))
                previous.next = current.next;
            else{
                set.add(current.val);
                previous = current;
            }
            current = current.next;
        }
        return head;
    }

    // Time Complexity = O(N^2) but space complexity = O(1)
    public ListNode deleteDuplicates2(ListNode head){
        ListNode current = head;
        while(current != null){
            ListNode fast = current;
            while (fast.next != null) {
                if (fast.next.val == current.val)
                    fast.next = fast.next.next;
                else
                    fast = fast.next;
            }
            current = current.next;
        }
        return head;
    }
}
