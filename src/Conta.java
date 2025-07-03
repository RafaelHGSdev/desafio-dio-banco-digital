import lombok.Getter;
import lombok.Setter;

abstract class Conta implements MetodosConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;
    private Cliente cliente;

    @Getter
    @Setter
    protected int agencia;
    protected int numero;
    protected double saldo = 0;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns() {

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("endreço: %s", this.cliente.getEndereco()));
        System.out.println(String.format("Titular: %s", this.cliente.getCep()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }
}
