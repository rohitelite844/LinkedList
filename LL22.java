import java.util.LinkedList;

public class LL22 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("White");
		ll.add("Pink");
		 System.out.println("Original Linked list :"+ll);
		 
		 if(ll.contains("Green"))
		 {
			 System.out.println("Color Green is present in the linked list.");
		 }
		 else
		 {
			 System.out.println("Color Green is not present in the linked list.");
		 }
		 
		 if(ll.contains("Orange"))
		 {
			 System.out.println("Orange Green is present in the linked list.");
		 }
		 else{
			 System.out.println("Color Green is not present in the linked list.");
		 }
		 

	}

}
