//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Endereco {
    private String rua, cep, cidade;

    public String getRua() {
        return this.rua;
    }

    public String getCep() {
        return this.cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Endereco(String cep, String cidade, String rua) {
        setCep(cep);
        setCidade(cidade);
        setRua(rua);
    }

    public String getData() {
        return "Cep: " + getCep() + "\nCidade: " + getCidade() + "\nRua: " + getRua();
    }

}
