package add2num;

public class main1 {
	public static void main(String[] args){
		
		solution2 sol = new solution2();
		ListNode l10 = new ListNode(2);
		ListNode l11 = new ListNode(4);
		ListNode l12 = new ListNode(6);
		ListNode l20 = new ListNode(5);
		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(4);
		l10.next=l11;
		l11.next=l12;
		l20.next=l21;
		l21.next=l22;
		
		ListNode res = sol.addTwoNumbers(l10, l20);
		while(res !=null){
			System.out.println(res.val);
			res = res.next;
		}
	}

}
