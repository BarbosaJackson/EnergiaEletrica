public class Conta {
    private int codigo;
    private double valorQuilowatt, quantidadeQuilowatts;
    private Cliente cliente;
    private boolean temCodigo;

    public boolean isTemCodigo() {
        return temCodigo;
    }

    public void setTemCodigo(boolean setCodigo) {
        this.temCodigo = setCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        this.setTemCodigo(true);
    }

    public double getValorQuilowatt() {
        return valorQuilowatt;
    }

    public void setValorQuilowatt(double valorQuilowatt) {
        this.valorQuilowatt = valorQuilowatt;
    }

    public double getQuantidadeQuilowatts() {
        return quantidadeQuilowatts;
    }

    public void setQuantidadeQuilowatts(double quantidadeQuilowatts) {
        this.quantidadeQuilowatts = quantidadeQuilowatts;
    }

    public String getCliente() {
        return cliente.getData();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(int codigo, double valorQuilowatt, double quantidadeQuilowatts, Cliente cliente) {
        this.setCodigo(codigo);
        this.setValorQuilowatt(valorQuilowatt);
        this.setQuantidadeQuilowatts(quantidadeQuilowatts);
        this.setCliente(cliente);
    }

    public String getData() {
        return "Cliente: \n" + this.cliente.getData() + "\nQuantidade quilowatts usados: " +
                this.getQuantidadeQuilowatts() + "\nValor por quilowatts: " + this.getValorQuilowatt();
    }

    public double valorConta() {
        return this.getQuantidadeQuilowatts() * this.getValorQuilowatt();
    }
}
