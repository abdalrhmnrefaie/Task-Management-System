package banquemisr.challenge05.service;

import banquemisr.challenge05.dto.SignupRequest;
import banquemisr.challenge05.dto.UserDto;
import banquemisr.challenge05.model.User;

import org.springframework.stereotype.Service;

@Service
public interface SignupService {
    public User signup(SignupRequest signupRequest);
}
