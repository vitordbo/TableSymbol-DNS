package hash;

public class ListaLigada {
    private No primeiro;

    // construtor para null
    public ListaLigada(){
        this.primeiro = null;
    }

    // inserir na lista 
    public void inserir(No no) {
        No novoNo = procurarUrlLista(no.getValor()); 
        // Novo => não achou insere
        if(primeiro == null) {
            primeiro = no;
            return;
        } 
        if (novoNo != null) {  // Atualização => inserção de uma chave repetida, mas com um novo valor associado
            novoNo.setValor(novoNo.getValor()); //ip
            return;
        }

        No ultimo = pegarUltimo();
        ultimo.setProximo(no);
        no.setAnterior(ultimo);
    }
    
    private No pegarUltimo() {
        if(primeiro == null) {
            return null;
        }

        No no = primeiro;
        while(no.getProximo() != null) {
            no = no.getProximo();
        }

        return no;
    }
    
    private No procurarUrlLista(String url) {
        No no = primeiro;
        
        while(no != null && !no.getChave().equals(url)){ //Comparar chaves usando os recursos de 
            //comparação de strings, já que a chave é desse tipo.
            // se não tiver na lista 
            no = no.getProximo(); 
        }
        
        return no;
    }

    // retorna ip com a url 
    public String searchUrlComIp(String url) {
        No no = procurarUrlLista(url);
        if(no == null) return null;

        String nodeIp = no.getValorBusca(); // ip => /adiciona frequencia => busca

        return nodeIp;
    }

    // remover da lista 
    public No remove(String url) {
        No no = procurarUrlLista(url);
        if(no == null) return null;

        No anterior = no.getAnterior();
        No proximo = no.getProximo();

        if(anterior == null && proximo == null) no = null;
        else {
            if(anterior == null) no = proximo;
            else anterior.setProximo(proximo);
    
            if(proximo != null) proximo.setAnterior(anterior);
        }

        return no;
    }

    // mostras nos da lista 
    public void mostraNos() {
        No no = primeiro;
        while(no != null) {
            System.out.println("URL: " + no.getChave());
            System.out.println("IP: " + no.getValor());
            System.out.println(
                "Frequência de busca: " + no.getFrequencia() // get da frequencia 
            );

            System.out.println();
            no = no.getProximo();
        }
    }
    
    public No getPrimeiroNo() {
        return primeiro;
    }

}
