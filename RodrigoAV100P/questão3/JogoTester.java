package questão3;
import java.util.Scanner;
/* Rodrigo Luiz de Mattos Vergara
   Mat: 00050016531 */
public class JogoTester{
   public static void main(String[] args){
    Partida game= new Partida();
    Scanner in= new Scanner(System.in);
    String nn;
    System.out.print("Digite seu username: ");
    nn= in.next();
    game.setUsername(nn);
    game.vitoria();
    in.close();
}
}