package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String student1 = "Ali";
		String student2 = "İlker";
		String student3 = "Abdullah";
		String student4 = "İlayda";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("------------------------------");
		
		String[] students = new String[4];
		students[0] = "Ali";
		students[1] = "İlker";
		students[2] = "Abdullah";
		students[3] = "İlayda";
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("------------------------------");
		System.out.println("Foreach");
		System.out.println();
		
		for(String student:students) {
			System.out.println(student);
		}
	}
}
