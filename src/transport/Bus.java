package transport;

public class Bus extends Transport {
      public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxMovementSpeed, String refill) {
        super(brand, model,productionYear,productionCountry, color, maxMovementSpeed, refill);
    }
    public  void refill() {
        if (super.getRefill().equals("benzine")) {
            System.out.println("Заправляем автобус " + getBrand() + " " + getModel() + " бензином.");
        } else if (super.getRefill().equals("diesel")) {
            System.out.println("Заправляем автобус " + getBrand() + " " + getModel() + " дизельным топливом.");
        } else {
            System.out.println("Выберите правильную заправку");
        }
    }
    @Override
    public String toString() {
        return "Автобус: Марка: " + getBrand() + ", модель: " + getModel() + ", год выпуска: " + getProductionYear() + ", страна производства: " + getProductionCountry() +
                ", цвет: " + getColor() + ", тип топлива: " + getRefill() + ", максимальная скорость: " + getMaxMovementSpeed()+ "км/ч.";
    }
}

