package io.github.abudhar.spring_annotation;

import java.util.List;
import java.util.Map;

public class Security {
	private String user;
	private String password;
	private List<String> roles;
	private boolean enabled;
	private Map<String, Boolean> permission;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Map<String, Boolean> getPermission() {
		return permission;
	}

	public void setPermission(Map<String, Boolean> permission) {
		this.permission = permission;
	}
}
