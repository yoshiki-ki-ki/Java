package practice;

// ループを用いて、１から100までの数字を表示しなさい。ただし、このとき、数は10ごとに改行すること。
public class prob4_15 {
  public static void main(String[] args){
    for (int i = 1; i <= 100; i++) {
      System.out.print(i + " ");
      if (i % 10 == 0) {
        System.out.println("");
      }
    }
  }
}
