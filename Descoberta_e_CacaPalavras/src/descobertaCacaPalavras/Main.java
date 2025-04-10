package descobertaCacaPalavras;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		String conjunto_Palavras[] = {"crime", "mafia", "italia", "abundante", "petroleo", "destino", 
				"rainha", "cartas", "truco", "cadeira"};
		Random random = new Random();
		String palavraSorteada = conjunto_Palavras[random.nextInt(conjunto_Palavras.length)];
		
		System.out.println("Bem-Vindo ao jogo! Escolha entre Descoberta(1) ou Caça-Palavras(2)");
		// opcao 1 para descoberta, 2 para caça palavras
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ou 2?");
		int respostaJogo = scanner.nextInt();
		if(respostaJogo == 1) {
			embaralharEMostrarPalavra(palavraSorteada);
			System.out.println("Qual é a palavra?");
			while(true) {
				String respostaEmbaralhar = scanner.nextLine();
				if(respostaEmbaralhar.equals(palavraSorteada)) {
					System.out.println("Parabéns! Você acertou a palavra!!");
					break;
				}
				else {
					System.out.println("Resposta errada! Deseja uma dica?");
					String respostaErrada = scanner.nextLine();
					if(respostaErrada.equals("sim")) {
						char [] letrasPalavra = palavraSorteada.toCharArray();
						System.out.printf("A primeira letra é %c e a última é %c", letrasPalavra[0], 
								letrasPalavra[letrasPalavra.length]);
					}
					
				}
			}
		}
	}
	
	
	
	private static String embaralharEMostrarPalavra(String palavra) {
		char [] letrasSeparadas = palavra.toCharArray();
		for(int x = 0; x < letrasSeparadas.length; x ++) {
			int indice_Aleatorio = new Random().nextInt(palavra.length() -1);
			
			char aux = letrasSeparadas[x];
			letrasSeparadas[x] = letrasSeparadas[indice_Aleatorio];
			letrasSeparadas[indice_Aleatorio] = aux;
			
		}
		System.out.println(new String (letrasSeparadas));
		return new String(letrasSeparadas);
	}
	
}