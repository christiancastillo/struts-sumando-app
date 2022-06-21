package com.entity;

/**
 * Bean para el ejemplo de struts => representa un usuario
 * @author Carlos Garc�a. Autentia.
 * @see http://www.mobiletest.es
 */
public class UserEntity {
	private String login;	// C�digo del usuario
	private String email;	// Direcci�n de correo
	private byte   age;		// Edad
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
}