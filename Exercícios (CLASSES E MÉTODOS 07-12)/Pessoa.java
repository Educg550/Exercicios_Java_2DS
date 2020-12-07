public class Pessoa
{
	public String nome;
	public int idade;
	public double altura;
	public String stand;
	public String bordao;
	public String bordaoStand;

	public Pessoa (String nome, int idade, double altura, String stand, String bordao, String bordaoStand)
	{
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.stand = stand;
		this.bordao = bordao;
		this.bordaoStand = bordaoStand;
	}

	public void falar(String dialogo)
	{
		System.out.println(dialogo + ", " + this.bordao);
	}

	public void correr()
	{
		System.out.println("* "+ this.nome + " esta correndo *");
	}

	public void usarStand()
	{
		System.out.println(this.bordaoStand);
	}

	public static void main (String [] args)
	{
		Pessoa Jotaro = new Pessoa("Jotaro Kujo", 17, 1.95, "Star Platinum", "Yare Yare Daze", "ORA ORA ORA ORA!");
		Pessoa Dio = new Pessoa("Dio Brando", 122, 1.95, "Za Warudo", "MUDA MUDA MUDA MUDA!", "MUDA MUDA MUDA MUDA!");

		System.out.println("--------------Jotaro--------------");
		Jotaro.falar("Nao acredito que vim parar num exercicio em Java");
		Jotaro.correr();
		Jotaro.usarStand();

		System.out.println("\n--------------Dio--------------");
		Dio.falar("Voce achou que era apenas um exercicio de Java, mas era eu, DIO");
		Dio.correr();
		Dio.usarStand();
	}
}
