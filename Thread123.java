
import java.util.*;
import java.io.*;

class Thread1 extends Thread {
        public void run() {
            System.out.print("1");
        }
    }
 
class Thread2 extends Thread {
        public void run() {
            System.out.print("2");
        }
    }
class Thread3 extends Thread {
        public void run() {
            System.out.print("3");
        }
    } 
    

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      new Thread1().start();
        new Thread2().start();
        new Thread3().start();
	}
}
