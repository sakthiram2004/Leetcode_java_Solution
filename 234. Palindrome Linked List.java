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
    public boolean isPalindrome(ListNode head) {
        String s="";
        if(head != null){
        while(head!=null){
            s=s+head.val;
            head=head.next;
        }
        if(s.equals(new StringBuilder(s).reverse().toString()))
        return true;}
        
        return false;

        
    }
}