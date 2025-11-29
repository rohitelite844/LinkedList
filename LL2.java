import java.util.LinkedList;

public class LL2 {

	public static void main(String[] args) {
		
		//Iterate 
		
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("White");
		ll.add("Pink");
		
		System.out.println(ll);
		System.out.println();
		
		for (String x:ll)
		{
			System.out.println(x);
			
		}

	}

}
