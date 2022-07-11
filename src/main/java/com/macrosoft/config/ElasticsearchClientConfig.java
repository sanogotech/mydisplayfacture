/**
 * 
 */
package com.macrosoft.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


/***
 * 
 * @author SOULEYSANOGO
 *
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.macrosoft.repository")
@ComponentScan(basePackages = { "com.macrosoft" })
public class ElasticsearchClientConfig extends AbstractElasticsearchConfiguration {
	
	
	@Value(value="${saphir.indexElasticSearchIP}")
	public  String saphirIndexElasticSearchIP;
	
	@Value(value="${saphir.indexElasticSearchPort}")
	public  int saphirIndexElasticSearchPort;
	
	@Value(value="${saphir.elasticSearchClientSocketTimeout}")
	public  int saphirElasticSearchSocketTimeout;
	
	@Value(value="${saphir.elasticSearchClientConnectTimeout}")
	public  int saphirElasticSearchConnectTimeout;

	@Override
	@Bean
	public RestHighLevelClient elasticsearchClient() {
		

		
		String saphirIndexElasticSearchUrl = saphirIndexElasticSearchIP + ":"+ saphirIndexElasticSearchPort;

		final ClientConfiguration clientConfiguration = 
				ClientConfiguration
				.builder()
				.connectedTo(saphirIndexElasticSearchUrl)
				.withSocketTimeout(saphirElasticSearchSocketTimeout)
				.withConnectTimeout(saphirElasticSearchConnectTimeout )
				.build();

		return RestClients
				.create(clientConfiguration)
				.rest();
	}
	

}
