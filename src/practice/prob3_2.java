package practice;

/*1から10までの乱数を発生させてそれを画面に表示し、
その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。 */
public class prob3_2 {
  public static void main(String[] args) {
    int num = (int)(Math.random()*10)+1;
    System.out.println(num);
    if(num == 1){

    } else{
      System.out.println("1ではありません");
    }
  }
}
