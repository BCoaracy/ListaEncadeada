
package filaencadeada;

public class Principal {

    public static void main(String[] args) {
       ListaEncadeada listaEncadeada = new ListaEncadeada();
       Principal principal = new Principal();
       
       principal.adicionarPessoa(listaEncadeada);
       
       principal.remover(listaEncadeada);
       
       while(listaEncadeada.temProximo()){
           System.out.println(listaEncadeada.getPosicaoAtual().getValor());
       }
    }
    
    private void adicionarPessoa(ListaEncadeada listaEncadeada){
        Pessoa p1 = new Pessoa(1, "Bruno","bruno@gmail.com");
        Pessoa p2 = new Pessoa(2, "Uanessa","xcamargo@email.com");
        Pessoa p3 = new Pessoa(3, "Marssil","marssil@Ruimbens.com");
        listaEncadeada.adicionarInicio(p1);
        listaEncadeada.adicionarInicio(p2);
        listaEncadeada.adicionarInicio(p3);
    }
    
    private void remover(ListaEncadeada listaEncadeada){
        
    }
    
}
