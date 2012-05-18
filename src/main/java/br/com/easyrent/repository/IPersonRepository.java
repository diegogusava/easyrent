package br.com.easyrent.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.easyrent.domain.Advertising;

@Repository
public interface IPersonRepository extends CrudRepository<Advertising, String>{

}
