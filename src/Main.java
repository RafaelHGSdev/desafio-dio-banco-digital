public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criação do cliente 1 com conta corrente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rafael");
        Conta cc = new ContaCorrente(cliente1);
        banco.adicionarContas(cc); // Adiciona a conta ao banco

        // Criação do cliente 2 com conta poupança
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Rafael Poupanca");
        Conta contaPoupanca = new ContaPoupanca(cliente2);
        banco.adicionarContas(contaPoupanca); // Adiciona a conta ao banco

        System.out.println("\n>>> Extrato inicial da Conta Corrente:");
        cc.imprimirExtrato();

        // Realiza saque de R$100 (dentro do saldo)
        System.out.println("\n>>> Sacando R$100 da Conta Corrente:");
        cc.sacar(100);
        cc.imprimirExtrato();

        // Deposita R$600 na conta corrente (deve repor limite usado e somar ao saldo)
        System.out.println("\n>>> Depositando R$600 na Conta Corrente:");
        cc.depositar(600);
        cc.imprimirExtrato();

        // Tenta transferir R$9900 para conta poupança (deve falhar, limite insuficiente)
        System.out.println("\n>>> Tentando transferir R$9900 para Conta Poupança:");
        cc.tranferir(9900, contaPoupanca);

        // Transfere um valor possível: R$200
        System.out.println("\n>>> Transferindo R$200 para Conta Poupança:");
        cc.tranferir(200, contaPoupanca);

        // Imprime extrato final das duas contas
        System.out.println("\n>>> Extrato final da Conta Corrente:");
        cc.imprimirExtrato();

        System.out.println("\n>>> Extrato final da Conta Poupança:");
        contaPoupanca.imprimirExtrato();

        // Lista geral de contas no banco
        System.out.println("\n>>> Listando todas as contas do banco:");
        banco.listarContas();
    }
}
