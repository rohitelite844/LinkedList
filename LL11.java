import java.util.LinkedList;

public class LL11 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("Pink");
		ll.add("Orange");
		
		System.out.println("Original :"+ll);
		System.out.println();
		
		for (int i=0;i<ll.size();i++)
		{
			System.out.println("Elemet at index "+i+":"+ll.get(i));
		}
		

	}

}
