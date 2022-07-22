package Exer4;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            Elevador e = new Elevador();
            boolean Vazio = false; 
            int Capac = 0;
            int Andares = 0;

            while (Capac == 0 || Andares == 0) {
                System.out.println("Informe a capacidade total do elevador: ");
                Capac = valor.nextInt();
                System.out.println("Informe a quantidade de andares: ");
                Andares = valor.nextInt();
                if (Capac <= 0 || Andares <= 0) {
                    System.out.println("Informe valores válidos!");
                } else if (Capac > 0 && Andares > 0) {
                    e.Inicializa(Capac, Andares);
                }
            }

            while (Vazio != true) {
                System.out.println("Pessoas no elevador: "+e.getqPeople()+"\nAndar atual: "+e.getaAndar());
                System.out.println("Qual a situação do elevador?\n(1) Entrando pessoas\n(2) Descendo pessoas\n(3) Subindo\n(4) Descendon\n(5) Sem ações");
                String Ativ = valor.nextLine();

                switch (Ativ) { //Não entendo do por que ele, na primeira validação, ja executa o switch e para no Default...
                    case "1":
                        if (e.getqPeople() == e.getcElev()) {
                            System.out.println("Capacidade máxima alcançada");
                        } else {
                            e.Entra();
                        }
                    break;
                    case "2":
                        if (e.getqPeople() == 0) {
                            System.out.println("Não há quem descer...");
                        } else {
                            e.Sai();
                        }
                    break;
                    case "3":
                        if (e.getaAndar() == e.gettAndar()) {
                            System.out.println("Encontra-se no último andar!");
                        } else {
                            e.Sobe();
                        }
                    break;
                    case "4":
                        if (e.getaAndar() == 0) {
                            System.out.println("Encontra-se no Terreo!");
                        } else {
                            e.Desce();
                        }
                    break; 
                    case "5":
                        System.out.println("Tenho um bom dia.");
                        Vazio = true;
                    break; 
                    default:
                        System.out.println("Informe um valor válido!");  
                }
            }
        }
    }
}
