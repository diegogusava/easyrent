package br.com.easyrent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.easyrent.domain.User;
import br.com.easyrent.repository.IUserRepository;

@Service
public class UserService {
	
	@Autowired
	private IUserRepository repository;
	
	public void save(User user){
		repository.save(user);
	}
	
}
