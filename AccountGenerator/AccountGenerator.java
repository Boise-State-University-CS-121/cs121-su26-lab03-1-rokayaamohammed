import java.util.Random;
import java.util.Scanner;

public class AccountGenerator 
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        Random myGen = new Random();

        /* Input processing */
        System.out.print("Enter your first name: ");
        String userFirstName = kbd.nextLine();
        System.out.print("Enter your last name: ");
        String userLastName = kbd.nextLine();
        
        /* Convert user values to lowercase */
        userFirstName = userFirstName.toLowerCase();
        userLastName = userLastName.toLowerCase();

        /* Grab specific characters from user input */
        char firstLetterOfFirstName = userFirstName.charAt(0);
        String firstFiveOfLastName = userLastName.substring(0,5);

        /* Grab random int */
        int myInt = myGen.nextInt(90)+10;

        /* Output processing */
        String username = firstLetterOfFirstName + firstFiveOfLastName +myInt;
        System.out.println("Username: " + username);

        kbd.close();

    }



}
