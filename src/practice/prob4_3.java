package practice;

// 上と同じ処理を、do～while文を用いたループで行いなさい。
public class prob4_3 {
  public static void main(String[] args){
    int num = (int)(Math.random()*10)+1;
    System.out.println(num);
    int i = 1;
    do {
      System.out.print("■");
      i++;
    }while (i <= num);
  }
}
