package banco;

public class Programa {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("001", TipoConta.CONTA_CORRENTE, "icaro");

        c1.abrirConta();
        c1.pagarMensal();
        c1.status();

        ContaCorrente c2 = new ContaCorrente("002", TipoConta.CONTA_POUPANCA, "Charles");

        c2.abrirConta();
        c2.pagarMensal();
        c2.depositar(500.86);
        c2.sacar(300.59);
        c2.status();
    }
}