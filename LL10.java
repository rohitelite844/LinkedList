import java.util.LinkedList;

public class LL10 {

	public static void main(String[] args) {
		//Get first and Last elements
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("Pink");
		ll.add("Orange");
		
		System.out.println("Original Linked List :"+ll);
		
		System.out.println("First Elements is :"+ll.getFirst());
		System.out.println("Last Elements is :"+ll.getLast());
		
		

	}

}
