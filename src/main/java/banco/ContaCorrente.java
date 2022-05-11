package banco;

public class ContaCorrente {
    public String numConta;
    protected TipoConta tipoConta;
    private String dono;
    private double saldo;
    private boolean isAberta;

    public ContaCorrente(String numConta, TipoConta tipoConta, String dono) {
        super();
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.dono = dono;
        this.isAberta = false;
        this.saldo = 0;
    }

    public void status() {
        System.out.println("Número da conta " + getNumConta());
        System.out.println("Tipo da conta " + this.getTipoConta());
        System.out.println("O dono é " + getDono());
        System.out.println("O saldo é " + getSaldo());
        System.out.println("A conta está aberta? " + isAberta());
    }

    public void abrirConta() {
        if (isAberta == true) {
            System.out.println("Já existe uma conta aberta. ");
        } else {
            this.isAberta = true;

            System.out.println("A conta foi aberta com sucesso! ");

            if (this.tipoConta == TipoConta.CONTA_CORRENTE) {
                this.saldo += 50;
            }

            if (this.tipoConta == TipoConta.CONTA_POUPANCA) {
                this.saldo += 150;
            }
        }
    }

    public void fecharConta() {
        if (isAberta == false) {
            System.out.println("A conta já está fechada. ");
        } else {
            if (this.saldo == 0) {
                this.isAberta = false;
                System.out.println("A conta foi fechada com sucesso. ");
            } else {
                System.out.println("O saldo é diferente de 0");
            }
        }
    }

    public void depositar(double valor) {
        if (isAberta == true) {
            this.saldo = this.saldo + valor;
        } else {
            System.out.println("Não é possível depositar em uma conta fechada. ");
        }
    }

    public void sacar(double valor) {
        if (isAberta == true && this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Não foi possível sacar. ");
        }
    }

    public void pagarMensal() {
        if (isAberta == false) {
            System.out.println("Não é possível pagar a mensalidade de uma conta fechada. ");
        } else {

            if (this.tipoConta == TipoConta.CONTA_CORRENTE && this.saldo >= 12.00) {
                this.saldo = this.saldo - 12.00;

                System.out.println("A sua mensalidade da conta corrente foi paga.");

            } else {
                this.saldo = this.saldo - 20.00;

                System.out.println("A sua mensalidade da conta poupança foi paga.");
            }
        }
    }

    // getters and setters

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAberta() {
        return isAberta;
    }

    public void setAberta(boolean isAberta) {
        this.isAberta = isAberta;
    }
}