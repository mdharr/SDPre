import java.util.Scanner;

public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    while(count <= 20) {
      sum += count;
      // sum = sum + count;
      count++;
      // count = count + 1;
    }
    System.out.println(sum);
  }
}
