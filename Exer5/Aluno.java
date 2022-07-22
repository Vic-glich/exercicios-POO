package Exer5;

import java.util.Date;

public class Aluno {
    public String Name;

    private Date Matricula;
    private double[] Notas = new double[2];
    private double Trab;

    public Date getMatricula() {
        return Matricula;
    }

    public void setMatricula(Date Data) {
        Matricula = Data;
    }

    public void setNotas(double n1, double n2) {
        Notas[0] = n1;
        Notas[1] = n2;
    }

    public void setTrab(double Trab) {
        this.Trab = Trab;
    }

    public double media() { //Não entendi se as provas valem no máximo 2,5, então fiz desse jeito mesmo
        return Notas[0]+Notas[1]+Trab;    
    }

    public double Mfinal() { //Coloquei Mfinal pois o 'final' não funciona para método
        return 5 - media();
    }
}
