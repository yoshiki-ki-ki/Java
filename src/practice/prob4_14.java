package practice;

/* 1から10までの乱数を発生させ、
偶数なら、★を、奇数なら☆を、
それぞれ発生した数の文だけ表示するプログラムを作りなさい。 */
public class prob4_14 {
  public static void main(String[] args){
    int num = (int)(Math.random() * 10)+1;
    if (num % 2 == 0) {
      for (int i = 0; i < num; i++) {
        System.out.print("★ ");
      }
    } else if (num % 2 == 1) {
      for (int i = 0; i < num; i++) {
        System.out.print("☆ ");
      }
    }
  }
}
