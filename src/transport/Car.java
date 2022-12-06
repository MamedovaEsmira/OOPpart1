package transport;
import java.util.Objects;

public class Car extends Transport {
    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;
    private static Key key;
    private static Insurance insurance;

 public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxMovementSpeed, float engineVolume, String transmission,
            String bodyType, String registrationNumber, int numberOfSeats, boolean summerTyres, String refill) {
     super(brand, model, productionYear, productionCountry, color, maxMovementSpeed, refill);
     this.engineVolume = validateFloatParameters(engineVolume);
     this.transmission = validateStringParameters(transmission);
     this.bodyType = validateStringParameters(bodyType);
     this.registrationNumber = validateStringParameters(registrationNumber);
     this.numberOfSeats = validateNumParameters(numberOfSeats);
     this.summerTyres = summerTyres;

 }

    public float validateFloatParameters(float value) {
        return value == 0f ? 1.5f : Math.abs(value);
    }
    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public static Key getKey() {
        return key;
    }

    public static void setKey(Key key) {
        Car.key = key;
    }

    public static Insurance getInsurance() {
        return insurance;
    }

    public static void setInsurance(Insurance insurance) {
        Car.insurance = insurance;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }


    public class Key {
        private final String distanceStartEngine;
        private final String keylessEntry;

        public Key(String distanceStartEngine, String keylessEntry) {
            if (distanceStartEngine == null || distanceStartEngine.isEmpty()) {
                this.distanceStartEngine = "default";
            } else {
                this.distanceStartEngine = distanceStartEngine;
            }
            if (keylessEntry == null || keylessEntry.isEmpty()) {
                this.keylessEntry = "default";
            } else {
                this.keylessEntry = keylessEntry;
            }
        }

        public String getDistanceStartEngine() {
            return distanceStartEngine;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }
    }

    public class Insurance {
        private final float periodInsurance;
        private final float costInsurance;
        private final String numberInsurance;

        public Insurance(float periodInsurance, float costInsurance, String numberInsurance) {
            this.periodInsurance = periodInsurance;
            if (costInsurance > 0) {
                this.costInsurance = 10250.43f;
            } else {
                this.costInsurance = costInsurance;
            }
            if (numberInsurance != null) {
                this.numberInsurance = numberInsurance;
            } else {
                this.numberInsurance = "default";
            }
        }

        public float getPeriodInsurance() {
            return periodInsurance;
        }

        public float getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public void isValidInsurance() {
            if (periodInsurance == 0 || periodInsurance < 0) {
                System.out.println("Ваш страховой полис закончился. Необходимо срочно оформить новый полис!");
            } else {
                System.out.println("Срок действия вашего страхового полиса: " + periodInsurance);
            }
        }

        public void isValidNumberInsurance() {
            if (numberInsurance.length() == 9) {
                System.out.println("Номер вашего страхового полиса: " + numberInsurance);
            } else {
                System.out.println("Номер страхового полиса некорректный");
            }
        }
    }
    public static void printCar() {
        System.out.println(" ");

    }
    @Override
    public void refill() {
        if (super.getRefill().equals("benzine")) {
            System.out.println("Заправляем автомобиль " + getBrand() + " " + getModel() + " бензином.");
        } else if (super.getRefill().equals("diesel")) {
            System.out.println("Заправляем автомобиль " + getBrand() + " " + getModel() + "  дизельным топливом.");
        } else if (super.getRefill().equals("electro")) {
            System.out.println("Заправляем автомобиль " + getBrand() + " " + getModel() + " на электрозаправке.");
        } else {
            System.out.println("Выберите правильную заправку");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && numberOfSeats == car.numberOfSeats && summerTyres == car.summerTyres && transmission.equals(car.transmission) && bodyType.equals(car.bodyType) && registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, transmission, bodyType, registrationNumber, numberOfSeats, summerTyres);
    }
    @Override
    public String toString() {
        return "Автомобиль: Марка: " + super.getBrand() + ", модель: " + super.getModel() + ", объем двигателя: " + engineVolume + ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType + ", количество мест " + numberOfSeats + ", цвет: " + super.getColor() + ",\n регистрационный номер " + registrationNumber +
                ", год выпуска: " + super.getProductionYear() + ", страна сборки: " + super.getProductionCountry() + ", резина летняя: " + summerTyres + ", максимальная скорость " + getMaxMovementSpeed() + " км/ч.";
    }
}








