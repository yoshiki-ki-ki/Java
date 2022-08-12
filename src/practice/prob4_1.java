package practice;

public class prob4_1 {
  public static void main(String[] args){
    int num = (int)(Math.random()*10)+1;
    System.out.println(num);
    for (int i = 1; i <= num; i++) {
      System.out.print("■");
    }
  }
}
