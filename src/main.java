import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //ADICIONAR NINJA

        System.out.println("=================================================================");

        LinkedList<NINJA>NINJADD= new LinkedList<>();
        NINJADD.add(new NINJA("naruto",   17,"aldeia da folha"));
        NINJADD.add(new NINJA("sasuke",   17,"aldeia da folha"));
        NINJADD.add(new NINJA("Kakashi",  30,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Hinata",   16,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Shikamaru",17,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Rock Lee", 17,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Gaara",    17,"Aldeia da Areia"));



        //REMOVER NINJA
char escolha = 0;
Scanner ini_Scan = new Scanner(System.in);
        do {
            System.out.println("------------------NINJAS----------");
            System.out.println("1.Remover ninjas");
            System.out.println("2.adicionar ninjas");
            System.out.println("3.listar");
            System.out.println("4.Sair");
char Escolha  = ini_Scan.next().charAt(0);
            switch (escolha   ) {
                case 1:   if (!NINJADD.isEmpty()) {
                    NINJADD.removeFirst();
              NINJA NINJAL2 = NINJADD.removeFirst();

                    System.out.println("removido = " + NINJAL2);

                } else {
                    System.out.println("rapaz");
                }
break;

            }





        }while( escolha == 1);








        System.out.println("=================================================================");


    //ACESSAR NINJA
NINJA NiNJA = NINJADD.get(0);
NINJA NiNJA1 = NINJADD.get(1);
NINJA NiNJA2 = NINJADD.get(2);

        System.out.println("PUXAR O PRIMEIRO" + NiNJA);
        System.out.println("PUXAR O SEGUNDO " + NiNJA1);
        System.out.println("PUXAR O TERCEIRO" + NiNJA2 );
        }

}
