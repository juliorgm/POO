public class Conta {
    int numero;
    String titular;
    double saldo;

    boolean saca(double valorSaque){
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            return true;
        }

        return false;
    }

    void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }

    boolean transferePara(double valor, Conta conta){
        if (this.saca(valor)) {
            conta.deposito(valor);
            return true;
        }
        return false;
    }
}
