package calculos;

import Operacoes.Soma;
import Operacoes.Subtracao;
import Operacoes.Menssagem;
import javax.swing.JOptionPane;


public class Calculos {

    
    public static void main(String[] args) {
        
      
        //Subtracao Sub = new Subtracao(20,10,0);
        
        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
        
        
        Soma S = new Soma();
        S.setNumero1(valor1);
        S.setNumero2(valor2);
        float Result;
        Result = S.getNumero1() + S.getNumero2();
        
        System.out.println("Resultado da Soma é : " + Result );
        S.mostraRes();
        S.mostraRes();
        
        
      
        //Sub.mostraRes();
        
    }
    
}
