package com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.model.User;
import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.repository.UserRepository;
import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.security.MyUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(userName);

		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}

		return new MyUserDetails(user);
	}
}
