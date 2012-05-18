package br.com.easyrent.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.easyrent.domain.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Long>{

}
