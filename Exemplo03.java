
package Arrays ;

public class Exemplo03 {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5} ;
        
        int remocao = 2 ; 
        
        int[] novoArray = new int[numeros.length - 1] ; 
        
        for(int i = 0, j = 0; i < numeros.length; i++) ;
        if (i != remocao) {
            novoArray[j++] = numeros[i];
        }
    }
}