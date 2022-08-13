package practice;

/* １から10までの乱数を発生させ、もしも5以上だったら、
その数だけ★マークを表示し、5未満だったら、
その数を表示するプログラムを作りなさい。 */
public class prob4_13 {
  public static void main(String[] args){
    int num = (int)(Math.random()*10)+1;
    if (num >= 5) {
      for (int i = 1; i <= num; i++) {
        System.out.print("★ ");
      }
    } else {
      System.out.println("発生した数値：" + num);
    }
  }
}
