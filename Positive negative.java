import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    if(a==0){
      System.out.println("ZERO");
    }
    else if(a>0){
      System.out.println("POSITIVE");
    }
    else{
      System.out.println("NEGATIVE");
    }
  } 
}
