package practice;

// forの二重ループを用いて、九九の表を作りなさい。
public class prob4_16 {
  public static void main(String[] args){
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        int k = i * j;
        System.out.print(i + "*" + j + "=" + k + " ");
      }
      System.out.println("");
    }
  }
}
