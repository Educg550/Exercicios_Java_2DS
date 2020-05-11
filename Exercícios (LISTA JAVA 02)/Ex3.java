import java.util.Scanner;
public class Ex3
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite o nome do aluno: ");
		String nome = gg.nextLine();

		System.out.println ("Digite a nota 1: ");
		float nota1 = gg.nextFloat();

		System.out.println ("Digite a nota 2: ");
		float nota2 = gg.nextFloat();

		float media = (nota1 + nota2) / 2;

		if (media >= 0 && media <= 3.99)
		{
			System.out.println ("Nome: " + nome + "\nMedia: " + media + "\nSituacao: Reprovado");
		}
		else if (media >= 4 && media <= 5.99)
		{
			System.out.println ("Nome: " + nome + "\nMedia: " + media + "\nSituacao: Recuperacao");
		}
		else if (media >= 6 && media <= 10)
		{
			System.out.println ("Nome: " + nome + "\nMedia: " + media + "\nSituacao: Aprovado");
		}
		else
		{
			System.out.println ("NOTAS INVALIDAS! (OBS: Devem ser notas de 0 ate 10)");
		}
	}
}