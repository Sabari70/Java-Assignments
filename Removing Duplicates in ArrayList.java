import java.util.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	ArrayList al = new ArrayList();
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(1);
        
        System.out.println("Before removal: " + al);
 
        for(int i = 0; i < al.size(); i++) {
            for(int j = i + 1; j < al.size(); j++) {
                if(al.get(i).equals(al.get(j))){
                    al.remove(j);
                    j--;
                }
            }
        }
 
        System.out.println("After removal: " + al);
	}
}
