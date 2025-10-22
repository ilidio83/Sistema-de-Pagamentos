public class Pix implements Pagamento{
    private static final double Limite_maximo = 5000;

    @Override
    public void processarPagamento(double valor, Conta conta) {
        if (valor > 0 && valor <= Limite_maximo && valor <= conta.getSaldo()){
            conta.sacar(valor);
            System.out.println("Pagamento via Pix de R$"+valor+  "realizado com sucesso!");
        }else {
            System.out.println("Falha no Pix: valor invalido ou acima do limite/saldo!");
        }
    }
}
