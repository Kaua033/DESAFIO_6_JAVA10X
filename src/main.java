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
        NINJADD.add(new NINJA("Gaara",    17,"Aldeia da Areia"));



        //REMOVER NINJA
char escolha = 0;
Scanner ini_Scan = new Scanner(System.in);
        do {
            System.out.println("------------------NINJAS----------");
            System.out.println("1.Remover ninjas");
            System.out.println("2.listar");
            System.out.println("3.Sair");
            escolha = ini_Scan.next().charAt(0);
            switch (escolha   ) {
                case '1':   if (!NINJADD.isEmpty()) {
              NINJA NINJAL2 = NINJADD.removeFirst();
              System.out.println("removido = " + NINJAL2);
                }else {
                    System.out.println("rapaz");
                }
               break;
                case '2':
                if(!NINJADD.isEmpty()){
                    System.out.println("=================================================================LISTA=================================================================");
                    NINJA NINJA = NINJADD.get(0);
                    NINJA NINJA2 = NINJADD.get(1);
                    NINJA NINJA3 = NINJADD.get(2);
                    System.out.println("NINJAS \n" + NINJA + NINJA2 + NINJA3);
                }else {
                    System.out.println("embaçado");
                }
                           break;
                case '3':
                    System.out.println("SAINDOOOO");
            break;
                default:
                    System.out.println("mosss");
                }





        }while( escolha != '2');








        System.out.println("==================================================================================================================================");


}
}
