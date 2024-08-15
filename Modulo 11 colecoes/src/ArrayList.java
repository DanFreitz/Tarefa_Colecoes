import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Danfreitz
 */
public class ArrayList {

    //ler no console e em ordem alfabetica. Part 1

    public static void main(String[] args) {
        //Nome das Pessoas em Ordem Alfabetica
        NomesDasPessoas();
        SepararDaVirgula();
        Generos();
    }
        private static void NomesDasPessoas() {
        System.out.println("****** NomesDasPessoas ******");
        List<String> Nomes = new java.util.ArrayList<String>();

        Nomes.add("Rodrigo Pires");
        Nomes.add("Paulo Neto");
        Nomes.add("Ariana Pereira");

        Collections.sort(Nomes);

        System.out.println(Nomes);
    }

    private static void SepararDaVirgula() {
        // Parte 1

        System.out.println("****** SepararDaVirgula ******");
        String nomes = "Rodrigo Pires, Paulo Neto, Ariana Pereira";

        String[] nomesSeparados = nomes.split(", ");

        for (String nome : nomesSeparados) {
            System.out.println(nome);
        }

    }

    private static void Generos() {
        //Separar os genero Masculino e Feminino Parte 2

        System.out.println("****** Generos ******");
        String nomes = "Rodrigo Pires, Pedro Neto, Ariana Pereira";

        List<String> nomesMasculinos = new java.util.ArrayList<>();
        List<String> nomesFemininos = new java.util.ArrayList<>();

        String[] nomesSeparados =  nomes.split(", ");

        for (String nome : nomesSeparados) {
            if (isMasculino(nome)) {
                nomesMasculinos.add(nome);
            }else {
                nomesFemininos.add(nome);
            }
        }

        System.out.println("Nomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("Nomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

    }

    private static boolean isMasculino(String nome) {
        String[] suffixosMasculinos = { "o", "s", "r", "l", "n"};
        for (String suffixo : suffixosMasculinos) {
            if (nome.toLowerCase().endsWith(suffixo)) {
                return true;
            }
        }
        return false;
    }

}
