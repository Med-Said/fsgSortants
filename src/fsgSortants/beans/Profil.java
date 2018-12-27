package fsgSortants.beans;

public class Profil {
	private int tet;
	private String cv;
	private String photo;
	private String niveau;
	private String text;
	
	public Profil() {
		super();
		this.tet = 0;
		this.cv = "";
		this.photo = "";
		this.niveau = "";
		this.text = "";
	}
	
	public Profil(int tet, String cv, String photo, String niveau, String text) {
		super();
		this.tet = tet;
		this.cv = cv;
		this.photo = photo;
		this.niveau = niveau;
		this.text = text;
	}

	public int getTet() {
		return tet;
	}

	public void setTet(int tet) {
		this.tet = tet;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
}
