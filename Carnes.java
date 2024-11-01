
package Mercado ;

public class Carnes extends Produto {
    
    public Carnes(String nome, double preco) {
        super(nome, preco) ;
        
    }
    
    @Override
    public void descricao() {
        System.out.println("Nome da carne: " + nome) ;
        System.out.println("Preço da carne: " + preco) ;
    }
}