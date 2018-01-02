import java.util.Stack;

public class PalindromeCheck {

	public static void main(String[] args){
		//stack approach
		String palindromeInitial = "Avid diva";
		String toCheck = palindromeInitial.toLowerCase();
		System.out.println("Is " + palindromeInitial + " a palindrome? Let's check! We'll do the stack approach.");
		stackApproach(palindromeInitial, toCheck);
		
		System.out.println("Now we will do our nonstack approach:");
		
		if(nonStackApproach(palindromeInitial, toCheck) == true)
			System.out.println("We have a palindrome!");
		else
			System.err.println("No palindrome :(");
	}
	
	private static void stackApproach(String palindromeInitial, String palindromeInput){
		Stack<Character> stackA = new Stack<Character>();
		Stack<Character> stackB = new Stack<Character>();
		
		for(int i = 0; i < palindromeInput.length(); i++){
			stackA.push(palindromeInput.charAt(i));
		}
		System.out.println("Our stack from beginning to end is: " + stackA.toString());
		for(int j = palindromeInput.length()-1; j >= 0; j--){
			stackB.push(palindromeInput.charAt(j));
		}
		System.out.println("Our stack from end to beginning is: " + stackB.toString());
		
		while(!stackA.isEmpty() && !stackB.isEmpty()){
			char stackACurrent;
			char stackBCurrent;
			
			stackACurrent = stackA.pop();
			stackBCurrent = stackB.pop();
			
			if(stackACurrent == stackBCurrent){ 
				continue;
			}else if(stackACurrent != stackBCurrent){ // if the characters are not the same
				System.err.println(palindromeInitial + " is not a palindrome. The two stacks are not the same!");
				System.exit(1);
			}
		}
		System.out.println(palindromeInitial + " is a palindrome because our two stacks are the same.\n");
	}
	
	private static boolean nonStackApproach(String palindromeInitial, String palindromeInput){
		int initial = 0;
		int end = palindromeInput.length()-1;
		
		while(end > initial){
			System.out.println("Comparing chars: " + palindromeInput.charAt(initial) + " and " + palindromeInput.charAt(end));
			
			if(palindromeInput.charAt(initial) != palindromeInput.charAt(end)){
				return false;
			}
			end--;
			initial++;
		}
		
		return true;
	}
}
