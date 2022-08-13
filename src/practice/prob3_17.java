package practice;

/* 1から100までの数値を乱数で発生させ、以下の処理をしなさい。

50以下の場合”50以下です。”と表示。
偶数の場合、”偶数です。”と表示。
ただし、50以下でかつ偶数の場合、”50以下の偶数です。”と表示。 */
public class prob3_17 {
  public static void main(String[] args){
    int num = (int)(Math.random()*100)+1;
    System.out.println(num);
    if (num % 2 == 0 && num <= 50){
      System.out.println("50以下の偶数です");
    } else if (num % 2 == 0) {
      System.out.println("偶数です");
    } else if (num <= 50) {
      System.out.println("50以下です");
    } else {
    }
  }
}
