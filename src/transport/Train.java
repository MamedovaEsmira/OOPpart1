package transport;
import java.util.Objects;

public class Train extends Transport {
    private float priceOfTheTrip;      //Цена поездки
    private final float timeRideHour;  //Время поездки
    private final String startStation; //Название станции отбытия
    private final String finalStation;  //Конечная остановка
    private int countWagons;            //Количество вагонов

    public float validateTimeRide(float value) {
        return value <= 0 ? 1 : Math.abs(value);
    }

    public float validateCostRide(float value) {
        return value <= 0 ? 100 : Math.abs(value);
    }



    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxMovementSpeed, String refill, float costRide,
                 float timeRideHour, String startStation, String finalStation, int countWagons) {
        super(brand, model, productionYear, productionCountry, color, maxMovementSpeed, refill);
        this.priceOfTheTrip = validateCostRide(priceOfTheTrip);
        this.timeRideHour = validateTimeRide(timeRideHour);
        this.startStation = validateStringParameters(startStation);
        this.finalStation = validateStringParameters(finalStation);
        this.countWagons = validateNumParameters(countWagons);
    }

    public Train(String brand, String model, int productionYear, String productionCountry, int maxMovementSpeed, String refill,
                 String startStation, String finalStation, int countWagons) {
        super(brand, model, productionYear, productionCountry, maxMovementSpeed, refill);
        this.timeRideHour = 0;
        this.startStation = validateStringParameters(startStation);
        this.finalStation = validateStringParameters(finalStation);
        this.countWagons = validateNumParameters(countWagons);

    }
    public float getpriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setpriceOfTheTrip(float priceOfTheTrip) {
        this.priceOfTheTrip = priceOfTheTrip;
    }

    public float getTimeRideHour() {
        return timeRideHour;
    }

    public String getStartStation() {
        return startStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }
    @Override
    public void refill() {
        if (super.getRefill().equals("diesel")) {
            System.out.println("Заправляем поезд " + getBrand() + " " + getModel() + " дизельным топливом.");
        } else {
            System.out.println("Выберите правильную заправку");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Float.compare(train.priceOfTheTrip, priceOfTheTrip) == 0 && Float.compare(train.timeRideHour, timeRideHour) == 0 && countWagons == train.countWagons && startStation.equals(train.startStation) && finalStation.equals(train.finalStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceOfTheTrip, timeRideHour, startStation, finalStation, countWagons);
    }
@Override
    public String toString() {
        return "ПОЕЗД: Марка: " + super.getBrand() + ", модель: " + super.getModel() + ", количество вагонов: " + getCountWagons() + ", станция отправления: " + getStartStation() +
                ", станция прибытия: " + getFinalStation() + ", количество вагонов " + getCountWagons() + ",\n год выпуска: " + super.getProductionYear() +
                ", страна сборки: " + super.getProductionCountry() + ", тип топлива: " + getRefill() + ", максимальная скорость " + getMaxMovementSpeed() + " км/ч.";
    }
}