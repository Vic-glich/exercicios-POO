package Exer1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {
    public String Nome;
    public Date Aniver;
    public double Altura;

    private Date hoje = new Date();

    //Retorna os dados
    public String getName() {
        return Nome;
    }
    
    public Date getAniver() {
            return Aniver;
    }

    public double getAltura() {
        return Altura;
    }

    //Recebe os dados
    public void setName(String Nome) {
        this.Nome = Nome;
    }
    
    public void setAniver(Date Aniver) {
        this.Aniver = Aniver;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public long Idade() {
        TimeUnit time = TimeUnit.DAYS;
        long d = hoje.getTime() - Aniver.getTime();
        long s = time.convert(d, TimeUnit.MILLISECONDS);
        return (s/365);
    }
}