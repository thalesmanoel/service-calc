package thales.carrion.calculoservico.entities;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String password;
	
	@CreationTimestamp
	private Instant creationTimestamp;
	@UpdateTimestamp
	private Instant updateTimestamp;
	
	public User() {}
	
	public User(Long id, String username, String email, String password, Instant creationTimestamp, Instant updateTimestamp) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.creationTimestamp = creationTimestamp;
		this.updateTimestamp = updateTimestamp;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Instant getCreationTimestamp() {
		return creationTimestamp;
	}

	public Instant getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCreationTimestamp(Instant creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public void setUpdateTimestamp(Instant updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
