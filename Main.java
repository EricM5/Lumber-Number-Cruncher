import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.println("Lumber Scrap Calculator: ");
      System.out.print("Enter the length of your 2 x 4 in inches: ");
      Scanner in = new Scanner(System.in);
      int inch = in.nextInt();
      System.out.print("Enter the length of the piece needed in inches: ");
      int lengthneeded = in.nextInt();

      int completepieces = inch / lengthneeded;
      int remaining = inch % lengthneeded;
      int pieces = lengthneeded % inch;
      int addedtogether = completepieces * pieces;
      int totalremainder = inch % addedtogether;

      System.out.println("\nA 2 x 4 with a length of: " + inch + " inches:");
      System.out.println("Will produce: " + completepieces + ", " + pieces + " inch pieces.");
      System.out.println("There is a " + totalremainder + " inch piece of scrap left over.\n\n");
    }
  }
}