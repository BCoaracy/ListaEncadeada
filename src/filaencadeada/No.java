package filaencadeada;

public class No {
    private No proximo;
    private Pessoa valor;
    
    public No getProximo(){
        return proximo;
    }
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    
    public Pessoa getValor(){
        return valor;
    }
    
    public void setValor(Pessoa valor){
        this.valor = valor;
    }
}
    

