package calculadora;

import java.util.Scanner;

public class Calculadora {
       
    
    public static void main(String[] args) {
        

// Aqui o usuário irá escolher uma das operações.
        
        Scanner scan = new Scanner(System.in);
                        System.out .println("\n\n### CALCULCADORA ###");
			System.out.println("\n                  =========================");
			System.out.println("                  |     1 - Soma          |");
			System.out.println("                  |     2 - Subtração     |");
			System.out.println("                  |     3 - Divisão       |");
			System.out.println("                  |     4 - Multiplicação |");
      
        int opcao = scan.nextInt();
        
//Aqui ele irá digitar o primeiro número;
        System.out.println("Digite o primeiro número: ");
        float x = scan.nextFloat();
        System.out.println("Digite o segundo número: ");
        float y = scan.nextFloat();
       
//Ao escolher a operação matemática o programa irá executar
        
        switch(opcao){
                
            case 1:
                float soma = x + y;
                System.out.println("A soma da operação é ("+ soma +")");
                break;
                
            case 2:
                float subtracao = x - y;
                System.out.println("A subtração da operação é ("+ subtracao +")");
                break;
              
            case 3:
                float divisao = x / y;
                System.out.println("A divisão da operação é ("+ divisao +")");
                break;
             
            case 4:
                float multiplicacao = x * y;
                System.out.println("A multiplicação da operação é ("+ multiplicacao +")");
                break;    
            
            default:
                System.out.println("A opção escolhida é inválida");
                break;
             }
        
    
        
        
    
    }
    
}
