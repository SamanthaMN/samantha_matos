public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000;

        minhaConta.saca(200);

        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);
    }
}
