package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String title, @JsonAlias("Year")String year,@JsonAlias("imdbRating")  String imdbRating, @JsonAlias("totalSeasons") Integer totalSeasons) {

}
