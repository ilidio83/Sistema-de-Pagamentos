public class Boleto implements Pagamento{
    @Override
    public void processarPagamento(double valor, Conta conta) {
        if (valor > 0 && valor <= conta.getSaldo()){
            conta.sacar(valor);
            System.out.println("Boleto no valor de R$"+valor+  "emitido com sucssso!");
        }else {
            System.out.println("Falha ao emitir o Boleto: valor invalido ou  saldo insuficiente.");
        }
    }
}
