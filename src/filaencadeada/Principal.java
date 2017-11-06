
package filaencadeada;

public class Principal {

    public static void main(String[] args) {
       ListaEncadeada listaEncadeada = new ListaEncadeada();
       Principal principal = new Principal();
       
       //principal.adicionarPessoa(listaEncadeada);
       
       //principal.remover(listaEncadeada);
       
       //principal.adicionarPessoaFim(listaEncadeada);
       //principal.remover(listaEncadeada);
       
       while(listaEncadeada.temProximo()){
           System.out.println(listaEncadeada.getPosicaoAtual().getValor());
       }
       
       principal.adicionarPessoa(listaEncadeada);
       
       principal.removerPares(listaEncadeada);
       
       System.out.println("\nRemoveu os parese?");
       
       while(listaEncadeada.temProximo()){
           System.out.println(listaEncadeada.getPosicaoAtual().getValor());
       }
       
    }
    
    private void adicionarPessoa(ListaEncadeada listaEncadeada){
        Pessoa p1 = new Pessoa(1, "Bruno","bruno@gmail.com");
        Pessoa p2 = new Pessoa(2, "Uanessa","xcamargo@email.com");
        Pessoa p3 = new Pessoa(3, "Marssil","marssil@Ruimbens.com");
        Pessoa p4 = new Pessoa(4, "Sandoro","semmail.com");
        Pessoa p5 = new Pessoa(5, "Fabião","emsmail.com");
        Pessoa p6 = new Pessoa(6, "EdgeGar","sem@email.com");
        Pessoa p7 = new Pessoa(7, "Para","JoaoPessoa@belem.com");
        Pessoa p8 = new Pessoa(8, "Claristosa","Seila@Cara.com");
        Pessoa p9 = new Pessoa(9, "Joaosir","Figado@acebolado.com");
        listaEncadeada.adicionar(p1);
        listaEncadeada.adicionar(p2);
        listaEncadeada.adicionar(p3);
        listaEncadeada.adicionar(p4);
        listaEncadeada.adicionar(p5);
        listaEncadeada.adicionar(p6);
        listaEncadeada.adicionar(p7);
        listaEncadeada.adicionar(p8);
        listaEncadeada.adicionar(p9);
    }
    
    private void adicionarPessoaFim(ListaEncadeada listaEncadeada){
        Pessoa p4 = new Pessoa(1, "B","bruno@gmail.com");
        Pessoa p5 = new Pessoa(2, "X","xcamargo@email.com");
        Pessoa p6 = new Pessoa(3, "M","marssil@Ruimbens.com");
        listaEncadeada.adicionar(p4);
        listaEncadeada.adicionar(p5);
        listaEncadeada.adicionar(p6);
    }
    
    private void remover(ListaEncadeada listaEncadeada){
        listaEncadeada.remover();
    }
    
//Exercicio 3 lista 4
    private void removerPares(ListaEncadeada listaEncadeada){
        listaEncadeada.removerTodosPares();
    }
    
}
