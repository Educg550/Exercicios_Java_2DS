import java.util.Scanner;

public class Ex1
{
    public static void main (String [] args)
    {
        Scanner leitor = new Scanner (System.in);

        String[] usuarios = new String[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("\nDigite o nome do usuario (%d/5)", (i + 1));
            usuarios[i] = leitor.nextLine();
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("\nUsuario %d: %s", (i + 1), usuarios[i]);
        }

        System.out.print("\n");
    }
}