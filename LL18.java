import java.util.LinkedList;

public class LL18 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("White");
		ll.add("Pink");
		
		System.out.println("Oroginal Linked List :"+ll);
		ll.clone();
		
		
		System.out.println("cloned linked list"+ll);
		
		//LinkedList<String> ll2=new LinkedList<>();
		
		

	}

}
