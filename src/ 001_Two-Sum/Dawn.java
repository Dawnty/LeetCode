
int* twoSum(int* nums, int numsSize, int target) {
    static int result[2]={0};
    for(int i=0;i<numsSize;i++){
         for(int j=i+1;j<numsSize;j++){
             if(nums[i]+nums[j]==target){
                   result[0] = i;  
                   result[1] = j; 
                return result;}
                       
    }}
    return 0;
}
    
