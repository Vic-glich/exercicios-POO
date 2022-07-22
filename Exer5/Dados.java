package Exer5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Dados {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            Aluno a = new Aluno();
            boolean bRec = false;

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                System.out.print("Informe a data da matricula(dd/mm/yyyy): ");
                a.setMatricula(sdf.parse(valor.next()));
            } catch(ParseException e) {
                System.out.println("Informe uma data válida!");
            }
            System.out.print("Informe Nome do Aluno: ");
            a.Name = valor.next(); 

            while (bRec != true) {
                System.out.print("Informe a primeira e segunda nota(máximo 2,5): ");
                double n1 = valor.nextDouble();
                double n2 = valor.nextDouble();
                
                System.out.print("Informe a nota do trabalho: ");
                double trab =  valor.nextDouble();

                if (n1 > 2.5 || n2 > 2.5 || trab > 2) {
                    System.out.println("Valor inválido, as provas valem 2,5 e o trabalho 2!");    
                } else if (n1 < 0 || n2 < 0 || trab < 0) {
                    System.out.println("Valor negativo inválido!");
                } else {
                    a.setNotas(n1, n2);
                    a.setTrab(trab);
                    bRec = true;
                }
            }

            System.out.println("Aluno: "+a.Name+"\nMatricula: "+a.getMatricula());
            System.out.printf("Media: %.1f", a.media());
            if (a.media() < 5) {
                System.out.printf("\nNota necessária: %.1f", a.Mfinal()); //Apenas o resto que falta da prova? Fiz assim...
            }
        }
    }
}
