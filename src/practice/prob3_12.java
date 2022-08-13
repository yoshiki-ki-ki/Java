package practice;

/* -10から10までの乱数を発生させて表示し、
もしも負の値であれば”負の値です”と表示し、正の値であれば、
”正の値です”と表示し、そうでなければ、”0です”と表示するプログラムを作りなさい。 */
public class prob3_12 {
  public static void main(String[] args){
    int num = (int)(Math.random()*20)-10;
    System.out.println(num);
    if (num < 0){
      System.out.println("負の値です");
    } else {
      System.out.println("正の値です");
    }
  }
}
