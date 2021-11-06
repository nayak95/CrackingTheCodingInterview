package Linked_List.Ques3;

import Linked_List.Ques1.ListNode;

public class Ques3 {
    public boolean deleteNode (ListNode node){          // if the node to be deleted is the last node, then point out to interviewer that you have to use a dummy variable to solve the problem. Practically it's not possible.
        if (node == null || node.next == null)  return false;
        node.val = node.next.val;
        node.next = node.next.next;

        return true;
    }
}
