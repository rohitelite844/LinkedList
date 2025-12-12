import java.util.LinkedList;

public class LL12 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("Pink");
		ll.add("Orange");
		
		System.out.println("The Original Linked List :"+ll);
		System.out.println();
		ll.remove("Black");
		
		System.out.println("The New Linked List :"+ll);

	}

}
