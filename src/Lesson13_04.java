public class Lesson13_04 {
  public static void main(String[] args){
    Student a001 = new Student();
    a001.name = "sato";
    System.out.println(a001.name);
    a001.calculateAvg(90, 80);

    Student a002 = new Student();
    a002.name = "suzuki";
    System.out.println(a002.name);
    a002.calculateAvg(70, 80);
  }
}
