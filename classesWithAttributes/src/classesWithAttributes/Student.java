package classesWithAttributes;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int classNumber;
	private String phoneNumber;
	private String code;
	
	public Student(int id,String firstName,String lastName,String identityNumber,int classNumber,String phoneNumber) {
		this.id=id;
		this.classNumber=classNumber;
		this.firstName=firstName;
		this.lastName=lastName;
		this.identityNumber=identityNumber;
		this.phoneNumber=phoneNumber;
	}
	
	public Student() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCode() {
		return this.firstName.substring(0, 1) + this.id;
	}
}
