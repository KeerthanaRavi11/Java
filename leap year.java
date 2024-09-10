import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    if(a%4==0){
      if(a%100!=0){
      System.out.println("Leap year");}
      else{
      System.out.println("Not a Leap year");
      }
    }
    else if(a%400==0){
      System.out.println("Leap year");
    }
    else{
      System.out.println("Not a Leap year");
    }
}
}
