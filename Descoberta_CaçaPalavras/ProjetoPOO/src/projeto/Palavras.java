package projeto;

import java.util.Random;

public class Palavras {
    Random random = new Random();
    private String [] palavras = {"girassol", "trem", "oceano", "montanha", "relampago",
            "borboleta", "espelho", "nuvem", "chave", "silencio", "bussola",
            "tempo", "livro", "misterio", "areia"};

    public String escolherPalavra() {
        String palavraEscolhida = palavras[random.nextInt(palavras.length)];
        return palavraEscolhida;
    }

    public String embaralharPalavra (String palavra) {
        char [] palavraRecebida = palavra.toCharArray();

        for (int x = 0; x < palavraRecebida.length; x++) {
            int indiceAleatorio = random.nextInt(palavraRecebida.length);

            char aux = palavraRecebida[x];
            palavraRecebida[x] = palavraRecebida[indiceAleatorio];
            palavraRecebida[indiceAleatorio] = aux;
        }
        return new String(palavraRecebida);
    }
}

