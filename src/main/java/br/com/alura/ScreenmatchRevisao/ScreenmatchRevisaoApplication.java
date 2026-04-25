package br.com.alura.ScreenmatchRevisao;

import br.com.alura.ScreenmatchRevisao.model.DadosSerie;
import br.com.alura.ScreenmatchRevisao.service.ConsumoAPI;
import br.com.alura.ScreenmatchRevisao.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchRevisaoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchRevisaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=7664961b");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
