package practice;

public class prob3_12 {
  public static void main(String[] args){
    int num = (int)(Math.random()*20)-10;
    System.out.println(num);
    if (num < 0){
      System.out.println("負の値です");
    } else {
      System.out.println("正の値です");
    }
  }
}
