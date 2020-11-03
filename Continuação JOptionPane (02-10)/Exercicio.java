// Código feito por Eduardo Cruz Guedes - 2ºDS

import javax.swing.JOptionPane;

public class Exercicio
{
    public static void main (String [] args)
    {
        String idade;

        JOptionPane.showMessageDialog(null, "Atencao! Esse programa exibira a sua idade e a regiao em que voce nasceu", "Alerta", JOptionPane.WARNING_MESSAGE);

        idade = JOptionPane.showInputDialog(null, "Digite a sua idade: ");

        Object [] regioes = {"Sudeste", "Sul", "Nordeste", "Norte", "Centro-Oeste"};
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha a sua regiao de nascimento:", "Escolha", JOptionPane.WARNING_MESSAGE, null,
                regioes, regioes[0]);

        Object [] opcoes = {"Sim", "Vai logo"};
        JOptionPane.showOptionDialog(null, "Gostaria de prosseguir?", "Confirmacao", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opcoes, opcoes[0]);

        //JOptionPane.showMessageDialog(null, (""))

        if(selectedValue.equals("Sudeste"))
        {
            JOptionPane.showMessageDialog(null, ("Voce tem " + idade + " anos e precisa de um tubo de oxigenio para respirar"));
        }
        else if (selectedValue.equals("Sul"))
        {
            JOptionPane.showMessageDialog(null, ("Voce tem " + idade + " anos e toma chimarrao, hmmmmm"));
        }
        else if(selectedValue.equals("Nordeste"))
        {
            JOptionPane.showMessageDialog(null, ("Voce tem " + idade + " anos e come muito acaraje, hmmmmm"));
        }
        else if(selectedValue.equals("Norte"))
        {
            JOptionPane.showMessageDialog(null, ("Voce tem " + idade + " anos e tem uma jiboia de estimacao"));
        }
        else if(selectedValue.equals("Centro-Oeste"))
        {
            JOptionPane.showMessageDialog(null, ("Voce tem " + idade + " anos e derrete de calor todos os dias"));
        }
    }
}