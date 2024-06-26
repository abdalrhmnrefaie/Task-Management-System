package banquemisr.challenge05.service.impl;

import banquemisr.challenge05.dto.CustomUser;
import banquemisr.challenge05.exception.ApiError;
import banquemisr.challenge05.model.User;
import banquemisr.challenge05.repository.UserRepository;
import banquemisr.challenge05.service.UserService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> ApiError.badRequest("User not found with id=" + id));
    }

    @Override
    public User getByEmail(String email) {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw ApiError.badRequest("User not found with email=" + email);
        }

        return user;
    }

    @Override
    public User getByEmailOrNull(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getByEmail(username);
        return new CustomUser(user);
    }
}