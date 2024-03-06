public class Stud {
    String name = "Ranjita.H.Illur";
    String department = "BCA";
    String program = "BCA";
    public String RegistertedCourse[] = { " ", "C#", "Applied statistics", "Java" };

    public void display() {
        System.out.println("----Student Details----");
        System.out.println("Name:" + name);
        System.out.println("Department: " + department);
        System.out.println("Program:" + program);
        System.out.print("Registered Courses:\n");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ":" + RegistertedCourse[i]);
        }
    }

    public static void main(String[] args) {
        Stud s = new Stud();
        s.display();

    }
}