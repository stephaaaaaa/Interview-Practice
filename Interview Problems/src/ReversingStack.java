import java.util.Stack;

public class ReversingStack {

	
	
	
	public static void main(String[] args){
	
		Stack<Integer> stackA = new Stack<Integer>();
		Stack<Integer> destinationStack = new Stack<Integer>();
		stackA.push(1);
		stackA.push(2);
		stackA.push(3);
		System.out.println("This is our beginning stack:\t" + stackA.toString()+ "\nREVERSE! REVERSE!");
		// Stack A: [(bottom)1, 2, 3(top)]
		// What we want: [3, 2, 1]
		
		for(int i = stackA.size()-1; i >= 0; i--){
			destinationStack.push(stackA.get(i));
		}
		System.out.println("Our new stack is:\t" + destinationStack.toString());
		
		
	}
}
