package hw;

public class HW {
	
	HW() {
		//
		
		
	}
	
	
public static void main(String[] args) {
		
	String temp = "365";
	Node current = new Node();
	Node head = current;
		
	for(int i = temp.length()-1; i >= 0; i--) {
		current.val = Character.getNumericValue(temp.charAt(i));
		//System.out.println("New Node val = " + Node.val);
		if(i == 0) current.next = null;
		else {
			current.next = new Node();
			current = current.next;
		}
			
	}
		
	System.out.println(temp);
	while(head != null) {
		System.out.print(head.val);
		head = head.next;
		}
	}

}


class Node {
	int val;
	Node next;
	
	Node() {
		//Node.val = 0;
		next = null;
	}
	
	Node(int val, Node next) {
		val = val;
		next = next;
	}
}