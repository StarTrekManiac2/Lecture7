package Activity6_studentandteacher;

public class University
{

    public static void main(String[] args)
    {

        // Construct new instances of 'Lecturer' object and set attributes
        Lecturer lecturerA = new Lecturer();
        lecturerA.setLecturer(211, "Personal Tutor");
        Lecturer lecturerB = new Lecturer();
        lecturerB.setLecturer(189, "Head of Department");

        // Construct new instances of 'Student' object and set attributes
        Student studentA = new Student();
        studentA.setStudent(82721, "Computer Science");
        Student studentB = new Student();
        studentB.setStudent(82490, "Business & Management");

        // Output the student and lecturer information
        System.out.println("===============");
        System.out.println("LECTURERS:");
        System.out.println("===============");
        System.out.println("\n");
        lecturerA.getLecturer();
        System.out.println("\n");
        lecturerB.getLecturer();
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("STUDENTS:");
        System.out.println("===============");
        System.out.println("\n");
        studentA.getStudent();
        System.out.println("\n");
        studentB.getStudent();

    }

}
