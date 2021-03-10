import java.util.Scanner;

public class RodrigoTabuada {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        String nome= "";
        System.out.println("Digite seu nome:");
        nome= input.next();
        System.out.printf("Olá %s,entre com o numero: ",nome);
        int x;
        x= input.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(x+i);

        }
        // Nome: Rodrigo , Matricula: 0050016531
    }
}