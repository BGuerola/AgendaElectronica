package model;

public class Contacto {
	String nom;
	String cognom1;
	String cognom2;
	int telf;
	String categoria;
	String subcategoria;
	String descripcio;
	String email;
	String web;
	String linkedin;
	String twitter;
	String localitat;
	String provincia;
	
	public Contacto() {
		super();
	}
	
	public Contacto(String nom, String cognom1, String cognom2, int telf, String categoria, String subcategoria, String descripcio,
			String email, String web, String linkedin, String twitter, String localitat, String provincia) {
		super();
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
		this.telf = telf;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.descripcio = descripcio;
		this.email = email;
		this.web = web;
		this.linkedin = linkedin;
		this.twitter = twitter;
		this.localitat = localitat;
		this.provincia = provincia;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom1() {
		return cognom1;
	}
	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}
	public String getCognom2() {
		return cognom2;
	}
	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}
	public int getTelf() {
		return telf;
	}
	public void setTelf(int telf) {
		this.telf = telf;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String subcategoria) {
		this.categoria = categoria;
	}
	
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = categoria;
	}	
	
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	
	public String getLocalitat() {
		return localitat;
	}
	public void setLocalitat(String localitat) {
		this.localitat = localitat;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Contacto [nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + ", telf=" + telf
				+ ", categoria=" + categoria + ", subcategoria=" + subcategoria + ", descripcio=" + descripcio
				+ ", email=" + email + ", web=" + web + ", linkedin=" + linkedin + ", twitter=" + twitter
				+ ", localitat=" + localitat + ", provincia=" + provincia + "]";
	}



	
	
	
	
	
	

}
