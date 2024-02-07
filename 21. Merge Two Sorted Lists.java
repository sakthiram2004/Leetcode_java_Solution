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
        ListNode temp = list1;
        if(temp==null)
        list1=list2;
        else if (temp!=null){
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=list2;
        }
        temp=list1;
        if(temp!=null){
            while(temp!=null){
                ListNode j=temp.next;
                while(j!=null){
                    if(temp.val>j.val){
                        int c=temp.val;
                        temp.val=j.val;
                        j.val=c;
                    }
                    j=j.next;
                }
                temp=temp.next;
            }
        }

        return list1;
        
    }
}