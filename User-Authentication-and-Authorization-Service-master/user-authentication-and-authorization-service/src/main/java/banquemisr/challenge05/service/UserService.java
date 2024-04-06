package banquemisr.challenge05.service;

import banquemisr.challenge05.dto.UserDto;
import banquemisr.challenge05.model.User;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User getById(Long id);
    public User getByEmail(String email);
    public User getByEmailOrNull(String email);
    public User save(User user);
}
