package practice;

/* 1から100までの乱数を発生させて表示し、
値が10以下か、90以上なら、”10以下か90以上の値です”と表示し、
そうでなければ、”10より大きく90未満です”と表示するプログラムを作りなさい。 */
public class prob3_10 {
  public static void main(String[] args){
    int num = (int)(Math.random()*100)+1;
    System.out.println(num);
    if (num <= 10 || num >= 90){
      System.out.println("10以下か90以上です");
    } else {
      System.out.println("10より大きく90未満です");
    }
  }
}
