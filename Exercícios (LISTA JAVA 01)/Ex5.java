import java.util.Scanner;
public class Ex5
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite uma quantidade de meses: ");
		int meses = gg.nextInt();

		System.out.println ("A quantidade em dias eh: " + (meses * 30));
	}
}