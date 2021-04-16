import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Programa{
    public static void main(String[] args){
        String arquivo= "./arquivo.csv";

       List<Voto> apuracao= new ArrayList<>();

        try(BufferedReader br= new BufferedReader( new FileReader(arquivo))){
            String linha= br.readLine();
            while(linha!=null){
                String[] votos= linha.split(",");
                Voto voto= new Voto(votos[0], Integer.parseInt( votos[1]));
                apuracao.add(voto);
                System.out.println(linha);
                linha= br.readLine();
            }
        } catch (Exception e){
            System.out.println("Erro ao ler arquivo\n" + e.getMessage());
        }
        System.out.println("Apuração dos Votos");
        System.out.println("---------------------\n");
        for (Voto voto: apuracao){
            System.out.println("Candidato:" + voto.getNome() + "- Votos:" + voto.getQtdVotos());
        }

        //Ordenar apuração
        Collections.sort(apuracao);

        System.out.println("\nApuração dos Votos");
        System.out.println("---------------------\n");
        for (Voto voto: apuracao){
            System.out.println("Candidato:" + voto.getNome() + "- Votos:" + voto.getQtdVotos());
        }

        Map<String, Integer> rank= new HashMap<>();

        for (Voto voto: apuracao){
            if (rank.get(voto.getNome()) == null){
                //primeira vez na hash
                rank.put(voto.getNome(),voto.getQtdVotos());
            }
            else { //acumulo de voto}
                Integer acumVoto = rank.get(voto.getNome());
                rank.put(voto.getNome(),voto.getQtdVotos()+ acumVoto);
        }
    }

    // Ranking final
    System.out.println("\nRanking");
    System.out.println("---------------------\n");
    for (Map.Entry<String,Integer> r1: rank.entrySet()){
        System.out.println(r1);
    }
}
}