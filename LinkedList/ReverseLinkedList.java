package LinkedList;
public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    
        
    }

    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }

    public static void print(ListNode head){
        while (head!=null) {
            System.out.println(head.val+" ");
            head=head.next;
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        print(head);

        head=reverse(head);

        System.out.println("reverse:");
        print(head);
        
        
    }
    
}
