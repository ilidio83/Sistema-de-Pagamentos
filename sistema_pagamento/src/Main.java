public class Main {
    public static void main (String[] args){

        Conta c1 = new Conta("ilidio",40000.0);
        Conta c2 = new Conta("Gabi",2000.0);

        c1.transferir(c2,10000);
        System.out.println("Saldo da conta Ilidio:"+ c1.getSaldo());
        System.out.println("Saldo da conta Gabi:"+ c2.getSaldo());

        Pagamento pix = new Pix();
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new Boleto();

        pix.processarPagamento(4500.0, c1);
        cartao.processarPagamento(15000.0, c2);
        boleto.processarPagamento(500.0, c2);

        System.out.println("\nSaldo final de Ilídio: " + c1.getSaldo());
        System.out.println("Saldo final de Gabi: " + c2.getSaldo());


    }
}