import Transport.Car;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Human person1 = new Human(" Максим ", " Минск ", 1988, "бренд-менеджер");
        Human person2 = new Human(" Аня ", " Москва ", 1993, "методист образовательных программ");
        Human person3 = new Human(" Катя ", " Калининград ", 1992, "продакт-менеджер");
        Human person4 = new Human(" Артем ", " Москва ", 1995, "директор по развитию бизнеса");
        Human person5 = new Human(null, null, -1988, null);
        Human person6 = new Human(" Владимир ", " Казань ", currentYear - 21, null);
        printInfo(person1);
        printInfo(person2);
        printInfo(person3);
        printInfo(person4);
        printInfo(person5);
        printInfo(person6);

        System.out.println("=======================================");
        Car ladaGranta = new Car("Lada", " Granta ", 2015, " России", "желтый", 1.7, " механика ", "седан ", "k555kk666", 5, true, Car.getKey(), Car.getInsurance());
        Car audiA8 = new Car("Audi ", "A8 50 L TDI quattro ", 2020, " Германии", "черный", 3.0, "автомат ", "хетчбек", "L666LL333", 7, false, Car.getKey(), Car.getInsurance());
        Car BMWZ8 = new Car("BMW ", "Z8 ", 2021, "Германии", "черный", 3.0, " автомат ", " хетчбек", "N444NN888", 7, false, Car.getKey(), Car.getInsurance());
        Car kiaSportage4 = new Car("Kia ", "Sportage 4-го", 2018, " Южной Корее", "красный", 2.4, " автомат ", " хетчбек ", "R777RR777", 5, true, Car.getKey(), Car.getInsurance());
        Car ladaGranta1 = new Car(null, null, 0, null, null, 0, null, null, " N4н4NN5888", 0, false, Car.getKey(), Car.getInsurance());
        printCar(ladaGranta);
        printCar(audiA8);
        printCar(BMWZ8);
        printCar(kiaSportage4);
        printCar(ladaGranta1);

        System.out.println("=========================================");

        Flower rosa = new Flower("Роза обыкновенная ", " Голландии", 35.59, 0);
        Flower hrizantema = new Flower("Хризантема ", null, 15, 5);
        Flower pion = new Flower("Пион ", " Англии", 69.9, 5);
        Flower hypsofila = new Flower("Гипсофила ", " Турция", 19.5, 10);

        printInfo1(rosa);
        printInfo1(hrizantema);
        printInfo1(pion);
        printInfo1(hypsofila);
        printBouquet(rosa, rosa, rosa,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                hypsofila);
    }

    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + " Я из города " + human.getTown() + " Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.jobTitle + ". Будем знакомы!");
    }

    private static void printInfo1(Flower flower) {
        System.out.println(flower.getFlowerColor() + "страна происхождения – " + flower.getCoutry() + ", стоимость штуки –  " + flower.getCost() + " рублей, срок стояния – " + flower.lifeSpan + "дней");
    }

    private static void printBouquet(Flower... flowers) {
        double totalCost = 0;
        int mimimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < mimimumLifeSpan) {
                mimimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo1(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Букет стоит %.2f рублей. ", totalCost);
        System.out.printf("Дней стояния %d\n", mimimumLifeSpan);

    }

    private static void printCar(Car car) {
        System.out.println(car.getBrand() + car.getModel() + car.getProductionYear() +
                "  год выпуска, сборка в " + car.getProductionCountry() + " , "
                + car.getColor() + " цвет кузова, объем двигателя —  "
                + car.getEngineVolume() + " л, коробка передач "
                + car.getTransmission() + ", тип кузова " + car.getBodyType() +
                ", регистрационный номер " + car.isCorrectRegNumber() +
                ", количество мест- " + car.getNumberOfSeats() +
                ", " + (car.isSummerTyres() ? "зимняя" : "летняя") + " резина" +
                ", " + (car.getKey().isKeylessAccess() ? "безключевой доступ" : "ключевой доступ") +
                ", " + (car.getKey().isRemoteEngineStart() ? "удаленный запуск" : "обычный запуск") +
                ", номер страховки " + (car.getInsurance().getNumberInsurance()) +
                ", стоимость страховки " + (car.getInsurance().getCostOfInsurance()) +
                ", срок страховки " + (car.getInsurance().getInsuranceValidityPeriod()));
    }
}

