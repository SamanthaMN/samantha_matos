public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        Conta minhaConta = new Conta(c);

        minhaConta.setSaldo(1000);

        minhaConta.saca(200);

        minhaConta.deposita(500);
        System.out.println(minhaConta.getSaldo());
    }
}
