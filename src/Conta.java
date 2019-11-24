public class Conta {
    int numero;
    String titular;
    double saldo;

    boolean saca(double valor) {
        if (this.saldo < valor)
            return false;

        this.saldo = this.saldo - valor;

        return true;
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
}
