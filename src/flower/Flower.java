package flower;

public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    public int lifeSpan;


    public Flower(String flowerColor, String country, float cost,int lifeSpan) {
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
            this.cost = 1f;
        } else {
            this.cost = (float) cost;
        }
        if (lifeSpan <= 0) {
           this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerColor, String country, float cost ) {
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
        public float getCost () {
            return cost;
        }
        public void setCost ( float cost){
            if (cost != 0 || cost < 0) {
                this.cost = 1;
            } else {
                this.cost = (float) cost;
            }
        }
    public static void printInfo1(Flower flower) {
        System.out.println(flower.getFlowerColor() + "страна происхождения – " + flower.getCoutry() + ", стоимость штуки –  " + flower.getCost() + " рублей, срок стояния – " + flower.lifeSpan + "дней");
    }
    public static void printBouquet(Flower... flowers) {
        float totalCost = 0;
        int mimimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < mimimumLifeSpan) {
                mimimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
           printInfo1(flower);
        }
        totalCost = totalCost * 1.1f;
        System.out.printf("Букет стоит %.2f рублей. ", totalCost);
        System.out.printf("Дней стояния %d\n", mimimumLifeSpan);

    }
    @Override
    public String toString() {
        return String.format("%s, страна %s, цена %.2f рублей, %d дня/дней стояния.", flowerColor,
                country, cost, lifeSpan);
    }
    }