import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    @Getter
    @Setter
    private String nome = "Banco Teste";
    private List<Conta> contas = new ArrayList<>();

    public void adicionarContas(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        System.out.println("Nome do Banco: " + this.nome);
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }
}