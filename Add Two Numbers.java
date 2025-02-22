/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
//time- O(N) space - O(1)

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        int carry=0;
        ListNode ptr= temp;
        while(l1!=null || l2 !=null || carry !=0){
            int n = (l1==null ?0:l1.val)+(l2==null?0:l2.val)+carry;
            carry= n/10;
            ptr.next= new ListNode(n%10);
            ptr= ptr.next;
            l1= l1==null? null:l1.next;
            l2= l2==null? null:l2.next;
        }
         return temp.next;
    }
   
}
