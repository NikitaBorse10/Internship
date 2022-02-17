import java.util.Scanner;  
public class transpose   
{  
    public static void main(String args[])    
    {  
    int i, j;  
    System.out.println("Enter total rows and columns: ");  
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the no of row:");
    int n = sc.nextInt();  
     System.out.print("Enter the no of columns:");
    int m = sc.nextInt();  
    int array[][] = new int[n][m];  
    System.out.println("Enter matrix:");  
    for(i = 0; i < n; i++)  
    {  
        for(j = 0; j < m; j++)   
            {  
            array[i][j] = sc.nextInt();  
           // System.out.println(" ");  
            }  
    }  
    System.out.println("The above matrix before Transpose is ");  
    for(i = 0; i < n; i++)  
        {  
            for(j = 0; j < m; j++)  
            {  
            System.out.print(array[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("The above matrix after Transpose is ");  
    for(i = 0; i < m; i++)  
        {  
            for(j = 0; j < n; j++)  
            {  
                System.out.print(array[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }  
}  