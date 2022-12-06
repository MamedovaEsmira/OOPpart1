package transport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "Желтый", 160,
                1.7f, "механическая", "седан", "а001аа001", 5, false, "benzine");
        Car.Key ladaKey = lada.new Key("no", "no");
        Car.Insurance ladaInsurance = lada.new Insurance(1.6f, 6555.50f, "A200B1001");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 280,
                3.0f, "автоматическая", "седан", "в302nn202", 5, true, "diesel");
        Car.Key audiKey = audi.new Key("yes", "yes");
        Car.Insurance audiInsurance = audi.new Insurance(2.5f, 80750.23f, "B100A01");

        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 320,
                3.0f, "автоматическая", "купе", "0255004s0", 2, true, "benzine");
        Car.Key bmwKey = bmw.new Key("yes", "yes");
        Car.Insurance bmwInsurance = bmw.new Insurance(2f, 35800f, "C3000F102");

        Car kia = new Car("KIA", "Sportage 4", 2018, "Южная Корея", "Красный", 180,
                2.4f, "автоматическая", "кроссовер", "м8520fy84", 7, false, "diesel");
        Car.Key kiaKey = kia.new Key("no", "yes");
        Car.Insurance kiaInsurance = kia.new Insurance(1.5f, 35307.35f, "H5232B001");

        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная корея", "Оранжевый", 180,
                1.6f, "автоматическая", "седан", "о895оо105", 5, false, "benzine");
        Car.Key hyundaiKey = hyundai.new Key("yes", "no");
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(1.2f, 10730.1f, "77B78FA22019");

        System.out.println(lada);
        Car.printCar();
        audi.changeTyres();
        System.out.println(audi);
        Car.printCar();
        System.out.println(bmw);
        Car.printCar();
        System.out.println(kia);
        Car.printCar();
        System.out.println(hyundai);
        Car.printCar();
        System.out.println("Наличие автозапуска у hyundai: " + hyundaiKey.getDistanceStartEngine() + ".");

        Car.printCar();
        bmw.isCorrectRegNumber();
        bmw.isCorrectRegNumber();
        hyundai.isCorrectRegNumber();
        hyundai.isCorrectRegNumber();
        ladaInsurance.isValidInsurance();
        hyundaiInsurance.isValidNumberInsurance();
        bmwInsurance.isValidNumberInsurance();
        Car.printCar();
        System.out.println("=======================================");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", 310,
                "diesel","Белорусский вокзал", "Минск-Пассажирский",11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 250,
                "diesel","Ленинградский вокзал", "Ленинград-Пассажирский",8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        Car.printCar();

        System.out.println("=======================================");

        Bus maz = new Bus("МАЗ","232",2014, "Россия", "Белый", 120, "diesel");
        Bus hyundai1 = new Bus("Hyundai","H350",2014, "Корея", "Синий", 150, "diesel");
        Bus volvo = new Bus("Volvo","9500",2019, "Германия", "Красный", 180, "benzine");
        System.out.println(maz);
        System.out.println(hyundai1);
        System.out.println(volvo);
        Car.printCar();

        lada.refill();
        audi.refill();
        lastochka.refill();
        leningrad.refill();
        maz.refill();
        volvo.refill();
    }
}

