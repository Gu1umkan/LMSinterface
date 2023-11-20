import java.time.LocalDate;

public class Student implements Study{
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentEductionCenter() {
        System.out.println( name + " is studying at  " + educationCenter.name+".");
    }

    @Override
    public void getStudentStudyingYear() {
        int yearsOfStudy = LocalDate.now().getYear() - dateOfStart.getYear();
        System.out.println(name + "  has been studying for " + yearsOfStudy + " years.");

    }
}
