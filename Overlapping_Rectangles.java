
// Problem link - https://leetcode.com/problems/rectangle-overlap

package Arrays_Strings;

public class Overlapping_Rectangles
{
    static boolean overlappingRect(int arr1[], int arr2[])
    {
        return  !((arr1[2] <= arr2[0]) || (arr1[1]>=arr2[3]) || (arr1[0] >= arr2[2]) || (arr1[3] <= arr2[1]));
    }

    public static void main(String[] args) {
        int arr1[] = {0,0,1,1};
        int arr2[] = {1,0,2,1};
        System.out.println(overlappingRect(arr1,arr2));
    }
}
