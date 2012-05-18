package br.com.easyrent.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.easyrent.domain.RealEstate;

@Repository
public interface IRealEstateRepository extends CrudRepository<RealEstate, Long>{

}
