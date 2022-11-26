package array;
import java.util.Scanner;
import java.util.Arrays; 

public class descender {
	
	public static void main(String[] args)   
	{  
		      
	        
		 //Initialize array     
	    //int [] arr = new int [] {55, 32, 48, 57, 41};     
	    int temp = 0;    
	    Scanner sc=new Scanner(System.in);  
	  //System.out.print("Enter the number of elements you want to store: ");  
	  //reading the number of elements from the that we want to enter  
	   
	  //creates an array in the memory of length  
	  //int[] array = new int[5];  
	  System.out.println("Enter the elements of the array: "); 
	  int array[]=new int[5];//declaration and instantiation    
	  array[0]=sc.nextInt();//initialization  of the array   
	  array[1]=sc.nextInt();    
	  array[2]=sc.nextInt();    
	  array[3]=sc.nextInt();    
	  array[4]=sc.nextInt();    
	
	  //traversing array to print the array values  
	  for(int i=0;i<array.length;i++)  {
	      }  
	  /*System.out.println("Array elements are: ");
	  System.out.println(array[temp]);
	  // accessing array elements using the for loop  
	  for (int i=0; i<temp; i++)   
	  {  
	  System.out.println(array[i]);*/
	        
	    //Displaying elements of original array    	
	    System.out.println("Elements of original array: ");    
	    for (int i = 0; i< array.length; i++) {     
	        System.out.print(array[i] + " ");    
	    }    
	        
	    //Sort the array in descending order    
	    for (int i = 0; i < array.length; i++) {     
	        for (int j = i+1; j < array.length; j++) {     
	           if(array[i] < array[j]) {    
	               temp = array[i];    
	               array[i] = array[j];    
	               array[i] = temp;    
	           }     
	        }     
	    }    
	        
	    System.out.println();    
	        
	    //Displaying elements of array after sorting    
	    System.out.println("Elements of array sorted in descending order: ");    
	    for (int i = 0; i < array.length; i++) {     
	        System.out.print(array[i] + " ");    
	    }    
	}    
	}
	          
	             

			
			
		//defining an array of integer type   
		/*int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   */
		 
		  
		




