public class Cliente {
    private String nome, cpf;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public String getData() {
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nEndereço: \n" + this.getEndereco().getData();
    }
}
