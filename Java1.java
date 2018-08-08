
import java.util.*;
import java.io.*;

class Bank		//Polymorphism
{  
    int getRateOfInterest(){
        return 0; }  
}  
  class ICICI extends Bank		//Inheritance
  {  
    int getRateOfInterest(int x){
        return x*7; }  
  }  
class AXIS extends Bank
{
    int getRateOfInterest(int x){	//Overriding
        return x*9; }  
}
class Overload
{
    public int addition(int x, int y){
        return x+y;
    }
    public int addition(int x, int y,int z){		//Overloading
        return x+y+z;
    }
    
}
class Codechef
{
	public static void main (String[] args)
	{
	ICICI i=new ICICI();  
        AXIS a=new AXIS();  
        Overload ov=new Overload();
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest(5));  
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest(9));
		System.out.println("Sum of 2 numbers: "+ov.addition(5,10));
		System.out.println("Sum of 3 numbers: "+ov.addition(5,10,15));
		try {				//Exception Handling
         		int arr[] = new int[2];
        		System.out.println("Access element three :" + arr[3]);
      		    } 
		catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown  :" + e);
                }
        System.out.println("Out of the block");
      }
		
	
}
