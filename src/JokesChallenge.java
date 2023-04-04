import java.util.Scanner;

public class JokesChallenge {
    public static void main(String[] args) {

        System.out.println("knock knock");
        try (Scanner obj = new Scanner(System.in)) {
            obj.nextLine();
            System.out.println("who's there");
            obj.nextLine();
            System.out.println("luke");
            obj.nextLine();
            System.out.println("luke who?");
            obj.nextLine();
        }

        System.out.println("luke through the keyhole and you'll find out!!");
    }
}

