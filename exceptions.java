/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise9;
import java.util.Scanner;
/**
 *
 * @author ARUMUGASAMY
 */
public class exceptions {
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in); 
       int a=2;
       int b=0;
       
       int d[]=new int[3];
       
       int m,n;
       
       String i="hi";
       try
       {
          int c=a/b;
          c=Integer.parseInt(obj.next());
          System.out.println(c);
       }  
       catch(ArithmeticException e)
       {
           System.out.println(e);
       }
       try
       {
          d[5]=4;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
       try
       {
          m=Integer.parseInt(args[0]);
          n=Integer.parseInt(args[1]);
          int k=m+n;
          System.out.println(k);
       }
       catch(NumberFormatException e)
       {
           System.out.println(e);
       }
       try
       {
           i.substring(4);
           System.out.println(i);
       }
       catch(StringIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
       
    }
}

    

