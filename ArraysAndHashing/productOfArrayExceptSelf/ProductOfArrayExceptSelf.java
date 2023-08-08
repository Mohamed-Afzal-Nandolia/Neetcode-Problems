package ArraysAndHashing.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        //create 3 new arrays
        int[] pre = new int[n];
        int[] suff = new int[n];
        int[] ans = new int[n];

        pre[0] = 1;//assign the 1st element of pre[0] = 1 -> [1,0,0,0]
        suff[n-1] = 1;//and assign the last element of suff[n-1] = 1 -> [0,0,0,1]

        for(int i = 1; i < n; i++){//starting from the second index
            pre[i] = pre[i - 1] * nums[i - 1];//[1, 1, 2, 6]
        }
        for(int i = n - 2; i >= 0; i--){
            suff[i] = suff[i + 1] * nums[i + 1];//[24, 12, 4, 1]
        }
        for(int i = 0; i < n; i++){//multiply both the arrays
            ans[i] = pre[i] * suff[i];////[24, 12, 8, 6]
        }
        return ans;
    }
}
