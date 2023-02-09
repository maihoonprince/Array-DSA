import java.util.*;

public class swapElementinArray 
{
    public static void main(String[] args)
    {
        int[] arr;

        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        swap(arr, 0, 2);
       
        for(int i=0; i<=arr.length; i++)
        {
            System.out.println(arr[i]);
        } 
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
