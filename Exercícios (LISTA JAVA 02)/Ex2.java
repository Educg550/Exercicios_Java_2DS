import java.util.Scanner;
public class Ex2
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite um ano: ");
		int ano = gg.nextInt();

		if (ano < 2020)
		{
			System.out.println (ano + " eh do passado");
		}
		else if (ano == 2020)
		{
			System.out.println (ano + " eh o ano atual");
		}
		else
		{
			System.out.println (ano + " eh do futuro");
		}
	}
}