public class Lesson13_02 {
  public static void main(String[] args){
    Student a001 = new Student();
    a001.name = "sato";

    System.out.println(a001.name);
    a001.calculateAvg(90,80);
    // Lesson13_01で作成した「Student」クラスの「calculateAvg」メソッドを利用
  }
}
