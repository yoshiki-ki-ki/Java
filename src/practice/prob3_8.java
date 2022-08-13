package practice;

/*1から10までの乱数を発生させて表示し、
その値が1でなければ”１ではありません”と表示し、
1であれば、”1です。”と表示するプログラムを作りなさい。 */
public class prob3_8 {
  public static void main(String[] args){
    int num = (int)(Math.random()*10)+1;
    System.out.println(num);
    if(num != 1){
      System.out.println("1ではありません");
    } else if(num == 1){
      System.out.println("1です");

    }
  }
}
