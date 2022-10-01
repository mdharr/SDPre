public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = 10.0;
    side2 = 8.0;
    hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
