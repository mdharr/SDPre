import java.util.Scanner;

public class Objective6Lab1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Using numbers 1 through 12, please enter the current month.");
    int month = scanner.nextInt();

    switch (month) {
      case 1:
        System.out.println("It is currently the month of January.");
        break;
      case 2:
        System.out.println("It is currently the month of February.");
        break;
      case 3:
        System.out.println("It is currently the month of March.");
        break;
      case 4:
        System.out.println("It is currently the month of April.");
        break;
      case 5:
        System.out.println("It is currently the month of May.");
        break;
      case 6:
        System.out.println("It is currently the month of June.");
        break;
      case 7:
        System.out.println("It is currently the month of July.");
        break;
      case 8:
        System.out.println("It is currently the month of August.");
        break;
      case 9:
        System.out.println("It is currently the month of September.");
        break;
      case 10:
        System.out.println("It is currently the month of October.");
        break;
      case 11:
        System.out.println("It is currently the month of November.");
        break;
      case 12:
        System.out.println("It is currently the month of December.");
        break;
      default:
        System.out.println("That is not a valid number.");
        break;
    }
  }
}
