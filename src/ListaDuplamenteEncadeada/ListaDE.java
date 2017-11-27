/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDuplamenteEncadeada;

/**
 *
 * @author Bruno
 */
public class ListaDE {
    private NoDuplo inicio;
    private NoDuplo fim;
    private NoDuplo posicaoAtual;
    
    public boolean listaVazia(){
        if(inicio==null&&fim==null)
            return true;
        else
            return false;
    }
    
    public Object getPosicao(){
        return this.posicaoAtual.getElemento();
    }
    
    public void AddStart(Object element){
        NoDuplo nd = new NoDuplo();
        nd.setElemento(element);
        if(this.listaVazia()){
            inicio = nd;
            fim = nd;
        }else{
            nd.setProximo(inicio);
            inicio.setAnterior(nd);
            inicio = nd;
        }
    }
    
    public void AddEnd(Object element){
        NoDuplo nd = new NoDuplo();
        nd.setElemento(element);
        if(this.listaVazia()){
            inicio = nd;
            fim = nd;
        }else{
            nd.setAnterior(fim);
            fim.setProximo(nd);
            fim = nd;
        }
    }
    
    public NoDuplo removeFirst(){
        NoDuplo nd = new NoDuplo();
        if(this.listaVazia()){
            return null;
        }else{
            nd = inicio;
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        }
        
        return nd;
    }
    public NoDuplo removeLast(){
        NoDuplo nd = new NoDuplo();
        if(this.listaVazia()){
            return null;
        }else{
            nd = fim;
            fim = fim.getAnterior();
            fim.setProximo(null);
        }
        
        return nd;
    }
    public NoDuplo removeX(Object x){
        NoDuplo nd = new NoDuplo();
        NoDuplo ndAux = new NoDuplo();
        posicaoAtual = inicio;
        if(this.listaVazia()){
            return null;
        }else{
            while(this.temProximo()){
                nd = posicaoAtual;
                if(nd.getElemento().equals(x)){
                    ndAux = nd.getAnterior();
                    posicaoAtual = nd.getProximo();
                    ndAux.setProximo(posicaoAtual);
                    posicaoAtual.setAnterior(ndAux);
                    nd.setAnterior(null);
                    nd.setProximo(null);
                    posicaoAtual=null;
                    return nd;
                }
                posicaoAtual= posicaoAtual.getProximo();
            }
        }
        posicaoAtual = null;
        return null;
    }
    
    public boolean temProximo(){
        if(inicio == null){
            return false;
        } else if (posicaoAtual == null){
            posicaoAtual = inicio;
            return true;
        } else {
            boolean temProximo = posicaoAtual.getProximo() != null;
            posicaoAtual = posicaoAtual.getProximo();
            return temProximo;
        }
    }
    
}
