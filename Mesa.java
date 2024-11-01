
package Abstract ;

class Mesa extends mobilia {
    public Mesa(String color, String material) {
        super(color, material) ;
        
    }
    
    public void montar() {
        System.out.println("Foi montado um sofá " + color + " feita de " + material) ;
    }
}