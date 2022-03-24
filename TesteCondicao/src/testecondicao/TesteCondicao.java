package testecondicao;

public class TesteCondicao {



    public static void main(String[] args) {
    
        String str ="Nobody ever went broke by buying  v IBM:";
        System.out.println("The string is : " + str);
        System.out.println("Length of this string: " + str.length());
        System.out.println("The character at position 5: " + str.charAt(5));
        System.out.println("The Substring from 26 to 32: " + str.substring(26,32));
        System.out.println("The index of the charactere V:" + str.indexOf('v'));
        //System.out.println("The index of the beginning of the " + "Substing \ "IBM\":" + str.indexOf("IBM"));
        System.out.println("The string in upper case: " + str.toUpperCase());
        
        
        
        
    }    
}
