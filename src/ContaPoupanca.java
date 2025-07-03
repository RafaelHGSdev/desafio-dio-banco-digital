public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        if(saldo > valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        else{
            System.out.println("Saldo Indisponível para Operação!!!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\\\\Extrato da Conta Poupança\\\\");
        super.imprimirInfosComuns();
    }
}
