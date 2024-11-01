
package Abstract ;

abstract class mobilia {
    protected String color ;
    protected String material ;
    
    
    public mobilia(String color, String material) {
        this.color = color ; 
        this.material = material ;
                 
    }
    
    public abstract void montar(); 
    
    
    public void desmontar(){
        System.out.println("A mobilia foi desmontada. ") ;
    }
}
