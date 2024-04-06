package banquemisr.challenge05.service;

import banquemisr.challenge05.dto.LoginRequest;
import banquemisr.challenge05.dto.LoginResponse;

public interface LoginService {
    public LoginResponse login(LoginRequest loginRequest);
}
