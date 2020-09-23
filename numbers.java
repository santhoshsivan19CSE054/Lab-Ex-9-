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
public class numbers {
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    String a=new String();
    System.out.println("Enter the word:");
    a = obj.next();
    
    try 
       {
        if(a.equals("hi"))
           {
               throw new HiFoundException ("'hi' not allowed");   
           } 
        System.out.println("Valid:"+a);
       }
       catch(HiFoundException e)
       {
           System.out.println(e);
       }
    numbers obj1=new numbers(); 
    try
    {
    obj1.checkchar();
    }
    catch(CharFoundException e)
    {
       System.out.println(e); 
    }
     
    }
    void checkchar() throws CharFoundException
    {
      boolean flag=true;
      Scanner obj2=new Scanner(System.in);
      System.out.println("Enter a string of length 3:");
      String s=obj2.next();
      char c[]=new char[3];
      c=s.toCharArray();
      int a[]=new int[2];
      int j=0;
      int sum=0;
      
      for(int i=0;i<c.length;i++)
      {
          if(c[i]>=48 && c[i]<=57)
          {
              char b=c[i];
              String z=Character.toString(b);
              a[j]=Integer.parseInt(z);
              sum=sum+a[j];
              j++;
              
              if(flag==false)
              {
                  break;
              }
          }
          else
          {
              flag=false;
              throw new CharFoundException("Character is found"); 
          }
      }
      if(flag==true);
      {
          System.out.println("Sum:"+sum);
      }
    }

}
class HiFoundException extends Exception
{
    HiFoundException(String msg)
    {
        super(msg);
    }
}
class CharFoundException extends Exception
{
   CharFoundException(String msg)
    {
        super(msg);
    }
}

    

