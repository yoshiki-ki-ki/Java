package practice;

public class prob4_11 {
  public static void main(String[] args) {
    int[] arr = new int[1];
    for (int i = 0; i < 5; i++) {
      int num = (int)(Math.random() * 100)+1;
      System.out.println(num);
      if (arr[0] < num) {
        arr[0] = num;
      }
    }
    System.out.println("最大値：" + arr[0]);
  }
}
