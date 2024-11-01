

package Naruto ;

public abstract class Cla {
    String nome ; 
    String lider ; 
    
    public Cla(String nome, String lider) {
        this.nome = nome ;
        this.lider = lider ; 
    }
    
    public abstract void Especial();
    
    
    public void detalhar() {
        System.out.println("O lider do clâ " + nome);
    }
}