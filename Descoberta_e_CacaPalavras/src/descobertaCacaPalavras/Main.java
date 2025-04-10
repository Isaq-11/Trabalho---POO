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
//				else {
//					String respostaErrada = scanner.nextLine();
//					System.out.println();
				}
			}
		}
	
	
	
	
	private static String embaralharEMostrarPalavra(String palavra) {
		char [] letras_Separadas = palavra.toCharArray();
		for(int x = 0; x < letras_Separadas.length; x ++) {
			int indice_Aleatorio = new Random().nextInt(palavra.length() -1);
			
			char aux = letras_Separadas[x];
			letras_Separadas[x] = letras_Separadas[indice_Aleatorio];
			letras_Separadas[indice_Aleatorio] = aux;
			
		}
		System.out.println(new String (letras_Separadas));
		return new String(letras_Separadas);
	}
	
	
	
	
	
	
	private static String embaralhar(String palavra) {
		char[] palavraArray = palavra.toCharArray();
		for(int x=0; x<palavraArray.length; x++) {
			int indiceAleatorio = new Random().nextInt(palavra.length()-1);
			System.out.println(indiceAleatorio);
			
			
			char temp = palavraArray[x];
			palavraArray[x] = palavraArray[indiceAleatorio];
			palavraArray[indiceAleatorio] = temp;
			
			System.out.println(new String(palavraArray));
		}
		return new String(palavraArray);
	}


}