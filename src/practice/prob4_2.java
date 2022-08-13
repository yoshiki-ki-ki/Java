package practice;

// 上と同じ処理を、while文で作ったループで行いなさい。
public class prob4_2 {
  public static void main(String[] args){
    int num = (int)(Math.random()*10)+1;
    System.out.println(num);
    int i = 1;
    while (i <= num){
      System.out.print("■");
      i++;
    }
  }
}
