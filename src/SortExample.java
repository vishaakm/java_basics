// A sample Java program to sort an array of integers 
// using Arrays.sort(). It by default sorts in 
// ascending order 
import java.util.Arrays; 
  
public class SortExample 
{ 
    public static void main(String[] args) 
    { 
	
		String test = "This is a test Data";
		int test_2 = 0;
		
		double test_3 = 555.00;
		
		
        // Our arr contains 8 elements 
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
  
        Arrays.sort(arr); 
  
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 
    } 
} 
