public class Dado {

    private int valor;

    public Dado() {
        this.valor = 0;
    }

    public int lancar() {
        this.valor = (int) (Math.random() * 6) + 1;
        return this.valor;
    }
    
   





    
}
