package numerosprimos;

public class Numerosprimos {

    public static void main(String[] args) {
   
        int i, j;
        boolean primo;
        
        for(i=2; i <= 10; i++){
           primo = true;
            for (j = 2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.println(i + " ");
            }
            
        }
    }
    
}
