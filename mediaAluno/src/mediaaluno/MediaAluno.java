package mediaaluno;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MediaAluno {

    public static void main(String[] args) {
        
       float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Primeira Nota : "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Segunda Nota : "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Terceira Nota : "));
        nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Quarta Nota : "));
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        String s = Float.toString(media);
        
        System.out.println("A media é : " + media);
        
        JOptionPane.showMessageDialog(null,"A media Final do aluno é : " + media);

    }
    
}
