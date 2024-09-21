import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int i;
		int arr[] = new int[size];
		for (i = 0; i < size; i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		int x  = sc.nextInt();
		for (i = 0; i < size; i++)
		{
		    if (arr[i] == x)
		    {
		        System.out.println("Found at: "+i);
		        break;
		    }
		}
		if (i>=size)
		{
		    System.out.println("Not found");
		}
		
    }
}
