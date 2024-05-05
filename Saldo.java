public class Saldo {

    private double saque;
    private double saldo;
 
    public Saldo(double saque, double saldo) {
        this.saque = saque;
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
        public void sacado(){ 
            System.ou.println("O valor sacado é " + saque + "R$:");
        }
    }

