package filaencadeada;

public class ListaEncadeada {
    private No primeiro;
    private No ultimo;
    private No posicaoAtual;
    private int tamanho = 0;
    
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
        tamanho++;
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
        tamanho++;
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
    
    /*
     *Remover chaves pares
    */
    
    public void removerTodosPares(){
        int i = 1, j=0;
        while(this.temProximo()){
            if(i%2==0){
                removeNaPosicao(i);
            }
            i++;
        }
        
    }
    
    private void removeAtual(){
        No no = new No();
        no = this.posicaoAtual;
        no.setProximo(null);
        no.getValor();
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
    
    public void removeNaPosicao(int posicao){
        try{
            No predecessor = getNo(posicao-1);
            No excluido = predecessor.getProximo();
            predecessor.setProximo(excluido.getProximo());
            //excluido.setProximo(null);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public No getNo(int posicao){ //retorna um nó na posição desejada
        No noAtual;  
        if((posicao < 1) || (getPosicaoAtual() == null)){
            return null;
        }else{
            noAtual = primeiro;
            while(posicao>1){
                noAtual = noAtual.getProximo();
                if(noAtual == null){
                    return null;
                }
                posicao--;
            }
            return noAtual;
        }
    }
}


