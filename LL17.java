import java.util.ArrayList;

public class LL17 {

	public static void main(String[] args) {
		ArrayList<String> ll=new ArrayList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("White");
		ll.add("Pink");
		System.out.println("List of First linked list :"+ll);
		
		ArrayList<String> ll2=new ArrayList<>();
		ll2.add("Red");
		ll2.add("Green");
		ll2.add("Black");
		ll2.add("White");
		ll2.add("Pink");
		
		System.out.println();
		System.out.println("List of First linked list :"+ll2);
		
		System.out.println();
		
		ll2.addAll(ll);
		
		
		System.out.println("New Linked List :"+ll2);

	}

}
