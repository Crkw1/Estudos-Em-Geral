public class Criar {
    public static void main(String[] args) {
        Cliente will = new Cliente();
        will.setNome("William Almeida");

        Conta cc = new ContaCorrente(will);
        Conta poupanca = new ContaPoupanca(will);

        cc.depositar(111);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
