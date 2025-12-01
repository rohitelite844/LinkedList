import java.util.LinkedList;

public class LL4 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("Pink");
		ll.add("Orange");
		
		System.out.println("Original Linked List :"+ll);
		
		System.out.println();
		System.out.println("Elements in the Reverse Order :");
		
		for (int i=ll.size()-1;i>=0;i--)
		{
			ll.add(ll.get(i));
			
			
			System.out.println(ll.get(i));
		}

	}

}
