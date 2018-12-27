package fsgSortants.beans;

public class Contact {
	private int id;
	private int tel;
	private String dateContact;
	
	
	public Contact() {
		super();
	}


	public Contact(int id, int tel, String dateContact) {
		super();
		this.id = id;
		this.tel = tel;
		this.dateContact = dateContact;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public String getDateContact() {
		return dateContact;
	}


	public void setDateContact(String dateContact) {
		this.dateContact = dateContact;
	}
	
	
	
	
}
