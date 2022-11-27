package human;

public class Human {
    private    int yearOfBirth;
    public String name;
    private    String town;
    public String jobTitle;
    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth() {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown() {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
    public static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + " Я из города " + human.getTown() + " Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.jobTitle + ". Будем знакомы!");
    }
}

