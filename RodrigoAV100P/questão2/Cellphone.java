package questão2;
/* Rodrigo Luiz de Mattos Vergara
   Mat: 00050016531 */
public class Cellphone {
    private Boolean ligado=false;
    public void ligar(){
       ligado=true;
       System.out.println("Dispositivo ligado");
    }
    public void desligar(){
       ligado=false;
       System.out.println("Dispositivo desligado");
    }

}
