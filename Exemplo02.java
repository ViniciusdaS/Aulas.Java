
package Arrays ; 

public class Exemplo02 {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5} ;
        
        int novoNumero = 4 ; 
        
        int[] novoArray = new int [numeros.length + 1] ;
        
        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i] ; 
        }
        
        novoArray[numeros.length] = novoNumero ;
        
        numeros = novoArray ; 
        
        for (int numero: numeros) {
            System.out.println(numero);
        }
        
    }
} 