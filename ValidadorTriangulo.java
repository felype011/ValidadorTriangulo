import java.util.Scanner;

public class ValidadorTriangulo {
    public static void main(String[] args) {
        //Declaração de variaveis
        int a, b, c; //Lados de um triangulo

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentão
        System.out.println("\n\t\t\t --Validador de Triângulo --\n");

        //Entradas
        System.out.println("Informe o lado a: ");
        a = entrada.nextInt();
        System.out.println("Informe o lado b: ");
        b = entrada.nextInt();
        System.out.println("Informe o lado c: ");
        c = entrada.nextInt();

        //Processamento
        if((a < (b+c))&&(b <(a+c))&&(c <(a+b))){
            //É triângulo
            System.out.printf("\n%d, %d e %d formam triângulo!\n" , a, b, c);
        } else {
            //Não é triângulo
            System.out.printf("\n%d, %d = %d NÃO formam triãngulo!\n" , a, b, c);
        }
            
        
    }
} 
    

