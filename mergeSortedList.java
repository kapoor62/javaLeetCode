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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//          // Create a sentinal/dummy node to start
//           ListNode returnNode = new ListNode(Integer.MIN_VALUE);

//     // Create a copy of this node to iterate while solving the problem
//     ListNode headNode = returnNode;

//         ///////now both rN and hN  (pointers of linkedlist), point to min_Value of integer. the rN goes and iterates and makes a new merged sorted list, hN still points to min_integer value. In the end hence, we return the next of hN.

//     // Traverse till one of the list reaches the end
//     while (list1 != null && list2 != null) {

//       // Compare the 2 values of lists
//       if (list1.val <= list2.val) {
//         returnNode.next = list1;
//         list1 = list1.next;
//       } else {
//         returnNode.next = list2;
//         list2 = list2.next;
//       }
//       returnNode = returnNode.next;
//     }

//     // Append the remaining list
//     if (list1 == null) {
//       returnNode.next = list2;
//     } else if (list2 == null) {
//       returnNode.next = list1;
//     }

//     // return the next node to sentinal node
//     return headNode.next;

        ListNode returnNode = new ListNode(Integer.MIN_VALUE);
        ListNode headNode = returnNode;

        while( list1 != null && list2!= null){
            if (list1.val<list2.val){
                returnNode.next= list1;
                list1 = list1.next;
            }else {
                returnNode.next=list2;
                list2 = list2.next;
            }
            returnNode= returnNode.next;

        }

        if (list1==null){
            returnNode.next= list2;
        }else {
            returnNode.next= list1;
        }
        return headNode.next;


    }
}