import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //variables
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;

    //process 1 - gets input from player A and validates it
        do
        {
            System.out.println("Type ‘R’ for Rock, ‘P’ for Paper, or ‘S’ for \n" +
                    "Scissors.\n");
            playerA = in.nextLine();
            if (in.hasNextLine())
            {

            }
            else
            {
                in.nextLine();
                System.out.println("Please enter only R or P or S.");
            }
        } while (true);


    }
}