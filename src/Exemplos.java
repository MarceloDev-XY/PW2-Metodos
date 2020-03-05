
public class Exemplos {
	public static void main(String[] args) {



		classificar(-1);

	}

	public static void ehMaiorIdade(int idade) {

		if (idade >= 18) {
			System.out.println("Maior de idade" + " " + idade);

		} else {
			System.out.println("Menor de idade" + "" + idade);

		}

	}

	public static void classificar(int num) {

		if (num > 0) {

			System.out.println("positivo");

		}

		else if (num == 0) {
			System.out.println("nulo");
		} else {
			System.out.println("negativo");
		}

	}
	

}
