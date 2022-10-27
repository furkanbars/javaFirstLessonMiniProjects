package classesWithAttributes;

public class StudentManager {
	public void add(Student student) {
		//veri tabanı ekleme işlemi
		System.out.println("Öğrenci eklendi: "+student.getFirstName()+" "+student.getLastName());
	}

	public void remove(Student student) {
		System.out.println("Öğrenci silindi: "+student.getFirstName()+" "+student.getLastName());
	}

	public void update(Student student) {
		System.out.println("Öğrenci güncellendi: "+student.getFirstName()+" "+student.getLastName());
	}
	public String getCode(Student student) {
		return student.getCode();
	}
}
