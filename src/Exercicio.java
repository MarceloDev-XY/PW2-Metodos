
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
	
	// quando nao tiver nenhum tipo de retorno (return) , voc� coloca void
	public static void main(String[] args) {

		int resultadoSoma = somar(10, 100);
		System.out.println("A Soma �:" + resultadoSoma);

		int resultadoProximo = proximo (3);
		System.out.println("O Proximo �: " + resultadoProximo);
		
		int resultadoDobro = dobro (6);
		System.out.println("O dobro �: " + resultadoDobro);
	}
}
