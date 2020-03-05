
public class Exercicio {

	public static int somar(int num1, int num2) {

		return (num1 + num2);

	}
	
	public static int proximo(int num) {
		
		return (num + 1);
	}
	
	public static int dobro(int num) {
		
		return (num * 2);
	}
	
	// quando nao tiver nenhum tipo de retorno (return) , você coloca void
	public static void main(String[] args) {

		int resultadoSoma = somar(10, 100);
		System.out.println("A Soma é:" + resultadoSoma);

		int resultadoProximo = proximo (3);
		System.out.println("O Proximo é: " + resultadoProximo);
		
		int resultadoDobro = dobro (6);
		System.out.println("O dobro é: " + resultadoDobro);
	}
}
