package banquemisr.challenge05.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String password;


	public void setEmail(String email) {
		this.email = email;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequest getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public LoginRequest getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
