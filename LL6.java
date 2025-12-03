import java.util.LinkedList;

public class LL6 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		
		System.out.println("Original Linked List :"+ll);
		
		System.out.println("Final Lionked List :");
		
		ll.add(0, "White");
		ll.add(4, "Pink");
		
		System.out.println(ll);
		
		
		
	}

}
