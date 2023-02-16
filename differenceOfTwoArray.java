import java.util.*;

public class differenceOfTwoArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int a[] = new int[n1];
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int b[] = new int[n2];
        for(int i=0; i<b.length; i++)
        {
            b[i] = sc.nextInt();
        }

        int diff[] = new int[n2];
        int c = 0;

        int i = a.length - 1;
        int j = b.length - 1;
        int k = diff.length - 1;

        while(k >= 0)
        {
            int d = 0;
            int aval = i>=0? a[i]: 0;

            if(b[j] + c >= aval)
            {
                d = b[j] + c - aval;
                c = 0;
            }
            else
            {
                d = b[j] + c + 10 - aval;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;

        }

        int idx = 0;
        while(idx < diff.length)
        {
            if(diff[idx] == 0)
            {
                idx++;
            }
            else
            {
                break;
            }
        }

        while(idx < diff.length)
        {
            System.out.println(diff[idx]);
            idx++;
        }

    }
    
}
