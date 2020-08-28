/*
Autor: Eduardo Cruz Guedes 2ºDS Turma A
*/

import javax.swing.JOptionPane;

public class Ex1
{
    public static void main (String [] args)
    {
        String nome = JOptionPane.showInputDialog("Insira o seu nome:");
        String idade = JOptionPane.showInputDialog("Insira a sua idade:");
        String endereco = JOptionPane.showInputDialog("Insira o seu endereco:");
        int res = JOptionPane.showConfirmDialog(null, "Verifique os seus dados abaixo:\nNome: " + nome + "\nIdade: " + idade + "\nEndereco: " + endereco);

        if (res == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Bem vindo(a) " + nome + "!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dados nao confirmados!");
        }
    }
}
