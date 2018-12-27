package fsgSortants.beans;

public class Sortant {
	private int id;
	private String nom;
	private String specialite;
	private String promotion;
	private String pays;
	private int tel;
	private String dateCreation;
	private String password;
	private String dateNaissance;
	
	public Sortant() {
		super();
	}

	public Sortant(int id, String nom, String specialite, String promotion, String pays, int tel, String dateCreation,
			String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.specialite = specialite;
		this.promotion = promotion;
		this.pays = pays;
		this.tel = tel;
		this.dateCreation = dateCreation;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
}
