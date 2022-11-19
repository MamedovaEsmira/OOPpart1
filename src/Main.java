public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(" Максим ", " Минск ", 1988, "бренд-менеджер");
        Person person2 = new Person(" Аня ", " Москва ", 1993, "методист образовательных программ");
        Person person3 = new Person(" Катя ", " Калининград ", 1992, "продакт-менеджер");
        Person person4 = new Person(" Артем ", " Москва ", 1995, "директор по развитию бизнеса");
        Person person5 = new Person( null ,  null , -1988, null);
        System.out.println("Привет! Меня зовут " + person1.name + " Я из городa " + person1.town + " Я родился в " + person1.yearOfBirth + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person2.name + " Я из городa " + person2.town + " Я родился в " + person2.yearOfBirth + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person3.name + " Я из городa " + person3.town + " Я родился в " + person3.yearOfBirth + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person4.name + " Я из городa " + person4.town + " Я родился в " + person4.yearOfBirth + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person1.name + " Я из города " + person1.town + " Я родился в " + person1.yearOfBirth + " году. Я работаю на должности " + person1.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person2.name + " Я из города " + person2.town + " Я родился в " + person2.yearOfBirth + " году. Я работаю на должности " + person2.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person3.name + " Я из города " + person3.town + " Я родился в " + person3.yearOfBirth + " году. Я работаю на должности " + person3.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person4.name + " Я из города " + person4.town + " Я родился в " + person4.yearOfBirth + " году. Я работаю на должности " + person4.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + person5.name + " Я из города " + person5.town + " Я родился в " + person5.yearOfBirth + " году. Я работаю на должности " + person5.jobTitle + ". Будем знакомы!");


        Car ladaGranta = new Car("Lada", " Granta ", 2015, " России", "желтый", 1.7);
        Car audiA8 = new Car("Audi ", "A8 50 L TDI quattro ", 2020, " Германии", "черный", 3.0);
        Car BMWZ8 = new Car("BMW ", "Z8 ", 2021 , "Германии", "черный", 3.0);
        Car KiaSportage4 = new Car("Kia ", "Sportage", 2018, " Южной Корее", "красный", 2.4);
        Car ladaGranta1 = new Car(null, null, 0, null, null, 0);

        System.out.println(ladaGranta.brand + ladaGranta.model + ladaGranta.productionYear + "  год выпуска, сборка в " + ladaGranta.productionCountry + " , " + ladaGranta.color + " цвет кузова, объем двигателя —  " + ladaGranta.engineVolume + " л");
        System.out.println(audiA8.brand + audiA8.model + audiA8.productionYear + "  год выпуска, сборка в " + audiA8.productionCountry + " , " + audiA8.color + " цвет кузова, объем двигателя —  " + audiA8.engineVolume + " л");
        System.out.println(BMWZ8.brand + BMWZ8.model + BMWZ8.productionYear + "  год выпуска, сборка в " + BMWZ8.productionCountry + " , " + BMWZ8.color + " цвет кузова, объем двигателя —  " + BMWZ8.engineVolume + " л");
        System.out.println(KiaSportage4.brand + KiaSportage4.model + KiaSportage4.productionYear + "  год выпуска, сборка в " + KiaSportage4.productionCountry + " , " + KiaSportage4.color + " цвет кузова, объем двигателя —  " + KiaSportage4.engineVolume + " л");
        System.out.println(ladaGranta1.brand + ladaGranta1.model + ladaGranta1.productionYear + "  год выпуска, сборка в " + ladaGranta1.productionCountry + " , " + ladaGranta1.color + " цвет кузова, объем двигателя —  " + ladaGranta1.engineVolume + " л");

    }

}