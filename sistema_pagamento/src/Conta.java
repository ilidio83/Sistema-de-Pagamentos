public class Conta {
    private String Titular;
    private double saldo;

    public Conta(String titular, double saldoInicial){
        this.Titular = titular;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println(Titular + "depositou  R$"+valor);
        }
        else {
            System.out.println("valor de deposito invalido!");
        }
    }
    public void sacar(double valor){
        if (valor >0 && valor<= saldo){
            saldo -= valor;
            System.out.println(Titular + "sacou R$"+ valor);
        }
        else{
            System.out.println("Saldo insuficiente ou valor invalido!");
        }
    }
    public void transferir(Conta destino,double valor){
        if (valor >0 && valor <= saldo){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia de R$"+valor+ "de" +Titular+ "para" + destino);
        }
        else {
            System.out.println("Transferencia invalida!");
        }
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
