public class Studcourse {
    String course[] = { "c#", "Applied Statiscs", "Java" };
    int marks[] = { 70, 100, 30 };

    public void DisplayMarks() {
        System.out.println("Marks obtained for the courses");
        for (int i = 0; i < 3; i++) {
            System.out.println("Course: " + course[i] + "marks: " + marks[i]);
        }
    }

    public void displaylessthanfourty() {
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 40) {
                System.out.println("Marks obtained less than 40 in " + course[i] + " is:" + marks[i]);
            }
        }
    }
}
