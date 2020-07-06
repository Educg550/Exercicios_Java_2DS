import java.util.Scanner;

public class Ex2
{
    public static void main (String [] args)
    {
        Scanner leitor = new Scanner (System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("\nDigite um numero (%d/10): ", (i + 1));
            numeros[i] = leitor.nextInt();
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("\nNumero %d: %d", (i + 1), numeros[i]);
        }

        System.out.print("\n");
    }
}