package practice;

/*１から3の乱数を発生させ、１なら、”グー”、2なら、
”チョキ”3なら”パー”と表示するプログラムを作りなさい。*/
public class prob3_13 {
  public static void main(String[] args){
    int num = (int)(Math.random()*3)+1;
    System.out.println(num);
    if (num == 1){
      System.out.println("グー");
    } else if (num == 2) {
      System.out.println("チョキ");
    } else {
      System.out.println("パー");
    }
  }
}
