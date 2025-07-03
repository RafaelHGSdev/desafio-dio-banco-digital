import lombok.Getter;
import lombok.Setter;

public class ContaCorrente extends Conta {

    @Getter
    @Setter
    private double limite = 500;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if(saldo+limite >= valor){
            this.saldo -= valor;
            if(saldo < 0){
                limite += saldo;
            }
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            if (saldo < 0) {
                double valorParaCobrirLimite = Math.min(-saldo, valor);
                saldo += valorParaCobrirLimite;
                limite += valorParaCobrirLimite;
                valor -= valorParaCobrirLimite;
            }
            saldo += valor;
        }
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        if(saldo+limite > valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        else{
            System.out.println("Saldo Indisponível para Operação!!!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente: "+this.saldo);
        System.out.println("Saldo Limite: " + this.limite);
        super.imprimirInfosComuns();
    }

}
