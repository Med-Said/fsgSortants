	package fsgSortants.beans;

public class Visiteur {
	private int tel;
	private String nom;
	private String mail;
	private String message;
	
	
	public Visiteur() {
		super();
	}


	public Visiteur(int tel, String nom, String mail, String message) {
		super();
		this.tel = tel;
		this.nom = nom;
		this.mail = mail;
		this.message = message;
	}


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
