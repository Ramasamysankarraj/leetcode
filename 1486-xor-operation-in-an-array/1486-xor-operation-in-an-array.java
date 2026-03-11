class Solution {
    public int xorOperation(int n, int start) {
         int count=1;
      int result=0;
      while(count<=n){
          result = result^start;
          start = start + 2;
          count++;
      }
      return result;
    }
}