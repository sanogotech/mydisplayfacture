package com.macrosoft;

import java.io.FileNotFoundException;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

@SpringBootApplication
public class MyApplication {
	
	private  final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	
	@Autowired
	private ElasticsearchOperations esOps;
	
	//@Autowired
	//private FactureClientRepository factureClientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}
	
	
	
	
	@PostConstruct
	public void buildIndex() throws FileNotFoundException {
		
		//esOps.indexOps(FactureClient.class).refresh();

		//factureClientRepository.saveAll(alllistFactureClientPDF);
		
	}

	
			
}
