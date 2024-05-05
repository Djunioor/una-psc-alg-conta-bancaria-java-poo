public class Depositar{

    private double depositar;
    private double saldo;

    public Depositar(double depositar, double saldo) {
        this.depositar = depositar;
        this.saldo = saldo;
    }
    public double getDepositar() {
        return depositar;
    }
    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositado() {
        System.out.println("voce esta despositando " + depositado + "R$:");
    }

}
