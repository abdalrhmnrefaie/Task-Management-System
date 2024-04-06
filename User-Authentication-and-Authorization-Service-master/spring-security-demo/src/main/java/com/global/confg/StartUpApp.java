package com.global.confg;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.global.entity.AppUser;
import com.global.entity.Role;
import com.global.service.RoleService;
import com.global.service.UserService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class StartUpApp implements CommandLineRunner {
	@Autowired
	private  UserService userService;
	@Autowired
	private  RoleService roleService;

	@Override
	public void run(String... args) throws Exception {


		if (roleService.findAll().isEmpty()) {			
			roleService.save(new Role(null, "admin"));
			roleService.save(new Role(null, "user"));
			roleService.save(new Role(null, "employee"));
		}
		
		
		if (userService.findAll().isEmpty()) {
			
			Set<Role> adminRoles = new HashSet<>();
			adminRoles.add(roleService.findByName("admin"));
			
			Set<Role> userRoles = new HashSet<>();
			userRoles.add(roleService.findByName("user"));
			
			Set<Role>  empRoles = new HashSet<>();
			empRoles.add(roleService.findByName("employee"));
			
			userService.save(new AppUser(null, "Abdalrhmn Refaie", "abdalrhmn", "123", adminRoles, true, true, true, true));
			
			userService.save(new AppUser(null, "Mohamed Refaie", "mohamed", "123", userRoles, true, true, true, true));
			
			userService.save(new AppUser(null, "Ahmed Refaie", "ahmed", "123", empRoles, true, true, true, true));
		}
		
	}

}
