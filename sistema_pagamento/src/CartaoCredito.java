public class CartaoCredito implements Pagamento{
    private static final double Limite_Maximo = 20000;

    @Override
    public void processarPagamento(double valor, Conta conta) {
        if (valor > 0 && valor <= Limite_Maximo){
            System.out.println("Pagamento via Cartao de credito de R$"+valor+  "autorizado");
        }else {
            System.out.println("Falha no Cartao: valor acima do limite.");
        }
    }
}
