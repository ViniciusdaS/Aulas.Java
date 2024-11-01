
package Mercado ; 

import java.util.Scanner ;
import java.util.ArrayList ; 

public abstract class Produto {
    
    String nome ; 
    double preco ; 
    
    public Produto(String nome, double preco ) {
        this.nome = nome ; 
        this.preco = preco ; 
    }
    
}