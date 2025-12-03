import java.util.LinkedList;

public class LL5 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("White");
		ll.add("Pink");
		
		System.out.println(ll);
		System.out.println();
		
		System.out.println("After Inser the Specified Element");
		System.out.println();
		
		ll.add(1, "Yellow");
		
		System.out.println(ll);
		

	}

}
