package filaencadeada;

public class ListaEncadeada {
    private No primeiro;
    private No ultimo;
    private No posicaoAtual;
    
    /*
    ** Adiciona no fim da lista
    */
    public void adicionar (Pessoa valor){
        No no = new No();
        no.setValor(valor);
        if(primeiro == null && ultimo == null){
            primeiro = no;
            ultimo = no;
        }else{
            ultimo.setProximo(no);
            ultimo = no;
        }
    }
    
    /*
    ** Adiciona no inicio da lista
    */
    public void adicionarInicio (Pessoa valor){
        No no = new No();
        no.setValor(valor);
        if(primeiro == null && ultimo == null){
            ultimo = no;
            primeiro = no;
        }else{
            no.setProximo(primeiro);
            primeiro = no;
        }
    }
    
    /*
    ** Remove no fim da lista
    */
    
    public void remover(){
        if(primeiro.getProximo() != null){
            No no = this.recuperarPenultimo(this.primeiro);
            ultimo = no;
            no.setProximo(null);
        }else{
            primeiro = ultimo = null;
        }
        
    }
    
    
    private No recuperarPenultimo(No no){
        if(no.getProximo().equals(ultimo)){
            return no;
        }
        return recuperarPenultimo(no.getProximo());
    }
    
    public boolean temProximo(){
        if(primeiro == null){
            return false;
        } else if (posicaoAtual == null){
            posicaoAtual = primeiro;
            return true;
        } else {
            boolean temProximo = posicaoAtual.getProximo() != null;
            posicaoAtual = posicaoAtual.getProximo();
            return temProximo;
        }
    }
    
    public No getPosicaoAtual(){
        return this.posicaoAtual;
    }
}


