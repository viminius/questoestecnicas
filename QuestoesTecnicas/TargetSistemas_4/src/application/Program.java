package application;

public class Program {

	public static void main(String[] args) {

		double fatSP = 67836.43;
		double fatRJ = 36678.66;
		double fatMG = 29229.88;
		double fatES = 27165.48;
		double outros = 19849.53;

		double total = fatSP + fatRJ + fatMG + fatES + outros;

		System.out.printf("Percentual de representação de SP: %.2f%%\n", (fatSP / total) * 100);
		System.out.printf("Percentual de representação de RJ: %.2f%%\n", (fatRJ / total) * 100);
		System.out.printf("Percentual de representação de MG: %.2f%%\n", (fatMG / total) * 100);
		System.out.printf("Percentual de representação de ES: %.2f%%\n", (fatES / total) * 100);
		System.out.printf("Percentual de representação de Outros: %.2f%%\n",(outros / total) * 100);
	}

}
