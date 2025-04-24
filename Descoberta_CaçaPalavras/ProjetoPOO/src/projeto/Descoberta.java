package projeto;
import java.util.Scanner;

public class Descoberta {
    Scanner scanner = new Scanner(System.in);
    Palavras palavras = new Palavras();

    public void inciarJogo() {
        String sorteada = palavraSorteada();
        String palavraEmbaralhada = palavras.embaralharPalavra(sorteada);
        System.out.println(palavraEmbaralhada);
        compararComPalavraEscolhida(sorteada);
    }

    public String palavraSorteada (){
        String palavraSorteada = palavras.escolherPalavra();
        return palavraSorteada;
    }

    public String pergunta() {
        System.out.print("Qual é a palavra? ");
        String resposta = scanner.nextLine();
        return resposta;
    }
    public boolean compararComPalavraEscolhida(String palavra) {
        String resposta = pergunta();
        if (resposta.equals(palavra)) {
            System.out.println("Acertou!!");
            return true;
        }
        return false;
    }



}
