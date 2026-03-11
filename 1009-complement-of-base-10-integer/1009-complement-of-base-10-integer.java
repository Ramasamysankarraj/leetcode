class Solution {
   static  String convertDecimalToBinary( int num){
      String s="";
      while(num>=1){
          int x= num%2;
          num=num/2;
          s=x+s;
      }
      return s;
   }
     static String complement(String value){
        String res="";
        int n = value.length();
        for(int i=0;i<value.length();i++){
          if(value.charAt(i)=='0'){
              res=res+"1";
          }
          else{
              res = res+"0";
          }
        }
        return res;
    }
    static int convertBinaryToDecimal(String binary){
      int decimal=0;
   int base=1;
      for(int i=binary.length()-1; i>=0; i--){
         if(binary.charAt(i)=='1'){
             decimal+=base;
         }
         base*=2;
      }
      return decimal;
    }
    public int bitwiseComplement(int n) {
      if(n==0){
        return 1;
      }
        String l = convertDecimalToBinary(n);
        String k = complement(l);
        int j = convertBinaryToDecimal(k);
        
        return j;
    }
}