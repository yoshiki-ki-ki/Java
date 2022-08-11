
public class Lesson11_03 {
  public static void main(String[] args){
    for (int i = 0; i <= 4; i++){
      if (i == 3){
        continue;
      }
      // 繰り返し処理の中でiが3の時に処理をスキップする
      System.out.println(i);
    }
  }
}
