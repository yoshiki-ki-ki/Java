package practice;

/*１から10までの乱数を発生させて表示し、5以上ならば、
”5以上です”と表示し、そうでなければ、”5未満です”と表示するプログラムを作りなさい。 */
public class prob3_7 {
  public static void main(String[] args){
    int num = (int)(Math.random() * 10)+1;
    System.out.println(num);
    if(num >= 5){
      System.out.println("5以上です");
    } else {
      System.out.println("5未満です");
    }
  }
}
