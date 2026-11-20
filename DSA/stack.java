import java.util.*;
public class stack {
	 public static void main(String[] args) {
	        Stack<Integer> s = new Stack<>();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        System.out.println("Top element is: " + s.peek());
	        System.out.println("Popped element is: " + s.pop());
	        System.out.println("Top element after pop is: " + s.peek());
	 }

}
