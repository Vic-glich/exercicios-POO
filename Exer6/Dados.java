package Exer6;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Informe o nome do funcionário: ");
            String Nome = valor.nextLine();
            System.out.println("Informe o sobrenome do funconário: ");
            String SBNome = valor.nextLine();
            System.out.println("Informe o salário mensal do funcionário: ");
            double Salary = valor.nextDouble();
            if (Salary < 0) {
                Salary = 0;
            }

            Funcionario f = new Funcionario(Nome, SBNome, Salary);

            System.out.println("Funcionario: "+f.getNome()+" "+f.getSobrenome());
            System.out.printf("Salario anual: %.2f", f.SalaryAnual());

            f.Aumento();

            System.out.printf("\nSalario anual (com aumento de 10 porcento): %.2f", f.SalaryAnual());
            //Fiquei quase 1 hora aqui para descobrir que tinha um % depois do '10' bugando a formatação...
        }
    }
}
