import java.util.ArrayList;

public class LL13 {

	public static void main(String[] args) {
		ArrayList<String> ll=new ArrayList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("Pink");
		ll.add("Orange");
		
		System.out.println("Original Linked List :"+ll);
		
		System.out.println("Elements removed :"+ll.remove(0));
		System.out.println("Elements removed :"+ll.remove(3));
		
		System.out.println("The New Linked List: "+ll);

	}

}
