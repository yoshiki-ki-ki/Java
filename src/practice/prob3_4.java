package practice;

/*1から100までの乱数を発生させてそれを画面に表示し、値が10以下か、
90以上なら、”10以下か90以上の値です”と表示するプログラムを作りなさい。 */
public class prob3_4 {
  public static void main(String[] args) {
    int num = (int)(Math.random()*100)+1;
    System.out.println(num);
    if(num <= 10 || num >= 90){
      System.out.println("10以下か、90以上の値です");
    }
  }
}
