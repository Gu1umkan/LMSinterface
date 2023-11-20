import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Gulumkan", "Uson kyzy", "female", LocalDate.of(2020, 9, 16),
                        new University("Kyrgyz-Turkish \"Manas\" University", "Kyrgyzstan", LocalDate.of(1995, 9, 30))),
                new Student("Akbermet", "Ashiralieva", "female", LocalDate.of(2020, 9, 1),
                        new University("Osh State University", "Kyrgyzstan", LocalDate.of(1976, 8, 31))),
                new Student("Zarina", "Akmatova", "female", LocalDate.of(2021, 9, 5),
                        new College("Ardingly Gollege", "UK", LocalDate.of(1920, 2, 23))),
                new Student("Aiturgan", "Turdalieva", "female", LocalDate.of(2022, 9, 12),
                        new College("Cembridge Tutors College", "UK", LocalDate.of(1890, 12, 26))),
                new Student("Islam", "Arstanaliev", "male", LocalDate.of(2019, 9, 12),
                        new School("Semetey High School", "Kyrgyzstan", LocalDate.of(2000, 12, 12))),
                new Student("Davron", "Taylakov", "male", LocalDate.of(2021, 9, 16),
                        new School("Manas High School", "Turkish", LocalDate.of(2000, 9, 12))),
                new Student("Bekturgan", "Abdykadyrov", "male", LocalDate.of(2020, 9, 1),
                        new School("Sema High School", "Turkish", LocalDate.of(2010, 10, 12))),
                new Student("Aydar", "Kerimbaev", "male", LocalDate.of(2022, 9, 2),
                        new College("Manas College", "Turkish", LocalDate.of(2017, 11, 1))),
                new Student("Mirlan", "Arstanbekov", "male", LocalDate.of(2020, 9, 16),
                        new University("Ala-Too University", "Kyryzsatn", LocalDate.of(2000, 10, 7))),
                new Student("Nurmuhammed", "Medetov", "male", LocalDate.of(2021, 9, 1),
                        new College("Razzakov College", "China", LocalDate.of(1999, 8, 28)))
        };
        displayAllStudentInfo(students);
    }

    public static void displayAllStudentInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.print("*********************************************************\n" + (i + 1) + ". ");
            students[i].getStudentEductionCenter();
            students[i].getStudentStudyingYear();
        }
    }
}