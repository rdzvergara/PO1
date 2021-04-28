package questão3;

import java.security.cert.X509CRL;

/* Rodrigo Luiz de Mattos Vergara
   Mat: 00050016531 */
public class Partida extends Jogo{
   public Partida(){
      ranking=0;
   }
   public void vitoria(){
      String x= getUsername();
      ranking+=1;
      System.out.println("Parabéns "+ x + ", Subiu de Ranking");
   }
}
