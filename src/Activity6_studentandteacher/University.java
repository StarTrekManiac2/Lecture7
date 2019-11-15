package Activity6_studentandteacher;

public class University
{

    public static void main(String[] args)
    {

        // Construct new instances of 'Staff' object and set attributes
        Lecturer lecturerA = new Lecturer();
        lecturerA.setLecturer("Tom", "Watkins", 49, 211, "Personal Tutor");
        Lecturer lecturerB = new Lecturer();
        lecturerB.setLecturer("Jane", "Allen", 33, 189, "Head of Department");

        // Construct new instances of 'Student' object and set attributes
        Student studentA = new Student();
        studentA.setStudent("Chris", "Hill", 25, 82721, "Computer Science");
        Student studentB = new Student();
        studentB.setStudent("Adam", "Rhodes", 31, 82490, "Business & Management");

        // Output the student and lecturer information
        System.out.println("============================================================");
        System.out.println("LECTURERS:");
        System.out.println("============================================================");
        lecturerA.getLecturer();
        System.out.println("------------------------------");
        lecturerB.getLecturer();
        System.out.println("\n\n");
        System.out.println("============================================================");
        System.out.println("STUDENTS:");
        System.out.println("============================================================");
        studentA.getStudent();
        System.out.println("------------------------------");
        studentB.getStudent();

    }

}
