package Exer1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SobrePessoa {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try (Scanner valor = new Scanner(System.in)) {
            Pessoa p = new Pessoa();
            System.out.print("Informe seu nome: ");
            p.setName(valor.nextLine());
            try {
                System.out.print("Informe sua data de nascimento(dd/mm/yyyy): ");
                p.setAniver(sdf.parse(valor.next()));
            } catch(ParseException e) {
                System.out.println("Informe uma data válida!");
            }
            System.out.print("Informe sua altura: ");
            p.setAltura(valor.nextDouble());

            //Passei raiva com essa data, apesar que acho que deveria ter usado o DateFormat ou o LocalDate...
            System.out.printf("Nome: "+p.getName()+"\nAniversario: "+p.getAniver()+"\nIdade: "+p.Idade()+"\nAltura: %.2f", p.getAltura());
        }
    }
}
