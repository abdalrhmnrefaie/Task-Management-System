package banquemisr.challenge05.controller;

import banquemisr.challenge05.model.User;
import banquemisr.challenge05.service.UserService;
import banquemisr.challenge05.util.AuthenticationUser;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAll(Authentication authentication) {
        System.out.println("AUTHENTICATED_USER: " + AuthenticationUser.get(authentication));
        return ResponseEntity.ok().body(userService.getAll());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<User> getById(@PathVariable Long id, Authentication authentication) {
        System.out.println("AUTHENTICATED_USER: " + AuthenticationUser.get(authentication));
        return ResponseEntity.ok().body(userService.getById(id));
    }

    @GetMapping("/test")
    @PreAuthorize("hasRole('ROLE_CUSTOMER')")
    public ResponseEntity<User> getById(@RequestParam(required = true) String email, Authentication authentication) {
        System.out.println("AUTHENTICATED_USER: " + AuthenticationUser.get(authentication));
        return ResponseEntity.ok().body(userService.getByEmail(email));
    }
}
