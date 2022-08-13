package practice;

/*forループを用いて、１から１００までの乱数を５回発生させ、
表示し、終了後その中の最小値を表示しなさい。 */
public class prob4_12 {
  public static void main(String[] args) {
    int[] arr = new int[1];
    for (int i = 0; i < 5; i++) {
      int num = (int)(Math.random() * 100)+1;
      System.out.println(num);
      if (arr[0] > num || i == 0) {
        arr[0] = num;
      }
    }
    System.out.println("最小値：" + arr[0]);
  }
}
