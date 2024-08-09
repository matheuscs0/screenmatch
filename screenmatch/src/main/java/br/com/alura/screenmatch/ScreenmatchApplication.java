package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumeAPI;
import br.com.alura.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world");
		var consume = new ConsumeAPI();
		var json = consume.obterDados("https://www.omdbapi.com/?t=the+sixth+Sense&apikey=a554d3f6&");
		System.out.println(json);
		ConverterDados converte = new ConverterDados();
		DadosSerie dados = converte.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
