package practice;

/*1から100までの乱数を発生させてそれを画面に表示し、
値が20以上80未満であれば、”20以上80未満です”と表示するプログラムを作りなさい。 */
public class prob3_5 {
  public static void main(String[] args){
    int num = (int)(Math.random()*100)+1;
    System.out.println(num);
    if(num >= 20 && num < 80){
      System.out.println("20以上80未満です");
    }
  }
}
