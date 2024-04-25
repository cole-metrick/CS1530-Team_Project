import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Coding Challenge!");
    System.out.print("Please select your status: \n[1] Student\n[2] Educator: ");

    Scanner myScanner = new Scanner(System.in);
    int input = myScanner.nextInt();

    if (input == 1){
      System.out.print("Hello Student. What is your name?  ");
      String name = myScanner.next();
      System.out.print("What is your Educator's name?  ");
      String user = myScanner.next();
      Student student = new Student(name, user);
      
    }
    else {
      System.out.print("Hello Educator. What is your name?  ");
      String name = myScanner.next();
      System.out.print("What is your student's name?  ");
      String student = myScanner.next();
      Educator user = new Educator(name, student);


      System.out.print("Please select the task you wish to work on:\n[1] Assign coding Challenge\n[0] Quit ");
      input = myScanner.nextInt();
      if (input == 1)
      {

            System.out.print("Enter the Title of the Coding Challenge: ");
            String title = myScanner.next();
            System.out.print("Enter a Description of the Challenge: ");
            String desc = myScanner.next();
            System.out.print("Enter the Difficulty Level (Easy, Medium, Hard): ");
            String diff = myScanner.next();
            System.out.print("Enter Coding language: ");
            String lang = myScanner.next();

            CodingChallenge challenge = new CodingChallenge(title, desc, diff,lang);
            user.addCodingChallenge(challenge);
            System.out.print(challenge);

      }
      else {
  
      }

      myScanner.close();
    }
  }
}