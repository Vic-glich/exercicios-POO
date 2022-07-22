package Exer4;

public class Elevador { //Lembrei agora que apenas usamos get e set para valores private '- '
    private int aAndar = 0;
    private int tAndar = 0;
    private int cElev = 0;
    private int qPeople = 0;

    public int getaAndar() {
        return aAndar;
    }

    public int gettAndar() {
        return tAndar;
    }

    public int getcElev() {
        return cElev;
    }

    public int getqPeople() {
        return qPeople;
    }
    
    public void settAndar(int Total) {
        tAndar = Total;
    }

    public void setcElev(int Capac) {
        cElev = Capac;
    }

    public void Inicializa(int qtd, int qtdAndar) {
        setcElev(qtd);
        settAndar(qtdAndar);
    }

    public void Entra() {
        qPeople += 1;   
    }

    public void Sai() {
        qPeople -= 1;
    }

    public void Sobe() {
        aAndar += 1;
    }

    public void Desce() {
        aAndar -= 1;
    }
}
