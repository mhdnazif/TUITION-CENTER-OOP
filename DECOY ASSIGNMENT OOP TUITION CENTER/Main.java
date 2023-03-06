import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HeadMaster headMaster = new HeadMaster("John Smith", "123-456-7890");
        TuitionCenter tuitionCenter = new TuitionCenter("123 Main St", headMaster);

        Tutor tutor1 = new Tutor("Alice Smith", "1234567890", "456 Maple St", "PhD in Mathematics", 5, "2020-01-01", 2);
        Tutor tutor2 = new Tutor("Bob Johnson", "0987654321", "789 Oak St", "Masters in English", 10, "2010-01-01", 5);
        tuitionCenter.addTutor(tutor1);
        tuitionCenter.addTutor(tutor2);

        ArrayList<Integer> scores1 = new ArrayList<Integer>();
        scores1.add(90);
        scores1.add(85);
        scores1.add(95);
        Student student1 = new Student("Jane Doe", "4567890123", "789 Elm St", 10, "ABC School", scores1);
        ArrayList<Integer> scores2 = new ArrayList<Integer>();
        scores2.add(80);
        scores2.add(75);
        scores2.add(70);
        Student student2 = new Student("John Smith", "0123456789", "123 Oak St", 10, "XYZ School", scores2);
        tuitionCenter.addStudent(student1);
        tuitionCenter.addStudent(student2);

        Report report = tuitionCenter.generateReport();
        System.out.println("Number of students: " + report.getNumStudents());
        System.out.println("Number of tutors: " + report.getNumTutors());
        System.out.println("Average marks: " + report.getAverageMarks());
        System.out.println("Minimum marks: " + report.getMinMarks());
        System.out.println("Maximum marks: " + report.getMaxMarks());
        System.out.println("Tutor backgrounds: " + report.getTutorBackgrounds());
    }
}
