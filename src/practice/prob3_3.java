package practice;

/*1から100までの乱数を発生させてそれを画面に表示し、
50未満ならば、”50未満です”と表示するプログラムを作りなさい。 */
public class prob3_3 {
  public static void main(String[] args) {
    int num = (int)(Math.random()*100)+1;
    System.out.println(num);
    if(num < 50){
      System.out.println("50未満です");
    }
  }
}
