package Exer3;

import java.text.DecimalFormat;

public class Bomba {
    public String tCombust;
    public double ValLitro;
    public double QtdCombust;

    DecimalFormat df = new DecimalFormat("0.00");

    public String gettCombust() {
        return tCombust;
    }
    
    public double getValLitro() {
        return ValLitro;
    }

    public double getQtdCombust() {
        return QtdCombust;
    }
    
    public void settCombust(String tCombust) {
        this.tCombust = tCombust;
    }
    
    public void setValLitro(double ValLitro) {
        this.ValLitro = ValLitro;
    }

    public void setQtdCombust(double QtdCombust) {
        this.QtdCombust = QtdCombust;
    }

    public String abastecerPorValor(double Val) {
        double tot = Val / ValLitro;
        if ((QtdCombust - tot) < 0) {
            return "Quantidade acima da disponivel!";
        }
        QtdCombust -= tot;
        return df.format(tot);
    }

    public String abastecerPorLitro(double lit) {
        double tot = ValLitro * lit;
        QtdCombust -= lit;
        return df.format(tot);
    }
    
    public void alterarValor(double nVal) {
        ValLitro = nVal;
    }

    public void alterarCombustivel(String Comb) {
        tCombust = Comb;
    }

    public void alterarQuantidadeCombustivel(double nLit) {
        QtdCombust = nLit; 
    }
}
