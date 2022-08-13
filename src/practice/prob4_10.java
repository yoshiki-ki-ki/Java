package practice;
// forループを用いて、１から100までの乱数を５回発生させ、表示させなさい。
public class prob4_10 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      int num = (int)(Math.random() * 100)+1;
      System.out.println(num);
    }
  }
}
