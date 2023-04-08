import java.io.File;
import java.util.Scanner;

public class Test 
{

    public static void main(String[] args) 
    {
    	File fle;
    	
    	try 
    	{
    		fle = new File ("C://Users//gilbe//OneDrive//Desktop//inputValue.txt");
    		Scanner sc=new Scanner(fle);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s", s1);
                System.out.printf("%03d", x);
                System.out.printf("\n");
            }
            System.out.println("================================");
    		
    	}catch (Exception e) 
    	{
    		System.out.println(e.toString());
    	}
            

    }
}



