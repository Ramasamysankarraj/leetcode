class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result=0;
       for(int no:nums){
      if(no%2==0){
       result =result|no; 
      }
  } 
  return result; 
    }
}