package Transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;
    private static Key key;
    private static Insurance insurance;

    public Car(String brand, String model, int productionYear,
               String productionCountry, String color, double engineVolume, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean summerTyres,
               Key key,Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (key == null) {
            this.key = new Key();
        }else {
            this.key=key;
        }
       if (insurance == null) {
            this.insurance=new Insurance();
        }else {
            this.insurance=insurance;
        }
        this.numberOfSeats = numberOfSeats;
        this.summerTyres = summerTyres;
    }
    public Car(String brand, String model, int productionYear,
               String productionCountry, String color, double engineVolume) {
        this(
                brand,
                model,
                productionYear,
                productionCountry,
                color,
                engineVolume,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true,
                new Key(),new Insurance());
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
    public String getBodyType() {
        return bodyType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTransmission() {return transmission;
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
    public static class Key {
        private final boolean remoteEngineStart;//удалённый запуск двигателя
        private final boolean keylessAccess;    //бесключевой доступ

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key(){
            this(false,false);
        }
        public boolean isRemoteEngineStart() {return remoteEngineStart;
        }

        public boolean isKeylessAccess() {return keylessAccess;
        }



    }
    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;//период страховки
        private final double costOfInsurance;//стоимость страховки
        private final String numberInsurance; //номер страховки

        public Insurance( LocalDate insuranceValidityPeriod,double costOfInsurance,String numberInsurance) {
            if (insuranceValidityPeriod == null) {
               this.insuranceValidityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
                this.costOfInsurance =costOfInsurance;

            if (numberInsurance == null) {
                this.numberInsurance = "123456789";
            } else {
                this.numberInsurance = numberInsurance;
            }
        }
        public Insurance(){
            this(null,10000,null);
        }
        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }
        public double getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public void insuranceExpirationDate(){
    if (insuranceValidityPeriod.isBefore(LocalDate.now())|| insuranceValidityPeriod.isEqual(LocalDate.now())) {
        System.out.println("Нужно срочно ехать оформлять новую страховку!");
    }
    }
    public void correctNumberInsurance(){
        if (numberInsurance.length()!=9) {
            System.out.println("Номер страховки некорректный!");
        }
    }
}
    }







