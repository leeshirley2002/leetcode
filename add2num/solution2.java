package add2num;

public class solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p1=l1;
		ListNode p2 = l2;
		ListNode result = new ListNode(0);
		ListNode p3 = result;
		int carry = 0;
		int sum=0;
		while(p1!=null && p2!=null){
			sum = p1.val+p2.val+carry;
			carry = sum/10;
			p3.next=new ListNode(sum%10);
			p3=p3.next;
			p2=p2.next;
			p1=p1.next;
		}
		while(p1!=null){
			sum = p1.val+carry;
			carry = sum/10;
			p3.next=new ListNode(sum%10);
			p3=p3.next;
			p1=p1.next;
		}
		while(p2!=null){
			sum = p2.val+carry;
			carry = sum/10;
			p3.next=new ListNode(sum%10);
			p3=p3.next;
			p2=p2.next;
		}
		if(carry >= 1){
			p3.next = new ListNode(carry);
		}
		return result.next;
	}
}
