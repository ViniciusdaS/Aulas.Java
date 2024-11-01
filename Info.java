
package Abstract ;



public class Info {
    public static void main(String[] args) {
        mobilia Sofa = new Sofa("preto","Madeira"); 
        mobilia Mesa = new Mesa("Amarela", "Madeira"); 
        
        
        
        Sofa.montar();
        Sofa.desmontar();
        Mesa.montar();
        Mesa.desmontar();
    }
    
    
    
}