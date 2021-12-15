// Problem link - https://leetcode.com/problems/distribute-candies/

package Arrays_Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distribute_Candies
{
    static int distributeCandies(int arr[])
    {
        int n = arr.length/2;
        Set<Integer> set = new HashSet<>();

        for (int i=0 ;i < arr.length; i++)
        {
            set.add(arr[i]);
        }
        int setSize = set.size();
        return setSize <n ? setSize : n;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter no. of elements : ");
        int n = s.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.println(distributeCandies(arr));
    }
}
