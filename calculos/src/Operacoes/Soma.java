package Operacoes;

public class Soma {
    
    private float Numero1;
    private float Numero2;
    private float Resultado;

  

    public float getNumero1() {
        return Numero1;
    }

    public void setNumero1(float Numero1) {
        this.Numero1 = Numero1;
    }

    public float getNumero2() {
        return Numero2;
    }

    public void setNumero2(float Numero2) {
        this.Numero2 = Numero2;
    }

    public float getResultado() {
        return Resultado;
    }

    public void setResultado(float Resultado) {
        this.Resultado = Resultado;
    }

    
      
    public float Soma(){
        
        Resultado = Numero1 + Numero2;
        
        return Resultado;
        
        
    }
    
    public void mostraRes(){
        
        Resultado = Numero1 + Numero2;
        
        if (Resultado > 10){
            System.out.println("Resultado maior que 10 ," + Resultado);
            Menssagem men = new Menssagem();
            men.Menssagem();
            
        }else{
            System.out.println("Resultado menor que 10 ," + Resultado);        }
    }
    
    public void Messagem() {
        
    if (Numero1 == 10){
        System.out.println("Voce digitou o numero 10 , parabens ");
    }else{
        System.out.println("Voce não digitou 10");
    }
    
}
    
}
