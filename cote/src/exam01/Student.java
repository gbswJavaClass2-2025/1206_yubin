package exam01;

public class Student {
	private String name;
	private String email;
	private String id;
	
	public Student() {}
	public Student(String name, String email, String id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	public String information() {
		return name + " " + email + " " + id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	} 
}