package calculadora;
import java.util.Scanner;

/*

@author Gabriel
 
*/
public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double n1, n2;
        double resultado;
        int opcao;
                
        do{
        System.out.println("\n-----CALCULADORA-----");
        System.out.println("\n1- Adicao\n" + "2- Subtracao\n" + "3- Multiplicacao\n" + "4- Divisao\n" + "5- Sair");
        System.out.print("\nSelecione a opcao desejada: ");
        opcao = input.nextInt();
        
        if(opcao>0 && opcao<5){
        
        System.out.print("\nDigite o primeiro numero: ");
        n1 = input.nextDouble();
        
        System.out.print("\nDigite o segundo numero: ");
        n2 = input.nextDouble();
        
        switch (opcao){
            case 1:
                resultado = (n1+n2);
                System.out.println(n1 +" + "+n2 +" = "+resultado);
                break;
                
            case 2:
                resultado = (n1-n2);
                System.out.println(n1 +" - "+n2 +" = "+resultado);
                break;
                
            case 3: 
                resultado = (n1*n2);
                System.out.println(n1 +" * "+n2 +" = "+resultado);
                break;
                
            case 4: 
                if(n2 == 0){
                    System.out.println("Não é possível dividir um número por 0");
                }else{
                resultado = (n1/n2);
                System.out.println(n1 +" / "+n2 +" = "+resultado);
                }
                break;
                
            default:
                System.out.println("OPCAO INVALIDA!!!");
        }
        }else if(opcao == 5){
            System.out.println("Encerrando calculadora...");
        }
        else if(opcao != 5){
            System.out.println("OPCAO INVALIDA!!!");
        }
        }while (opcao !=5);
        input.close();  
    }
    
}