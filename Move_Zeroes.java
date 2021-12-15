
// Problem link - https://leetcode.com/problems/move-zeroes/

package Arrays_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeroes
{
    static void  swap(int arr[], int i,int j )
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void moveZeroes(int arr[])
    {
        int j=0;

        for (int i=0; i< arr.length ; i++)
        {
            if (arr[i] != 0)
            {
                swap(arr,i,j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}
