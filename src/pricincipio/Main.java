package pricincipio;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean continuar = true;
		do {
			boolean fim = false;
			char[] palavraEditada = perguntaPalavra();
			
			char[] achado = new char[palavraEditada.length];
			
			while(fim != true) {
				char letra = letraEscolhida();
				
				for (int i = 0; i < palavraEditada.length; i++) {
					if(palavraEditada[i] == letra) {
						achado[i] = letra;
					}
				}
				
				for (int i = 0; i < achado.length; i++) {
					if(achado[i] == '\u0000') {
						achado[i] = '_';
					}
					System.out.print(achado[i]);
				}
				System.out.println();
				for (int i = 0; i < achado.length; i++) {
					if(achado[i] == '_') {
						fim = false;
					}
				}
				
				fim = Arrays.equals(achado, palavraEditada);
			}
			System.out.println("---------------------");
			System.out.println("Parabéns Você ganhou!!");
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Você quer continuar (sim ou não): ");
			String quero = entrada.nextLine();
			
			if(quero.equals("sim")) {
				continuar = true;
			}else {
				continuar = false;
			}
		} while (continuar == true);
	}
	
	public static char[] perguntaPalavra() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a palavra da forca: ");
		String palavra = entrada.nextLine();
		
		palavra = palavra.toLowerCase();
		char[] arrayPalavra = palavra.toCharArray();
		return arrayPalavra;
	}
	
	public static char letraEscolhida() {
		System.out.println("---------------------");
		System.out.println();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = entrada.next().charAt(0);
		char letraFim = Character.toLowerCase(letra);
		System.out.println("---------------------");
		return letraFim;
	}
	
}
