import java.util.Arrays;
public class NumbersSmallerThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
       
        int[] result  = new int[nums.length];
       

        for (int i = 0;i<nums.length;i++){

            int count = 0;
            for (int j = 0;j<nums.length;j++){
                if (i!=j && nums[j]<nums[i]) count+=1;

            }
            result[i] = count;

        }
        return result;

    }
    public static void main(String[] args){
        NumbersSmallerThanCurrent ns = new NumbersSmallerThanCurrent();
        int[] nums = {5,2,3,6,4,1};
        System.out.println(Arrays.toString(ns.smallerNumbersThanCurrent(nums)));
    }
}

