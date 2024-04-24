import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Coding Challenge!");
    System.out.println("Please select your status: \n[1] Student\tNOTICE: This is not yet implemented\n[2] Educator");

    Scanner myScanner = new Scanner(System.in);
    int input = myScanner.nextInt();

    if (input == 1){
      System.out.println("This section is not yet implemented. Exiting program...");
      System.exit(0);
    }
    else {
      System.out.println("Hello Educator. What is your name?");
      String name = myScanner.next();
      Educator user = new Educator(name);

      System.out.println("Please select the task you wish to work on:\n[1] Assign coding challenge");
      input = myScanner.nextInt();
      if (input == 1)
      {
        user.assignCodingChallenge();
      }
      else {

      }

      myScanner.close();
    }
  }
}