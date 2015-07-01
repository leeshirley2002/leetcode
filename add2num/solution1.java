package add2num;

public class solution1 {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		int carry =0;
		ListNode start = new ListNode(0);
		ListNode p1=l1,p2=l2,p3=start;
		while(p1 !=null && p2 !=null){
			int sum = p1.val+p2.val+carry;
			carry=sum/10;
			ListNode node = new ListNode(sum%10);
			p3.next=node;
			p3=p3.next;
			p1=p1.next;
			p2=p2.next;
		}
		while(p1 !=null){
			int sum = p1.val+carry;
			carry=sum/10;
			ListNode node = new ListNode(sum%10);
			p3.next=node;
			p3=p3.next;
			p1=p1.next;
		}
		while(p2 !=null){
			int sum = p2.val+carry;
			carry=sum/10;
			ListNode node = new ListNode(sum%10);
			p3.next=node;
			p3=p3.next;
			p2=p2.next;
		}
		if(carry==1){
			ListNode node = new ListNode(1);
			p3.next=node;
			p3=p3.next;
		}
		return start.next;

	}

}
