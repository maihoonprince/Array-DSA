import java.util.*;

public class findElementInAray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the numbe of Element in this Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Element of Array");
        for(int i=0; i<arr.length; i++)
        {
           
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element you want to Find");
        int num = sc.nextInt();

        int idx = -1;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == num)
            {
                idx = i;
                break;
            }
        }

        System.out.println("Index"+ "="+ idx);
    }
    
}
