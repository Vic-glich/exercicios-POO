package Exer6;

public class Funcionario {
    private String Nome;
    private String Sobrenome;
    private double SMensal;
    
    public Funcionario(String Nome, String Sobrenome, double SMensal) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.SMensal = SMensal;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSobrenome(String Sob) {
        Sobrenome = Sob;
    }

    public void setSMensal(double Salary) {
        SMensal = Salary;
    }

    public String getNome() {
        return Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public double getSMensal() {
        return SMensal;
    }

    public double SalaryAnual() {
        return SMensal * 12;
    }

    public void Aumento() {
        SMensal += SMensal * 0.10;
    }
}



