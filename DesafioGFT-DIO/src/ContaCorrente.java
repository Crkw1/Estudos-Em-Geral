public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("-----EXTRATO DA CONTA CORRENTE-----");
        super.infosComuns();
    }
}


