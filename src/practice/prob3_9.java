package practice;

/* １から100までの乱数を発生させて表示し、50未満ならば、
”50未満です”とそうでなければ、”50以上です”と表示するプログラムを作りなさい。 */
public class prob3_9 {
  public static void main(String[] args) {
    int num = (int) (Math.random() * 100) + 1;
    System.out.println(num);
    if (num < 50) {
      System.out.println("50未満です");
    } else {
      System.out.println("50以上です");

    }
  }
}
