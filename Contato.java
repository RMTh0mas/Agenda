public class Contato {

    private int id;
    private String nome;
    private String telefone;
    private String email;

    private static int CONTADOR = 0;
    
    public Contato(String nome, String telefone, String email) {
        CONTADOR++;
        this.id = CONTADOR;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public ContatoMemento criarMemento(){
        return new ContatoMemento(this.id, this.nome, this.telefone, this.email);
    }

    public void setContatoMemento(Object cm){
        this.id = ((ContatoMemento) cm).getId();
        this.nome = ((ContatoMemento) cm).getNome();
        this.telefone = ((ContatoMemento) cm).getTelefone();
        this.email = ((ContatoMemento) cm).getEmail();
    }
    
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
