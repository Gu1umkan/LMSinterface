import java.time.LocalDate;

public abstract class EducationCenter {
    String name;
    String LocatedCountry;
    LocalDate foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.LocatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return
                name +
                        "\n LocatedCountry: " + LocatedCountry +
                        "\n foundationYear: " + foundationYear
                ;
    }
}
