package application;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Program {

	static class FaturamentoDia {
		int dia;
		double valor;
	}

	public static void main(String[] args) {
		String pathFiles = "src/dados.json";

		List<FaturamentoDia> faturMensal = carregarFatur(pathFiles);

		if (faturMensal == null || faturMensal.isEmpty()) {
			System.out.println("Falha ao carregar o faturamento.");
			return;
		}

		double menorFatur = Double.MAX_VALUE;
		double maiorFatur = Double.MIN_VALUE;
		double somaFatur = 0;
		int diasFatur = 0;

		for (FaturamentoDia dia : faturMensal) {
			if (dia.valor > 0) {

				if (dia.valor < menorFatur) {
					menorFatur = dia.valor;
				}

				if (dia.valor > maiorFatur) {
					maiorFatur = dia.valor;
				}

				somaFatur += dia.valor;
				diasFatur++;
			}
		}

		double mediaFatur = somaFatur / diasFatur;

		int diasAcimaMedia = 0;
		for (FaturamentoDia dia : faturMensal) {
			if (dia.valor > mediaFatur) {
				diasAcimaMedia++;
			}

		}
		System.out.println("Menor faturamento: " + menorFatur);
		System.out.println("Maior faturamento: " + maiorFatur);
		System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);

	}

	private static List<FaturamentoDia> carregarFatur(String arquivo) {
		try (FileReader reader = new FileReader(arquivo)) {
			Gson gson = new Gson(); 
			Type listType = new TypeToken<ArrayList<FaturamentoDia>>() {}.getType();
			return gson.fromJson(reader, listType);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
