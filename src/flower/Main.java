package flower;

public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower("Роза обыкновенная ", " Голландии", 35.59f, 0);
        Flower hrizantema = new Flower("Хризантема ", null, 15f, 5);
        Flower pion = new Flower("Пион ", " Англии", 69.9f, 5);
        Flower hypsofila = new Flower("Гипсофила ", " Турция", 19.5f, 10);
        Flower.printInfo1(rosa);
        Flower.printInfo1(hrizantema);
        Flower.printInfo1(pion);
        Flower.printInfo1(hypsofila);
        Flower.printBouquet(rosa, rosa, rosa,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                hypsofila);

    }
}
