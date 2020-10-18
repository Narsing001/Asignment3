  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment3;

import java.util.Scanner;

/**
 *
 * @author Narsing
 */
public class Asignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String empname;
        int dob,doy,dom,m_salary,c_doy,c_dom,c_date;
        double A_salary,tax_a;
        
       int age,calculate_d,calculate_m,calculate_y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employe name");
        empname=sc.next();
        sc.nextLine();
         System.out.println("Enter the Employe date of birth");
         dob=sc.nextInt();
         System.out.println("Enter the Employe date of month");
         dom=sc.nextInt();
          System.out.println("Enter the Employe date of yaer");
         doy=sc.nextInt();
          System.out.println("Enter the Employe salary");
         m_salary=sc.nextInt();
         System.out.println("Enter  todays date");
         c_date=sc.nextInt();
         System.out.println("Enter todays month");
         c_dom=sc.nextInt();
          System.out.println("Enter todays year");
         c_doy=sc.nextInt();
         if(dom>c_dom){
             calculate_m=dom-c_dom;
             System.out.println("month="+calculate_m);
             
        }
         else
         {
             calculate_m=c_dom-dom;
             System.out.println("month="+calculate_m);
             
         } 
         if(dob>c_date){
             calculate_d=dob-c_date;
             System.out.println("Day="+calculate_d);
         }
         else
         {
             calculate_d=c_date-dob;
             System.out.println("Day="+calculate_d);
         }
         calculate_y=c_doy-doy;
          System.out.println("Year="+calculate_y);
          age=calculate_y;
          System.out.println("Employe age is="+age);
           System.out.println("employe name="+empname);
          
            A_salary=m_salary*12;
            System.out.println("Anual Salary="+A_salary);
            if(A_salary>500000){
                
                
               tax_a=0.2*A_salary;
                System.out.println("employe paid tax="+tax_a);
                
            }
            else if(A_salary>400000&&A_salary<500000)
            {
               
                tax_a=0.15*A_salary;
                System.out.println("employe paid tax="+tax_a); 
            }
                 
             else if(A_salary>300000&&A_salary<400000)
            {
                
                
                tax_a=0.1*A_salary;
               
                System.out.println("employe paid tax="+tax_a); 
            }
             else if(A_salary>200000&&A_salary<300000)
            {
               
                tax_a=0.05*A_salary;
                System.out.println("employe paid tax="+tax_a); 
            }
             else{
                 System.out.println("employe not paid any tax"); 
             }
                        
    }
    
}
