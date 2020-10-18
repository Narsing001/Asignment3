 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assinment;

import java.util.Scanner;

/**
 *
 * @author Narsing
 */
public class Assinment {
    
       
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sub1, sub2,sub3,sub4,sub5,precentage,add; 
               
        
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the marks for sub1");
       sub1=sc.nextInt();
       System.out.println("Enter the marks for sub2");
       sub2=sc.nextInt();
       System.out.println("Enter the marks for sub3");
       sub3=sc.nextInt();
       System.out.println("Enter the marks for sub4");
       sub4=sc.nextInt();
       System.out.println("Enter the marks for sub5");
       sub5=sc.nextInt();
      add=sub1+sub2+sub3+sub4+sub5;
      precentage=add/5;
      if(precentage>35&&precentage<=50){
           System.out.println("your grade is 'c'"+"prcentage="+precentage);
       
       }
      else if(precentage>50&&precentage<=65){
           System.out.println("your grade is 'B' "+"prcentage="+precentage);
          
        
    }
      else if(precentage>65&&precentage<=85){
          System.out.println("your grade is 'A' "+"prcentage="+precentage);
          
      }
       else if(precentage>85&&precentage<=100){
          System.out.println("your grade is 'A+' "+"prcentage="+precentage);
          
      }
      else
       {
           System.out.println("your grade is 'F'"+"Fail!");
       }
       
        }
    
    
}
