package com.global.book.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.global.book.basic.BasicService;
import com.global.book.entity.Auther;
import com.global.book.error.DaplicateRecoredException;
import com.global.book.repository.AutherRepository;

@Service
public class AutherService extends BasicService<Auther, Long> {

	 Logger logger= LoggerFactory.getLogger(AutherService.class ) ;
	@Autowired
	private AutherRepository autherRepository;



	@Override
	public Auther insert(Auther entity) {
		if (!entity.getEmail().isEmpty() && entity.getEmail() != null) {
			Optional<Auther> auther = findByEmail(entity.getEmail());

			logger.info("author name is {} email is {} ",entity.getName(),entity.getEmail());

			System.out.println("email is :" + entity.getEmail());

			if (auther.isPresent()) {
				logger.error("This email already found with anther author");
				throw new DaplicateRecoredException("This email already found with anther author");
			}

		}
		return super.insert(entity);
	}

	@Override
	public Auther update(Auther entity) {

		Auther auther = findById(entity.getId());
		auther.setName(entity.getName());
		return super.update(auther);
	}

	public Optional<Auther> findByEmail(String email) {

		return autherRepository.findByEmail(email);
	}

}
