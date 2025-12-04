import java.util.LinkedList;

public class LL8 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		System.out.println("Original Linked List :"+ll);
		
		ll.add(3, "Pink");
		System.out.println(ll);

	}

}
