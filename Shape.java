/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.in.java;
import java.util.Scanner;


/**
 *
 * @author Students
 */
public class Shape {
    public static void rectangle()
            {
        int width,length,area;
     Scanner input=new Scanner(System.in);//instruct user to input values scanner class
     System.out.print("enter your width");
     width=input.nextInt();//user is enters
     System.out.print("enter your length");
     length=input.nextInt();
     area=length*width;
     System.out.print("your area is"+ area);//displays the area
            }
    /**
     *
     * @param args
     */
    public static void main (String[]args)
    {
         rectangle();
         
         
     }
     
 
}

     
     
     
    

    

