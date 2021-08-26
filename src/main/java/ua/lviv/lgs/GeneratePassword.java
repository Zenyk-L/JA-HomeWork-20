package ua.lviv.lgs;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
	
	public static String encodePassword(String password) {
	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String hashedPassword = passwordEncoder.encode(password);
	    return hashedPassword;
	} 

	public static void main(String[] args) {
		String pass = "admin";
		System.out.println(encodePassword(pass));
	}
}
