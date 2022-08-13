package practice;

/* １から100までの数値を乱数で発生させて表示し、以下の処理を行いなさい。

80点以上なら”優”と表示。
80点未満、70点以上なら、”良”と表示。
70点未満、60点以上なら、”可”と表示。
60点未満なら、”不可”と表示。 */
public class prob3_15 {
  public static void main(String[] args){
    int num = (int)(Math.random()*100)+1;
    System.out.println("点数：" + num);
    if (num >= 80){
      System.out.println("優");
    } else if (num < 80 && num >= 70) {
      System.out.println("良");
    } else if (num < 70 && num >=60) {
      System.out.println("可");
    } else {
      System.out.println("不可");
    }
  }
}
