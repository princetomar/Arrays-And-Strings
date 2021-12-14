package Arrays_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Circular_Array_Loop
{
    static int next(ArrayList<Integer> list,int i)
    {
        return ((i + list.get(i) + list.size()) % list.size());
    }

    static  boolean cicularLoop(ArrayList<Integer> list)
    {
        int n= list.size();
        for (int i=0; i < n ; i++)
        {
            int slow = i,fast=i;

            // if we found 0 value at any index
            if (list.get(i) == 0)
            {
                continue;
            }

            while ((list.get(slow) * list.get(next(list,slow)) >0) && (list.get(fast) * list.get(next(list,fast)) > 0) &&
                list.get(fast) * list.get(next(list,next(list,fast))) >0
            )
            {
                slow = next(list,slow);
                fast = next(list,next(list,fast));

                if (slow == fast)
                {
                    // that means - cycle present but cycle.length > 1
                    if (slow == next(list,slow))
                    {
                        break;
                    }
                    return true;
                }
            }
            slow =i;
            int val = list.get(slow);
            while (val * list.get(slow) > 0)
            {
                int x = slow;
                slow = next(list,slow);
                list.set(x,0);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-1);
        list.add(-1);
        list.add(2);
        list.add(2);
        System.out.println(cicularLoop(list));
    }
}
