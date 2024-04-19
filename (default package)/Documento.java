
public class Documento{
    private String texto = "";

    public Documento() {
        this.texto = texto;
    }

    public void adiciona (String s){
        texto = texto + s;
    }

    public String getTexte(){
        return texto;
    }

    public void tab(){
        texto = texto + "\t";
    }

    
    public void novaLinha(){
        texto = texto + "\n";
    }

    public void aspasSimples(){
        texto = texto + "\'";
    }

    public void aspasDuplas(){
        texto = texto + "\"";
    }

    public void barraInvertida(){
        texto = texto + "\\";
    
        
    }
}

