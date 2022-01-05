package it.progetto.FIndJobs.model;
import java.util.Vector;

//import javax.lang.model.element.VariableElement;
//import javax.tools.Diagnostic;

/**
 * 
 *
 * @author Leonardo Pescetti
 * @author Claudio Tomaiuolo
 */


public class Lavori {
	
	public long id;
	public String role;
	public String company_name;
	public String company_num_employees;
	public String employment_type;
	public String location;
	public boolean remote;
	public String logo;
	public String url;
	public String text;
	public String date_posted;
	static public Vector<String> keywords;
	public String source;
	
	
	public Lavori() {
		this.id = 0;
		this.role = null;
		this.company_name = null;
		this.company_num_employees = null;
		this.employment_type = null;
		this.location = null;
		this.remote = false;
		this.logo = null;
		this.url = null;
		this.text = null;
		this.date_posted = null;
		this.keywords = null;
		this.source = null;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_num_employees() {
		return company_num_employees;
	}

	public void setCompany_num_employees(String company_num_employees) {
		this.company_num_employees = company_num_employees;
	}

	public String getEmployment_type() {
		return employment_type;
	}

	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDate_posted() {
		return date_posted;
	}

	public void setDate_posted(String date_posted) {
		this.date_posted = date_posted;
	}

	public Vector<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(Vector<String> keywords) {
		this.keywords = keywords;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}


	public boolean isCity(String city) {
		if (this.location==null) {
			return false;
		}
		return location.toLowerCase().contains(city.toLowerCase());
	}
	
	public boolean isLang(String lang) {
		for (int i=0;i<keywords.size();i++) {
			if(keywords.get(i).toLowerCase().contains(lang.toLowerCase())) { return true;	
			}
		}
		if (text.toLowerCase().contains(lang.toLowerCase())) { return true;
		} else { return false;
		}	
	}
	
	static String GetAllKeywords() {
		String keyw="";
		for(int i=0;i<keywords.size();i++) {
			if(i==keywords.size()-1) {
				keyw=keyw+keywords.get(i);	
			} else { keyw=keyw+keywords.get(i)+", ";
			}	
		}
		return keyw;
	}
		
	
	public String toString() {
		return "{"+"\n"+
				"Id:" + getId() +"\n"+
				"Role:" + getRole() +"\n"+
				"Company name:" + getCompany_name()+"\n"+			
				"Company number of employees:" + getCompany_num_employees() + "\n"+
				"Employment type:"+ getEmployment_type() +"\n"+ 
				"Location:" + getLocation() + "\n"+
				"Remote:" + isRemote()+"\n"+ 
				"Logo:" + getLogo() +"\n"+
				"Url:" + getUrl() + "\n"+
				"Text:" + getText()+"\n"+
				"Date posted:" + getDate_posted() + "\n"+
				"Keywords:" + GetAllKeywords() + "\n"+
				"Source:"+ getSource() + "\n"
				+"}\n";
	}

}
