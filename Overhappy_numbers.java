
// Problem link - https://leetcode.com/problems/happy-number/

package Arrays_Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Overhappy_numbers
{

    // Method to update n
    static int update(int n)
    {
        int out =0;

        while (n > 0)
        {
            int digit = n %10;
            out = out+ digit*digit;
            n = n/10;

        }
        return out;
    }
    // this will return true if a no. is an overhappy no. or else return false
    public static boolean check(Set<Integer> set, int n)
    {
        if (n == 1)
            return true;

        if (set.contains(n))
        {
            return  false;
        }

        set.add(n);
        n = update(n);
        return check(set, n);
    }

    static boolean overhappy(int n)
    {
        Set<Integer> set = new HashSet<>();
        return check(set,n );
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to check it's overhappy or not : ");
        int n = scan.nextInt();
        System.out.print(n+ " is ");
        System.out.println(overhappy(n));
    }
}
