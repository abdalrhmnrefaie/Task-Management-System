package banquemisr.challenge05.dto;

import banquemisr.challenge05.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private User user;
    private String accessToken;
    private String refreshToken;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public LoginResponse(User user, String accessToken, String refreshToken) {
		super();
		this.user = user;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}
	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
