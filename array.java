import java.util.*;

public class array 
{
    public static void main(String[] args)
    {
        // Array declarationb
        int [] arr;

        // array Lenght declaration
        arr = new int[5];

        // Array elements input
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 55;
        arr[3] = 47;
        arr[4] = 90;

        // To print array length
        System.out.println(arr.length);

        // To print every elements of Array...
        for(int i=0; i<=arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
