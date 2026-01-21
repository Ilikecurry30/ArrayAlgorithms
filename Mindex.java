public class Mindex {
    public static void main(String [] args){
        int nums [] = {0,-2,5,7,9};
        int min = nums[0];
        int index = 0; 
        for (int i = 0; i<nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
                index = i;
                System.out.println(index);
            }
        }
        System.out.println(min);
    }
}
