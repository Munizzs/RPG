package rpg;

import java.util.Random;
import java.util.Scanner;

public class RPG {
    
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static int Vida = rand.nextInt(10,50);
    
    public static void Medieval(){
    int Arma, danoArma = 0;
    int VidaGoblim = rand.nextInt(10,50);
    int Es1;
    int defesaEscudo = 0;
    
    
        System.out.println("---------------------------Medieval---------------------");
        
        System.out.println("\nVoc� acordou dentro de uma sala um pouco escura, ao se levantar voc� esculta um barulho\n\n !!CUIDADO!!\n\n H� um pequeno goblin com uma adaga se aproximando de voc�, o que voc� ir� fazer:");
        
            System.out.println("\n1- Abrir um ba� que est� ao seu lado esquerdo.\n2- Sair correndo pela porta ao seu lado direito.\n3- Enfrentar o goblin.");
            Es1 = scan.nextInt();
            
             switch(Es1){
            
                case 1 ->{
                
                    System.out.println( "\nVoc� sai correndo e abre o ba�.\n");
                    
                    
                    Arma = rand.nextInt(1,7);
                    
                    switch(Arma){
                    
                        case 1:  
                            danoArma = rand.nextInt(9) + 4; 
                            System.out.printf("     |Voc� ganhou uma espada!|\nDano: %d",danoArma);
                                                                         
                        break;
                        case 2:
                            int flechas = rand.nextInt(16) + 5;
                            danoArma = rand.nextInt(5) + 4;
            System.out.printf("     |Voc� ganhou um arco!|\nDano: %d\nFlechas: %d",danoArma,flechas);
            break;
        case 3:
            danoArma = rand.nextInt(5) + 3;
            defesaEscudo = rand.nextInt(5)+2;
            System.out.printf("     |Voc� ganhou um escudo!|\nDano: %d\nDefesa: %d",danoArma,defesaEscudo);            
            break;
        case 4:
            danoArma = rand.nextInt(7) + 4;
            System.out.printf("     |Voc� ganhou uma lan�a!|\nDano: %d",danoArma);
            break;
        case 5:
            danoArma = rand.nextInt(11) + 5;
            System.out.printf("     |Voc� ganhou um machado!|\nDano: %d",danoArma);
            break;
        case 6:
            int tipoMagia = rand.nextInt(5);           
            String nomeMagia = "";

            switch (tipoMagia) {
                case 0:
                    danoArma = rand.nextInt(8) + 5;
                    nomeMagia = "Fogo";
                    break;
                case 1:
                    danoArma = rand.nextInt(6) + 5;
                    nomeMagia = "Raio";
                    break;
                case 2:
                    danoArma = rand.nextInt(7) + 2;
                    nomeMagia = "�gua";
                    break;
                case 3:
                    danoArma = rand.nextInt(7) + 3;
                    nomeMagia = "Ar";
                    break;
                case 4:
                    danoArma = rand.nextInt(10) + 5;
                    nomeMagia = "Pedra";
                    break;
            }
            

            System.out.printf("     |Voc� ganhou um livro de feiti�o!|\nMagia: %s\nDano %d",nomeMagia,danoArma);
            break;           
    }
                    System.out.println("\n\n Agora voc� esta pronto para enfrentar o goblim");
            
            System.out.printf("\n\n O goblim tem %d pontos de vida",VidaGoblim);
            
           
           
            
            
            
            
            
            
            do{   
                int Sorte=rand.nextInt(0,11);
                
                 System.out.printf("\n\nSua vez!\nSeu numero da sorte: %d\n",Sorte);
           
            if(Sorte>=2 && Sorte<=8){ 
                
            
                System.out.println("\nVoc� acertou!");
                
                    VidaGoblim=VidaGoblim-danoArma;
                    if(VidaGoblim<1){System.out.println("\nGoblim MORREU!");
                    VidaGoblim=0;}
                    
                    
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",danoArma,Vida,VidaGoblim);
            
                
            }else if(Sorte==0){
            
                System.out.println("Voce Errou o ataque.");
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",0,Vida,VidaGoblim);
                       
            }else if(Sorte==1){
                danoArma=danoArma-5;
            
                System.out.println("Voce acertou de rasp�o.");
                
                VidaGoblim=VidaGoblim-danoArma;
                if(VidaGoblim<1){System.out.println("\nGoblim MORREU!");
                    VidaGoblim=0;}
                
               
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",danoArma,Vida,VidaGoblim);
                       
            }else if(Sorte==9){
                danoArma=danoArma+4;
            
                System.out.println("Voce acertou um bom ataque!.");
                
                VidaGoblim=VidaGoblim-danoArma;
                if(VidaGoblim<1){System.out.println("\nGoblim MORREU!");
                    VidaGoblim=0;}
                
                
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",danoArma,Vida,VidaGoblim);
                       
            }else if(Sorte==10){
                danoArma=danoArma*2;
            
                System.out.println("ACERTO CRITICO!!");
                
                VidaGoblim=VidaGoblim-danoArma;
                if(VidaGoblim<1){System.out.println("\nGoblim MORREU!");
                    VidaGoblim=0;}
                
                
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",danoArma,Vida,VidaGoblim);                      
            }
           
            if(VidaGoblim<1){break;}
            
            
            int Sorteg=rand.nextInt(0,11);
            int armaGoblim = rand.nextInt(6)+4;
            
                System.out.println("\nAgora � a vez do goblim.");
                System.out.println("Sorte do Goblim: "+Sorteg);
            if(Sorteg>=2 && Sorteg<=8){
               if(Arma==3){armaGoblim=armaGoblim-defesaEscudo;}
            
                System.out.println("\nVoc� foi acertado.");
                
                Vida=Vida-armaGoblim;
                if(Vida<1){System.out.println("VOC� MORREU!");
                Vida=0;}
                
                
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",armaGoblim,Vida,VidaGoblim);
            
            
            }else if(Sorteg==0){
            
                System.out.println("Errou o ataque.");
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",0,Vida,VidaGoblim);
                       
            }else if(Sorteg==1){
                if(Arma==3){armaGoblim=armaGoblim-defesaEscudo;}
                armaGoblim=armaGoblim-5;
            
                System.out.println("Voce acertou de rasp�o.");
                
                Vida=Vida-armaGoblim;
                if(Vida<1){System.out.println("VOC� MORREU!");
                Vida=0;}
                
               
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",armaGoblim,Vida,VidaGoblim);
                       
            }else if(Sorteg==9){
                if(Arma==3){armaGoblim=armaGoblim-defesaEscudo;}
                armaGoblim=armaGoblim+4;
            
                System.out.println("Acertou um bom ataque!.");
                
                Vida=Vida-armaGoblim;
                if(Vida<1){System.out.println("VOC� MORREU!");
                Vida=0;}
                                              
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",armaGoblim,Vida,VidaGoblim);
                       
            }else if(Sorteg==10){
                if(Arma==3){armaGoblim=armaGoblim-defesaEscudo;}
                armaGoblim=armaGoblim*2;
            
                System.out.println("ACERTO CRITICO!!");
                
                Vida=Vida-armaGoblim;
                if(Vida<1){System.out.println("VOC� MORREU!");
                Vida=0;}
                
                System.out.printf("\n\nDano: %d\n\nSua vida: %d | Goblim: %d\n",armaGoblim,Vida,VidaGoblim);                     
            }      
            
                }while(Vida>0 && VidaGoblim>0); 
                       
            if(VidaGoblim<1){System.out.println("\nO que voc� ira fazer agora?");}
            
            if(Vida<1){break;}
}                
                case 2 ->{}
                case 3 ->{
                
                    System.out.println("Voc� sai correndo para cima do goblim e � acertado pela adaga.\n\n VOCE MORREU");
                    System.out.close();
                
                }
                default->{}
                
                
             }
    }
    
    public static void bau1(){
    
    
    
    
    }
    
    public static void Personagem(){
        String Nome, Genero;
        
    
    do{    
        System.out.println("Qual � o genero do seu personagem?(M ou F)");
        Genero = scan.nextLine();
        
            if(Genero.equalsIgnoreCase("M") || Genero.equalsIgnoreCase("F"))
                
                if(Genero.equalsIgnoreCase("m")){System.out.println("\nSeu personagem � Masculino.");}
                else{System.out.println("\nSeu personagem � Feminino.");}
            
            
            else{System.out.println("\nGenero Invalido!");continue;}
            
            System.out.println("\nDigite seu nome:");
            Nome = scan.nextLine();
            
            System.out.printf("\n%s tem %2d de vida!",Nome,Vida);
    break;
    
    }while(true);
    }
    
    public static void main(String[] args) {
        int ModoJogo;
        
        System.out.println("Ol�, seja bem-vindo(a) ao meu jogo.");
        System.out.println("Antes de tudo responda:\n");
        
        Personagem();
        
        System.out.println("\n\nQual modo voc� deseja escolher:\n\n1- Medieval\n2- Cyberpunk\n3 -Zumbi\n");
        ModoJogo=scan.nextInt();
        
            switch(ModoJogo){
            
                case 1 ->{
                System.out.println("Pressione Enter para continuar...");
        scan.nextLine();
                Medieval();
                
                }                    
                          
                case 2 ->{}
                case 3 ->{}
                default->{}
            
            
            }
        
    }
    
}
