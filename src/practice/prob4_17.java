package practice;
/*forの二重ループを用いて、以下のような図形を表示させるプログラムを作りなさい。
■□□□□□□□□□
■■□□□□□□□□
■■■□□□□□□□
■■■■□□□□□□
■■■■■□□□□□
■■■■■■□□□□
■■■■■■■□□□
■■■■■■■■□□
■■■■■■■■■□
■■■■■■■■■■
 */
public class prob4_17 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        if (j <= i) {
          System.out.print("■ ");
        } else {
          System.out.print("□ ");
        }
      }
      System.out.println("");
    }
  }
}
