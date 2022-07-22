package Exer2;

import java.text.DecimalFormat;
import java.util.Random;

public class Conta {
    public String Name;
    
    private double Saldo = 0;
    private int nConta;

    DecimalFormat df = new DecimalFormat("0.00");
    Random random = new Random();

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setConta() {
        nConta = random.nextInt(10000);
    }
    
    public String getName() {
        return Name;
    }

    public double getSaldo() {
        return Saldo;
    }

    public int getConta() {
        return nConta;
    }

    public void Deposito(double Saldo) {
        this.Saldo += Saldo;
    }

    public void Saque(double Saldo) {
        this.Saldo -= Saldo;
    }
}
