import java.util.LinkedList;

public class LL19 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("White");
		ll.add("Pink");
		System.out.println("Original Linked List :"+ll);
		
		System.out.println("Removed Element :"+ll.removeFirst());
		
		System.out.println("List after removed :"+ll);
		

	}

}
