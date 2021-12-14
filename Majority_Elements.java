package Arrays_Strings;

import java.util.ArrayList;

public class Majority_Elements
{
    // Using Boyer–Moore majority vote algorithm
    public static Integer majorityElement(int[] arr)
    {
        int el1=0, ele2=0;
        int c1=0,c2=0;

        for(int n: arr)
        {
            if (n == el1)
                c1++;
            else if (n == ele2)
                c2++;
            else if (c1 == 0)
            {
                el1 =n;
                c1++;
            }
            else if (c2 == 0)
            {
                ele2 = n;
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }

        // Verification step , because this algo can return us a random value
        c1=0; c2=0;
        for(int n : arr)
        {
            if (n == el1)
                c1++;
            else if (n == ele2)
                c2++;
        }

        // let's verify here

        ArrayList<Integer> ans = new ArrayList<>();
        if (c1 >arr.length / 2)
        {
            ans.add(el1);
        }
        if (c2 > arr.length / 2)
        {
            ans.add(ele2);
        }
        return ans.get(0);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}
