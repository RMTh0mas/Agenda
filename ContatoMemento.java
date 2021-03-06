public class ContatoMemento {

    private int id;
    private String nome;
    private String telefone;
    private String email;

    public ContatoMemento(int id, String nome, String telefone, String email){
        this.setId(id);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
