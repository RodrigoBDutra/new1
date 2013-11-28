package Craps;

public class Craps {
     public static int jogaDados(){
            int dado1;
            int dado2;
            int total;
            
            dado1=  1 + (int) (Math.random() * 6);
            dado2=  1 + (int) (Math.random() * 6);
            total= dado1 + dado2;
            return total;
     }
        
    public static void main(String[] args) {
            int dados1;
            int dados2;
            int ponto;
            int cont;
            
            cont = 0;
            System.out.println("REGRAS"+ 
            "\nO jogador lança dois dados, os valores das faces \n" +
            "superiores são somados;\n" +
            "• Na 1ª jogada:\n" +
            "– Se for 7 ou 11, o jogador vence;\n" +
            "– Se for 2, 3 ou 12, o jogador perde (craps);\n" +
            "– Se for 4, 5, 6, 8, 9, ou 10, este torna-se o “ponto”\n" +
            "• A partir da 2ª:\n" +
            "– o jogador lança os dados até fazer seu ponto;\n" +
            "– Caso o jogador tire um 7 ele perde."+
            "\n----------------------------------------------------------");
            
           
            dados1 = jogaDados();
            cont++;
            System.out.println("Jogada "+cont);
            System.out.println("A soma dos dados foi de "+dados1);
            
                 
            if(dados1 == 7 || dados1 == 11){
                System.out.println("----------------------------------------------------------" + "\nVOCÊ VENCEU DE PRIMEIRA :) ");
            }else  if(dados1 == 2 || dados1 == 3 || dados1 == 12){
            	System.out.println("----------------------------------------------------------" + "\nVOCÊ PERDEU DE PRIMEIRA :( ");
             }else{
                ponto = dados1;
                System.out.println(ponto+" é o seu ponto" + "\n----------------------------------------------------------");
                                       
                dados2= jogaDados();
                cont++;
                System.out.println("Jogada "+cont);
                System.out.println("A soma dos dados foi de: "+dados2);
                
                while(ponto != dados2 && dados2 != 7){   
                    cont++;
                    dados2= jogaDados();
                    System.out.println("Jogada "+cont);
                
                    System.out.println("A soma dos dados foi de: "+dados2);  
                }
                if(dados2 == 7){
                   System.out.println("----------------------------------------------------------" + "\nVOCÊ PERDEU NA RODADA: :( "+cont);
                }else{
                   System.out.println("----------------------------------------------------------" + "\nVOCÊ GANHOU NA RODADA: :) "+cont);
                }
             }
    }
}