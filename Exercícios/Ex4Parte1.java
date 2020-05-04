import java.util.Scanner;
import java.lang.Math;
public class Ex4Parte1
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite 't' para triangulo, 'q' para quadrado ou 'i' para IMC: ");
		char opcao = gg.next().charAt(0);

		if (opcao == 't')
		{
			System.out.println ("Digite o tamanho da base: ");
			float base = gg.nextFloat();

			System.out.println ("Digite o tamanho da altura: ");
			float altura = gg.nextFloat();

			System.out.println ("A area do triangulo eh: " + (base * altura) / 2);
		}
		else if (opcao == 'q')
		{
			System.out.println ("Digite o tamanho do lado: ");
			float lado = gg.nextFloat();

			System.out.println ("A area do quadrado eh: " + (Math.pow(lado, 2)));
		}
		else if (opcao == 'i')
		{
			System.out.println ("Digite o peso(Kg): ");
			float peso = gg.nextFloat();

			System.out.println ("Digite a altura(m): ");
			float altura = gg.nextFloat();

			System.out.println ("O IMC eh: " + (peso / (Math.pow (altura, 2))));
		}
		else
		{
			System.out.println ("OPCAO INVALIDA!");
		}
	}
}