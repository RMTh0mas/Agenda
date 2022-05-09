import java.util.Stack;

public class RepositorioDeContatos {
    
    /* Histórico de alterações*/

    private Object vetor[] = new Object[1000];
    private int topo;
    private Contato c;

    public boolean vazia() {
        return topo == 0;
    }

    public boolean cheia() {
        return vetor.length == topo;
    }

    public void push(Object valor) throws PilhaCheiaException {
        if (cheia()) {
            throw new PilhaCheiaException();
        }

        vetor[topo] = valor;
        topo++;
    }

    public Object pop() throws PilhaVaziaException {
        if (vazia()) {
            throw new PilhaVaziaException();
        }

        topo--;
        Object valor = vetor[topo];
        vetor[topo] = null;

        return valor;
    }

    public RepositorioDeContatos(Contato c) {
        this.c = c;
    }

    public void salvarContato() throws PilhaCheiaException{
        this.push(c.criarMemento());
    }

    public void desfazer() throws PilhaVaziaException{
        c.setContatoMemento(this.pop());
    }

}
