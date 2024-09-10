import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    if(a>b){
      System.out.println("Maximum of "+a+" and "+b+" is "+a);
    }
    else{
      System.out.println("Maximum of "+a+" and "+b+" is "+b);
    }
  }
}
