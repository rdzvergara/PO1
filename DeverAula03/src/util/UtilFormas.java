package util;
import java.util.List;
import entidades.*;
import java.util.Scanner;

public final class UtilFormas {
    

    
    public static void imprimir(List<Forma> formas){
        System.out.println("Areas de Formas Geométricas");
        for( Forma forma: formas){
            if(forma instanceof Circulo )
            System.out.println("Area do Circulo= " + forma.getArea());
            else if(forma instanceof Quadrado )
            System.out.println("Area do Quadrado= " + forma.getArea());
        }
    }
    public static void imprimir(Circulo circulo){
        System.out.println("Circulo");
        System.out.println("Area do Circulo= " + circulo.getArea());
    }
    
    public static Double ler(Circulo circulo){
        Scanner in= new Scanner(System.in);
        System.out.println("Entre com o valor do lado: ");
        Double lado= in.nextDouble();       
        return lado;
    }
    public static Double ler(Quadrado quadrado){
        Scanner in= new Scanner(System.in);
        System.out.println("Entre com o valor do raio: ");
        Double raio= in.nextDouble();
        return raio;
    }
    in.close();

}
