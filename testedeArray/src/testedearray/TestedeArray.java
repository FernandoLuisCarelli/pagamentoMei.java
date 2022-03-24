package testedearray;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class TestedeArray {


    public static void main(String[] args) {

        int [] vetor;
        vetor = new int[5];
        
        vetor[0] = 2;
        vetor[1] = 12;
        vetor[2] = 20;
        vetor[3] = 10;
        vetor[4] = 15;
            
        System.out.println(Arrays.toString(vetor));
        
        int numero = 0;
        for (int i = 0; i < 5; i++){
        
        vetor[i] = numero;
        numero += 10;
        
        }
        System.out.println(Arrays.toString(vetor));
        JOptionPane.showMessageDialog(null,Arrays.toString(vetor));


    }
    
}

