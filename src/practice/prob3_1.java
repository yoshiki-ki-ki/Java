package practice;

public class prob3_1 {
  public static void main(String[] args){
    int num = (int)(Math.random()*10)+1; // 1から10までの乱数を発生させる
    System.out.println(num);
    if(num >= 5){
      System.out.println("5以上です");
    }
  }
}
