import java.time.LocalDate;
import java.time.Period;

public class Player implements Players {

    // Attributes:
    private String name;
    private String position;
    private LocalDate dateBirth;
    private String nationality;
    private float height;
    private float weight;

    // Special methods:
    public Player(String name, String position, LocalDate dateBirth, String nationality, float height, float weight) {
        this.name = name;
        this.position = position;
        this.dateBirth = dateBirth;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    // Abstract methods:
    @Override
    public void Status() {
        System.out.println("~~~~~~~~~~");
        System.out.println("Player Status");
        System.out.println("~~~~~~~~~~");
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Date of birth: " + this.dateBirth);
        System.out.println("Nationality: " + this.nationality);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        System.out.println("~~~~~~~~~~");
    }

    @Override
    public void CalculateAge() {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(this.dateBirth, currentDate).getYears();
        System.out.println("Age: " + age);
    }

    @Override
    public void TimeRetire() {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(this.dateBirth, currentDate).getYears();

        if (age >= 40) {
            System.out.println("The player should be retired. Current age: " + age);
        } else if(this.position == "defesa"){
            int yearsUntilRetirement = 40 - age;
            System.out.println("The player has " + yearsUntilRetirement + " years until retirement.");
        } else if(this.position == "meio-campo"){
            int yearsUntilRetirement = 38 - age;
            System.out.println("The player has " + yearsUntilRetirement + " years until retirement.");
        } else{
            int yearsUntilRetirement = 35 - age;
            System.out.println("The player has " + yearsUntilRetirement + " years until retirement.");
    }
        
} 
}
