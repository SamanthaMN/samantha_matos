public class Conta {
    private int numero;
    private String agencia;
    private String dataAbertura;
    private double saldo;
    private Cliente titular;
    private static int totalDeContas;

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    boolean saca(double valor) {
        if (this.saldo < valor)
            return false;

        this.saldo = this.saldo - valor;

        return true;
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            return false;
        }

        destino.deposita(valor);
        return true;
    }

    double calculaRendimento() {
        return saldo * 0.1;
    }

    String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        return dados;
    }
}
