package banquemisr.challenge05.util;

import banquemisr.challenge05.dto.CustomUser;
import banquemisr.challenge05.model.User;

import org.springframework.security.core.Authentication;

public class AuthenticationUser {
    private static Authentication authentication;

    public static User get(Authentication authentication) {
        return ((CustomUser) authentication.getPrincipal()).getUser();
    }
}
