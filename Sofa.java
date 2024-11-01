
package Abstract ;


class Sofa extends mobilia {
    public Sofa(String color, String material) {
        super(color, material);
               
    }
    
    public void montar() {
        System.out.println("Foi montado um sofá " + color + " feito de " + material) ; 
    }
}