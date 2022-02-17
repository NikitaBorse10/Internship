import java.io.*;
import java.util.*;

class calCutaor
{
    
    public static void main(String args[])
    {
        int c;
        Scanner sc = new Scanner(System.in);
        
        
        
        do
        
        {   
            System.out.println("Press 1 : for Addition:");
            System.out.println("Press 2 : for Subtraction:");
            System.out.println("Press 3: for Multiplication:");
            System.out.println("Press 4: for Division:");
            System.out.println("Enter Your Choice:");
            c =sc.nextInt();
            int sum,sub,mul,div;
            System.out.print("Enter first number:");
            int no1=sc.nextInt();
            System.out.print("Enter the second number:");
            int no2=sc.nextInt();

            switch(c)
            {
                    
                case 1:
                        sum=no1+no2;
                        System.out.println("Addition of Two numbers:"+sum);
                        break;
                case 2: sub=no1-no2;
                        System.out.println("Subtraction of Two numbers:"+sub);
                        break;
                case 3: mul=no1*no2;
                        System.out.println("Multiplication of Two numbers:"+mul);
                        break;
                case 4:div=no1/no2;
                        System.out.println("Division of Two numbers:"+div);
                        break;
                default :
                System.out.print("Invalid Choice:");
            }
            System.out.println("\n Do you Want to Continue:[Enter zero for Exit]:");
            c=sc.nextInt();


        }while(c!=0);
        System.out.println("Thank U.... ");
    }
}
            
        
        
        
    
    
    
