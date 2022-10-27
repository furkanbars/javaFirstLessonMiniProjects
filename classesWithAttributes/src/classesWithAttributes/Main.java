package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Abdullah");
		student.setLastName("Barış");
		student.setIdentityNumber("13204692186");
		student.setPhoneNumber("05419031298");
		student.setClassNumber(56);
		
		StudentManager studentManager = new StudentManager();
		studentManager.update(student);
		System.out.println(studentManager.getCode(student));
	}
}
