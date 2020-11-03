// Código feito por Eduardo Cruz Guedes - 2ºDS

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Exercicio
{
    public static void main (String [] args)
    {
    	String [] options = {"Comecar", "Nao", "Por favor, nao"};
    	int resTest = JOptionPane.showOptionDialog(null, 
    		"Teste - O quao Jojofag voce eh?", "Questionario",
    		JOptionPane.DEFAULT_OPTION,
    		JOptionPane.QUESTION_MESSAGE,
    		null,
    		options, options[0]
    		);

    	if (resTest != 0)
    	{
    		exitError();
    	}

    	Object [] jojoptions = {"Joseph", "Jonathan", "Giorno", "Josuke", "Jotaro"};
    	Object question1 = JOptionPane.showInputDialog(null,
    		"Qual o JoJo da parte 4?", "Primeira Pergunta",
    		JOptionPane.QUESTION_MESSAGE,
    		null,
    		jojoptions, jojoptions[0]
    		);

    	if (question1 != "Josuke")
    	{
    		exitError();
    	}

    	Object [] gioptions = {"Stand", "MUDA MUDA MUDA!", "Hamon", "Zeppeli's Requiem", "Loggins"};
    	Object question2 = JOptionPane.showInputDialog(null,
    		"Qual a tecnica de batalha utilizada durante as primeiras sagas (Phantom Blood e Battle Tendency)?", "Segunda Pergunta",
    		JOptionPane.QUESTION_MESSAGE,
    		null,
    		gioptions, gioptions[0]
    		);

    	if (question2 != "Hamon")
    	{
    		exitError();
    	}

    	Object [] gordoptions = {"Talking Head", "Black Sabbath", "Little Feet", "King Crimson", "Purple Haze"};
    	Object question3 = JOptionPane.showInputDialog(null,
    		"Qual o stand utilizado pelo personagem Polpo?", "Terceira Pergunta",
    		JOptionPane.QUESTION_MESSAGE,
    		null,
    		gordoptions, gordoptions[0]
    		);

    	if (question3 != "Black Sabbath")
    	{
    		exitError();
    	}

		ImageIcon nescau = new ImageIcon ("nescau.jpg");
    	JOptionPane.showMessageDialog(null, 
    		"Parabens, voce acabou o teste! Verdadeiro JoJofag, aqui esta sua recompensa!", "Parabens!",
    		JOptionPane.PLAIN_MESSAGE,
    		nescau
    		);
    }

    static void exitError ()
    {
		JOptionPane.showMessageDialog(null,
    		"Saia daqui, poser!", "Saia!",
    		JOptionPane.WARNING_MESSAGE
    		);
		System.exit(0);
    }
}