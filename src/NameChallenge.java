import java.util.Scanner;

public class NameChallenge {
    public static void main(String[] args) {

        System.out.print("what is your first name: ");
        //setting up scanner
        Scanner obj = new Scanner(System.in);
        //first name input
        String firstName = obj.next();

        System.out.print("what is your last name: ");
        String lastName = obj.next();

        System.out.println("what is your age?");
        byte age = obj.nextByte();

        System.out.println("Hello "+firstName +" "+lastName+" "+"you look good for "+age);
        System.out.println("would you like to hear a joke?");
        String answer = obj.next();
        if (answer.equals("yes")){
            System.out.println("knock knock");
            Scanner joke = new Scanner(System.in);

            joke.nextLine();
            System.out.println("who's there");
            joke.nextLine();
            System.out.println("luke");
            joke.nextLine();
            System.out.println("luke who?");
            joke.nextLine();
            System.out.println("luke through the keyhole and you'll find out!!");
        }else {
            System.out.println("your boring!");
        }
    }
}