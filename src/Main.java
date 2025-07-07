public class Main {
    public static void main(String[] args) {
        int quantidadeComCodigo = 0, temCPF = 0, temArapiraca = 0;

        Endereco endereco1 = new Endereco("1234", "arapiraca", "tertuliano");
        Endereco endereco2 = new Endereco("1234", "arapiraca", "tertuliano");

        Cliente cliente1 = new Cliente("Jackson", "12344321", endereco1);
        Cliente cliente2 = new Cliente("juliana", "43211234", endereco2);

        Conta conta1 = new Conta(1, 1.2, 100, cliente1);
        Conta conta2 = new Conta(2, 1.2, 120, cliente2);

        System.out.println(conta1.getData() + "\n---------------------\nValor a pagar: " + conta1.valorConta());
        System.out.println(conta2.getData() + "\n---------------------\nValor a pagar: " + conta2.valorConta());

        if (conta1.isTemCodigo()) {
            quantidadeComCodigo++;
        }
        if (conta2.isTemCodigo()) {
            quantidadeComCodigo++;
        }
        System.out.println("---------------------\n");
        if (quantidadeComCodigo > 0) {
            System.out.println("Existe Conta com código setado");
        } else {
            System.out.println("Não existe Conta com código setado");
        }
        System.out.println("---------------------\n");

        if (cliente1.getCpf().isEmpty()) {
            temCPF++;
        }
        if (cliente2.getCpf().isEmpty()) {
            temCPF++;
        }
        if (quantidadeComCodigo > 0) {
            System.out.println("Existe cliente com CPF setado");
        } else {
            System.out.println("Não existe cliente com CPF setado");
        }
        System.out.println("---------------------\n");
        if (cliente1.getEndereco().getCidade() == "arapiraca") {
            temArapiraca++;
        }
        if (cliente2.getEndereco().getCidade() == "arapiraca") {
            temArapiraca++;
        }
        if (temArapiraca > 0) {
            System.out.println("Existe cliente que mora em arapiraca");
        } else {
            System.out.println("Não existe cliente que mora em arapiraca");
        }System.out.println("---------------------\n");

        cliente2.setNome("juliana barbosa");
        System.out.println(cliente2.getData());
        System.out.println("---------------------\n");
        cliente2.getEndereco().setCidade("maceio");
        System.out.println(cliente2.getData());
        System.out.println("---------------------\n");
    }
}
