
package Mercado ;

public class Bebidas extends Produto {
   
    public Bebidas(String nome, double preco) {
        super(nome, preco) ;
        
    }
    
    @Override
    public void descricao() {
        System.out.println("Nome da bebida: " + nome);
        System.out.println("Preço da bebida: " + preco) ;
    }
    
}