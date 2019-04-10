package appointment.project.application.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Credentials {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	 
	    @Column(nullable = false, unique = true)
	    private String username;
	 
	    private String password;
	    
	    @OneToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "user_id")
	    private User user;
	    
	    private boolean isAccountNonExpired= true;
	    private boolean isAccountNonLocked= true;
	    
	    @ManyToMany(fetch=FetchType.EAGER)
	    @JoinTable( 
	        name = "users_roles", 
	        joinColumns = @JoinColumn(
	          name = "user_id", referencedColumnName = "id"), 
	        inverseJoinColumns = @JoinColumn(
	          name = "role_id", referencedColumnName = "id") ) 
	    private Collection<Role> roles;
	    

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public boolean isAccountNonExpired() {
			return isAccountNonExpired;
		}

		public void setAccountNonExpired(boolean isAccountNonExpired) {
			this.isAccountNonExpired = isAccountNonExpired;
		}

		public boolean isAccountNonLocked() {
			return isAccountNonLocked;
		}

		public void setAccountNonLocked(boolean isAccountNonLocked) {
			this.isAccountNonLocked = isAccountNonLocked;
		}

		public Collection<Role> getRoles() {
			return roles;
		}

		public void setRoles(Collection<Role> roles) {
			this.roles = roles;
		}
		

}
