public class Lesson07_01 {
  public static void main(String[] args) {
    // -100～100まで
    byte var01 = 1;
    // -3万～3万まで
    short var02 = 12345;
    // -20億～20憶まで
    int var03 = 1234567890;
    // 「京」の桁以上。最後に大文字Lを記載する必要あり。
    long var04 = 123456789000L;

    System.out.println(var01);
    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);
  }
}
