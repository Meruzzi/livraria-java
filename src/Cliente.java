public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private String endereco;

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getEmail() {
        return email;
    }
    public String setEmail(String email) {
        return this.email = email;
    }
    public String setEndereco(String Endereco) {
        return this.endereco = endereco;
    }

    public Cliente(String cpf, String nome, String email, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public void fazPedido(String livro, int numExemplares) {

    };

}
