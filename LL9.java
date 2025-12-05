import java.util.LinkedList;

public class LL9 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		
		System.out.println("Original Linked List :"+ll);
		System.out.println();
		
		ll.add(1, "white");
		ll.add(2, "Pink");
		
		System.out.println("Final Linked List: "+ll);

	}

}
