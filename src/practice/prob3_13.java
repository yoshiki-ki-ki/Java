package practice;

public class prob3_13 {
  public static void main(String[] args){
    int num = (int)(Math.random()*3)+1;
    System.out.println(num);
    if (num == 1){
      System.out.println("グー");
    } else if (num == 2) {
      System.out.println("チョキ");
    } else {
      System.out.println("パー");
    }
  }
}
