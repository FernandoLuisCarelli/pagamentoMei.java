package Operacoes;

public class Subtracao {

float Numero1,Numero2,Resultado;    
    

public Subtracao(float N1,float N2,float Res){
    
    this.Numero1 = N1;
    this.Numero2 = N2;
       
    Res = N1 - N2;
    
    this.Resultado = Res;
    
}

public void mostraRes(){
    System.out.println(Resultado);
}
}
