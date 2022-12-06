package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxMovementSpeed; //скорость пердвижения
    private String refill;
    public abstract void refill();

    public String validateStringParameters(String value){
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }
    public int validateNumParameters(int value){
        return value == 0 ? 0 : Math.abs(value);
    }


    public Transport(String brand, String model, int productionYear, String country, String color, int maxSpeed, String refill) {
        this.brand = validateStringParameters(brand);
        this.model = validateStringParameters(model);
        this.productionYear = validateNumParameters(productionYear);
        this.productionCountry = validateStringParameters(country);
        this.color = validateStringParameters(color);
        this.maxMovementSpeed = validateNumParameters(maxSpeed);
        this.refill = validateStringParameters(refill);

    }
    public Transport(String brand, String model, int yearOfRelease, String country, int maxSpeed, String refill){
        this(brand, model, yearOfRelease, country, "",  maxSpeed, refill);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }
    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed <= 0) {
            this.maxMovementSpeed = 200;
        } else {
            this.maxMovementSpeed = maxMovementSpeed;
        }
    }
    public String getRefill() {
        return refill;
    }
}