package hash;

public class TabelaHash {

    int size;
    ListaLigada[] tabela;

    // cria array de lista ligada 
    public TabelaHash(int size) {
        this.size = size;
        tabela = new ListaLigada[size];

        for (int i = 0; i < size; i++) { 
            tabela[i] = new ListaLigada();
        }
    }

    // função hash => baseada nos slides 
    private int hash(String key) {
        int h = 1;
        for(int i = 0; i < key.length(); i++){
            h = (31 * h + key.charAt(i)) % size; 
        }
        return h;
    }

    // buscar pela url e retorna ip 
    public String buscar(String chave) {
        if (chave == null) {
            System.out.println("Key vindo como null");
        }

        int index = hash(chave);
        ListaLigada list = tabela[index];

        return list.searchUrlComIp(chave); // retorna ip
    }


    // adiciona a url e ip na tabela 
    public String set(String chave, String valor) {
        if (chave == null) {
            System.out.println("Key vindo como null");
        }

        No no = new No(chave, valor);

        int index = hash(chave);
        ListaLigada list = tabela[index];
        list.inserir(no);  // inserindo na lista
        
        return valor;
    }

    // remove com base na url e retorna a url removida 
    public String remove(String chave) {
        if (chave == null) {
            System.out.println("Key vindo como null");
        }

        int index = hash(chave);
        ListaLigada list = tabela[index];

        list.remove(chave);

        return chave;
    }

    // aumenta tamanho da tabela hash  
    public void aumentaTamanho(){
       ListaLigada temp[] = tabela.clone();

       size = size +25;
       No atual = null;
       tabela = new ListaLigada[size];
       for(int i = 0; i <temp.length; i++){
            atual = temp[i].getPrimeiroNo();
       }

       while (atual != null) {
            set(atual.getChave(), atual.getValor());
            atual = atual.getProximo();
        }
    }

    // mostra a tabela completa 
    public void showTable() {
        for (int i = 0 ; i < tabela.length ; i++) {
            ListaLigada list = tabela[i];
            boolean listIsNull = list == null;

            System.out.println("Index: " + i);
            System.out.println(
                "Conteúdo: " + (listIsNull ? null : "") + '\n'
            );

            if(!listIsNull) list.mostraNos();
        }
    }
 
    public int getTamanho(){
        return size;
    }
}

