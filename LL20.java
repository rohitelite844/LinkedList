import java.util.LinkedList;

public class LL20 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("White");
		ll.add("Pink");
		
		System.out.println("Original linked list :"+ll);
		System.out.println();
		
		System.out.println("First Element in the list: "+ll.getFirst());
		System.out.println();
		System.out.println(ll);
		

	}

}
