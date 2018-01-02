import java.util.Scanner;

/**
 * Convert an array (i.e. [1, 4, 3]) to a number (143).
 * Find the next sequential number and turn it into an array.
 * 
 * @author The Emperor
 */
public class ArrayIntegerConversion {
	
	//Driver
	public static void main(String[] args){
		int[] array1 = {1, 9};
		// result should be a new array, {4, 3, 6}
		int[] newArray = arraySum(array1);
		System.out.println(java.util.Arrays.toString(array1) + "\t" + java.util.Arrays.toString(newArray));
		System.out.println("Now find all subsets ");

	}
	﻿
	
	private static int[] arraySum(int[] inputNumber){
		// gather the final number of the array
		int finalIndex = inputNumber.length-1;
		int[] sumArray = new int[inputNumber.length];
		int newLastDigit;
		int carry;
		
		if(inputNumber[finalIndex] < 9){
			newLastDigit = inputNumber[finalIndex]+1; // just sum one
			
			for(int i = finalIndex-1; i >= 0; i--){
				sumArray[i] = inputNumber[i];
			}
			sumArray[finalIndex] = newLastDigit;
		}else{
			carry = 1;
			newLastDigit = 0;
			sumArray[finalIndex] = newLastDigit;
			for(int i = finalIndex-1; i >= 0; i--){
				if(carry == 1){
					if(inputNumber[i] < 9){
						sumArray[i] = inputNumber[i] + carry;
						carry = 0;
					}else{
						sumArray[i] = inputNumber[i];
						carry = 0;
					}
					
				}else{
					sumArray[i] = inputNumber[i];
				}
			}
		}
		
		
		return sumArray;
	}

}
