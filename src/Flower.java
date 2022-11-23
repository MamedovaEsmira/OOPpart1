public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;


    public Flower(String flowerColor, String country, double cost,int lifeSpan) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty()) {
            this.country = "России";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
           this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor,country,cost,3);
    }

    public String getFlowerColor () {
            return flowerColor;
        }
        public void setFlowerColor (String flowerColor){
            if (flowerColor == null || flowerColor.isEmpty()) {
                this.flowerColor = "белый";
            } else {
                this.flowerColor = flowerColor;
            }
        }
        public String getCoutry () {
            return country;
        }
        public void setCoutry (String coutry){
            if (coutry == null || coutry.isEmpty()) {
                this.country = "России";
            } else {
                this.country = coutry;
            }
        }
        public double getCost () {
            return cost;
        }
        public void setCost ( double cost){
            if (cost != 0 || cost < 0) {
                this.cost = 1;
            } else {
                this.cost = cost;
            }
        }
    @Override
    public String toString() {
        return String.format("%s, страна %s, цена %.2f рублей, %d дня/дней стояния.", flowerColor,
                country, cost, lifeSpan);
    }
    }