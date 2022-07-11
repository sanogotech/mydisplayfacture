/**
 * 
 */
package com.macrosoft.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.macrosoft.model.FactureClient;





/**
 * 
 * @author SOULEYSANOGO
 *
 */
@Repository
public interface FactureClientRepository extends ElasticsearchRepository<FactureClient, String> {
    
	// https://docs.spring.io/spring-data/elasticsearch/docs/1.0.0.M1/reference/html/elasticsearch.repositories.html
	
	List<FactureClient> findAll();
	   
	List<FactureClient> findByDrName(String drName);
    
    List<FactureClient> findByDrNameContaining(String drName);
 
    List<FactureClient> findByNomPrenom(String nomPrenom);
    
    List<FactureClient> findByRefContratIdentifiant(Integer refContratIdentifiant);

}
