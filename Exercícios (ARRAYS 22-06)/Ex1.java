public class Ex1
{
	public static void main (String args [])
	{
		int[] vetor = new int[10];

		int j = 0;

		for (int i = 0; i <= 18; i += 2)
		{
			vetor[j] = i;
			System.out.printf ("\nVetor[%d] = %d", j, vetor[j]);
			j++;
		}

		System.out.print ("\n");
		vetor[4] = 87;
		vetor[2] = 57;

		for (int i = 2; i <= 4; i += 2)
		{
			System.out.printf ("\nVetor[%d] = %d", i, vetor[i]);
		}
	}
}