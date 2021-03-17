import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ConjuntosBonsOuRuins {

    protected static List<String> conjunto;
    protected static String saida = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputQtdPalavras;

        while (!"0".equals((inputQtdPalavras = br.readLine()))) {
            int qtdPalavras = Integer.valueOf(inputQtdPalavras);
            conjunto = new ArrayList<String>();
            for (int i = 0; i < qtdPalavras; i++)
                conjunto.add(br.readLine());

            saida = "Conjunto Bom";
            conjunto.forEach(palavra -> {
                int qtdPalavraEncontrada = 0;
                for (int e = 0; e < conjunto.size(); e++) {
                    if (conjunto.get(e).startsWith(palavra)) qtdPalavraEncontrada++;
                }
                if (qtdPalavraEncontrada > 1 ) {
                    saida = "Conjunto Ruim";
                }
            });
            System.out.println(saida);
        }
    }
}
