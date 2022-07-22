package Exer3;

import java.util.Scanner;

public class Gerenciamento {
    static Bomba c = new Bomba();

    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Informe o tipo do combustivel: ");
            c.settCombust(valor.nextLine());
            menu();
        }
    }
    
    public static void menu() {
        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Combustivel atual: "+ c.gettCombust());
            System.out.println("Informe uma das seguintes opções\n(1) Abastecer por valor\n(2) Abastecer por litro\n(3)Alterar valor do combustivel\n(4) Alterar tipo do combustivel\n(5) Alterar quantidade do combustivel\n(6) Finalizar");
            String Op = valor.nextLine();
    
            switch (Op) {
                case "1":
                    AbstVal();
                break;
                case "2":
                    AbstLit();
                break;
                case "3":
                    altVal();
                break;
                case "4":
                    altComb();
                break;
                case "5":
                    altQtd();
                break;
                case "6":
                    System.out.println("Finalizando..."); 
                break;
                default:
                    System.out.println("Informe uma das opções acima!");
                    menu();
            }
        }
    }

    public static void AbstVal() {
        try (Scanner Val = new Scanner(System.in)) {
            if (c.getQtdCombust() == 0) {
                System.out.println("Quantidade insuficiente na bomba!");
                menu();
            } else if(c.getValLitro() == 0) {
                System.out.println("Valor não especificado!");
                menu();
            }

            System.out.print("Informe o valor a abastecer: ");
            double v = Val.nextDouble();

            if (v <= 0) {
                System.out.println("Informe um valor valido!");
                AbstVal();
            }

            System.out.println("Quantidade abastecida: "+c.abastecerPorValor(v));

            menu();
        }
    }

    public static void AbstLit() {
        try (Scanner Lit = new Scanner(System.in)) {
            if (c.getQtdCombust() == 0) {
                System.out.println("Quantidade insuficiente na bomba!");
                menu();
            } else if(c.getValLitro() == 0) {
                System.out.println("Valor não especificado!");
                menu();
            }

            System.out.print("Informe a quantidade de litros: ");
            double v = Lit.nextDouble();

            if (v <= 0) {
                System.out.println("Informe um valor valido!");
                AbstLit();
            } else if (v > c.getQtdCombust()) {
                System.out.println("Quantidade acima da disponível!");
                AbstLit();
            }

            System.out.println("Total a se pagar: "+c.abastecerPorLitro(v));

            menu();
        }
    }

    public static void altVal() {
        try (Scanner Val = new Scanner(System.in)) {
            System.out.printf("Preço atual: %.2f", c.getValLitro());
            System.out.println("\nNovo preço p/litro: ");
            double nValor = Val.nextDouble();

            if (nValor <= 0) {
                System.out.println("Valor inválido!");
                altVal();
            }

            c.alterarValor(nValor);

            menu();
        }
    }

    public static void altComb() {
        try (Scanner Val = new Scanner(System.in)) {
            System.out.println("Combustivel atual: "+c.gettCombust());
            System.out.println("Novo combustivel da bomba: ");
            String nValor = Val.nextLine();

            c.alterarCombustivel(nValor);

            menu();
        }
    }

    public static void altQtd() {
        try (Scanner Val = new Scanner(System.in)) {
            System.out.printf("Quantidade atual: %.2f", c.getQtdCombust());
            System.out.println("\nQuantidade nova na bomba: ");
            double nValor = Val.nextDouble();

            if (nValor <= 0) {
                System.out.println("Valor inválido!");
                altQtd();
            }

            c.alterarQuantidadeCombustivel(nValor);

            menu();
        }
    }
}
