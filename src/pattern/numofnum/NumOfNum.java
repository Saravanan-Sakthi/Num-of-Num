package pattern.numofnum;
public class NumOfNum {
  void start(int n){  
    String B="1";  // First line will always be one.
    System.out.println(B);
    while(n-->1){  // While loop for checking the numbers in previous string 'B' and appending in the present string 'A'
    //System.out.println("B - "+B);
      String A="";  // String 'A' to store present string.
      int count=0;
      char x= B.charAt(0);
      for (int i=0;i<B.length();i++){
        if (B.charAt(i)==x){  // In case of same simultaneous charcters, increase the count.
          count++;
          if (i==B.length()-1){  // If the characters repeat till the end, we must add the count and the character to the present string.
            A=A+((char)(count+48))+B.charAt(i);
          }
        }
        else{  // If the continuity of a same character breaks then the program checks for repeating current character.
          A=A+((char)(count+48))+B.charAt(i-1);  // The continuity till the previous character should be added to the present string
          count=1;
          if (i==B.length()-1){
            A=A+((char)(1+48))+B.charAt(i);
          }
          x=B.charAt(i);
        }
      }
      B=A;  // At the end of the loop the present string is changed to previous string and print the string.
      System.out.println(B); 
    }
  }
}
