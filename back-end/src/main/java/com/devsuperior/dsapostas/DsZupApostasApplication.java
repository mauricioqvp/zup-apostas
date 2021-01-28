package com.devsuperior.dsapostas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.dsapostas.entities.Apostas;
import com.devsuperior.dsapostas.entities.Players;
import com.devsuperior.dsapostas.repositories.ApostasRepository;
import com.devsuperior.dsapostas.repositories.PlayersRepository;

@SpringBootApplication
public class DsZupApostasApplication implements CommandLineRunner {

	@Autowired
	private PlayersRepository playersRepository;
	@Autowired
	private ApostasRepository apostasRepository;

	public static void main(String[] args)  {
		SpringApplication.run(DsZupApostasApplication.class, args);
	}

		@Override
		public void run(String... args) throws Exception {
			Players p1 = new Players(null,"Maria da Silva","maria@gmail.com");
			Players p2 = new Players(null,"Bob Marlei","bob@gmail.com");
			Players p3 = new Players(null,"Carla Soares","carla@yahoo.com.br");
			
			Apostas ap1 = new Apostas(null,7,13,22,37,56);
			Apostas ap2 = new Apostas(null,8,14,23,38,57);
			
			p2.getAposta().addAll(Arrays.asList(ap1,ap2));
			//ap1.getPlayer().addAll(Arrays.asList(p1));
			 
			playersRepository.saveAll(Arrays.asList(p1,p2,p3));
			apostasRepository.saveAll(Arrays.asList(ap1));
			
		}
}