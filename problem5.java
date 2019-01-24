import java.util.*;

public class problem5{    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
	System.out.println("enter how many numbers to add");
        int n=input.nextInt();
        int sum=0;
        for (int i=0; i<n; i++)
            {
		System.out.println("Enter numbers to add:");
                sum +=input.nextInt();
            }
        System.out.println("SUM: " +sum);
    }

}
