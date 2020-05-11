import java.util.Scanner;
public class Ex1
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite um numero: ");
		int num = gg.nextInt();

		if (num % 2 == 0)
		{
			System.out.println ("O numero " + num + " eh par!");
		}
		else
		{
			System.out.println ("O numero " + num + " eh impar!");
		}
	}
}