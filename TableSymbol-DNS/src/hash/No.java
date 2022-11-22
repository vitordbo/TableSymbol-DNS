package hash;

public class No {
  
	private String chave; // www.google.com
	private String valor;  // 216.239.41.99:5000
    private int frequencia; // contador de frequencia
	
	// construção da lista ligada 
	private No proximo = null;
    private No anterior = null;

	// colocar frequencia no cosntrutor 
	public No(String chave, String valor) {
		this.chave = chave;
		this.valor = valor;
        this.frequencia = 0; // frequencia inicia com 0
	}

	// set
	public static No set(No node) {
        No novNo = new No(node.getChave(), node.getValor());
        novNo.frequencia = node.getFrequencia();

        return novNo;
    }

	public String getChave() {
		return chave;
	}

	public void setId(String chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public String getValorBusca() {
		AddFrequencia(); // incrementa a frequencia quando acessa o valor (ip)
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
    }

	public void setNome(String valor) {
		this.valor = valor;
	}

    public int getFrequencia() {
		return frequencia;
	}

    public void AddFrequencia() {
        this.frequencia++;
    }

	public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

	@Override
	public String toString() {
		return chave + ": (Valor " + valor + ")";
	}
}
