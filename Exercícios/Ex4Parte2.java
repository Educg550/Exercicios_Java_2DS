import java.util.Scanner;
public class Ex4Parte2
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite uma distancia(Km): ");
		float km = gg.nextFloat();

		System.out.println ("A distancia em milhas eh: " + (km / 1.60934));
	}
}