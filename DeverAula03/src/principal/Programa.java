package principal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entidades.*;
import util.*;

public class Programa {
    public static void main(String[] args){
        Double raio,lado;
        /*Scanner in= new Scanner(System.in);
        System.out.println("Entre com o valor do raio: ");
        raio= in.nextDouble(); */
        Circulo circulo= new Circulo();
       /* System.out.println("Entre com o valor do lado: ");
        lado= in.nextDouble(); */
        Quadrado quadrado= new Quadrado();
        //System.out.println("Area= "+ circulo.getArea());
       // System.out.println("Area= "+ quadrado.getArea());
        raio= UtilFormas.ler(circulo);
        lado= UtilFormas.ler(quadrado);
        
        List<Forma> formas= new ArrayList<>();

        formas.add(circulo);
        formas.add(quadrado);

        UtilFormas.imprimir(formas);
        UtilFormas.imprimir(circulo);
        //in.close();
    }
}
