import javax.swing.*;

public class vamos {
    public static void main(String[] args){
        atributos eu = new atributos();

        for (int i = 0; i < 3; i++){
            eu.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
            eu.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade")));
            eu.setValor1(Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro saldo")));
            eu.setValor2(Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo saldo")));
            eu.calculaTotal(eu.getValor1() + eu.getValor2());

            System.out.println(eu.mostrar());
            System.out.println("\n");

        }
    }
}
