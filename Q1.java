package array;

import java.util.Scanner;

public class array15 { 
	{	int temp = 0;    
Scanner sc=new Scanner(System.in);  
//System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  

//creates an array in the memory of length  
//int[] array = new int[5];  
System.out.println("Enter the elements of the array: "); 
int array[]=new int[15];//declaration and instantiation    
array[0]=sc.nextInt();//initialization  of the array   
array[1]=sc.nextInt();    
array[2]=sc.nextInt();    
array[3]=sc.nextInt();    
array[4]=sc.nextInt();    
array[5]=sc.nextInt();    
array[6]=sc.nextInt();    
array[7]=sc.nextInt();    
array[8]=sc.nextInt();    
array[9]=sc.nextInt();    
array[10]=sc.nextInt();    
array[11]=sc.nextInt();    
array[12]=sc.nextInt();    
array[13]=sc.nextInt();    
array[14]=sc.nextInt();    
array[15]=sc.nextInt();    


//traversing array to print the array values  
//for(int i=0;i<array.length;i++)  {
  //}  
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
 

}
}
