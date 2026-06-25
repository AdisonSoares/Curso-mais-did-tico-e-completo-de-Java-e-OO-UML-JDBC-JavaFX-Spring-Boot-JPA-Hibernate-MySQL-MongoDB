package generics_set_map.map_exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    static void main() {

        String path = "/home/adison/Documentos/inVotos";
        Map<String, Integer> votacao = new LinkedHashMap<>();

        //Armazena os valores
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String candidato = fields[0];
                int votosUrna = Integer.parseInt(fields[1]);
                if(votacao.containsKey(candidato)) {
                    int votosAntigos = votacao.get(candidato);
                    int totalAtualizado = votosUrna + votosAntigos;
                    votacao.put(candidato, totalAtualizado);
                }else{
                    votacao.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }
            for (String key : votacao.keySet()) {
                System.out.println(key + ": " + votacao.get(key));
            }
        }catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
