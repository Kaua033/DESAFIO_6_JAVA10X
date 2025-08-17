import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        //ADICIONAR NINJA

        System.out.println("=================================================================");

        LinkedList<NINJA>NINJADD= new LinkedList<>();
        NINJADD.add(new NINJA("naruto",   19,"aldeia da folha"));
        NINJADD.add(new NINJA("sasuke",   19,"aldeia da folha"));
        NINJADD.add(new NINJA("Kakashi",  30,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Hinata",   16,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Shikamaru",17,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Rock Lee", 17,"Aldeia da Folha"));
        NINJADD.add(new NINJA("Gaara",    17,"Aldeia da Areia"));




        //REMOVER NINJA
   NINJA REMOVER = NINJADD.removeFirst();
        System.out.println("Ninjas Removidos " + REMOVER);
//MOSTRAR NINJAS
    for (NINJA NINJAL : NINJADD){
        System.out.println("Todos os nijas da lista " + NINJAL);
    }

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
