package thales.carrion.calculoservico.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtUtils {

	@Value("${projeto.jwtSecret}")
	private String jwtSecret;
	
	@Value("${projeto.jwtExpirationMs")
	private String jwtExpirationMs;
	
	public String generateTokenFromUserDetailsImpl(UserDetailsImpl userData) {
		
	}
}
