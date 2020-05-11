import java.util.Scanner;
public class Ex2
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite o nome do aluno(a): ");
		String aluno = gg.nextLine();

		System.out.println ("Digite a primeira nota: ");
		float n1 = gg.nextFloat();

		System.out.println ("Digite a segunda nota: ");
		float n2 = gg.nextFloat();

		System.out.println ("Digite a terceira nota: ");
		float n3 = gg.nextFloat();

		System.out.println ("Digite a quarta nota: ");
		float n4 = gg.nextFloat();

		System.out.println ("A media em matematica do(a) aluno(a) " + aluno + " eh: " + (n1 + n2 + n3 + n4) / 4);
	}
}