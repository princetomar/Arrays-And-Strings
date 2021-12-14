package Arrays_Strings;

import java.util.Scanner;

public class Container_With_Most_Water
{
    public static int mostWater(int arr[])
    {
        int left=0, right = arr.length-1;
        int area= 0;

        while (left <= right)
        {
            area = Math.max(area, Math.min(arr[left] , arr[right]) * (right - left));

            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array elements : ");
        for (int i =0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println(mostWater(arr));
    }
}
