import java.util.Scanner;
public class Ex1
{
	public static void main (String [] args)
	{
		Scanner gg = new Scanner (System.in);

		System.out.println ("Digite seu nome de usuário: ");
		String usuario = gg.nextLine();

		System.out.println ("Ola " + usuario + "! Seja Bem Vindo!");
	}
}