package practice;

/* １から100までの乱数を発生させ、値が20以上80未満であれば、
”20以上80未満です”と表示し、そうでなければ、”20未満か、80以上です”と
表示するプログラムを作りなさい。 */
public class prob3_11 {
  public static void main(String[] args){
    int num = (int)(Math.random()*100)+1;
    System.out.println(num);
    if (num >= 20 && num < 80){
      System.out.println("20以上80未満です");
    } else {
      System.out.println("20未満か、80以上です");
    }
  }
}
