package animals;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 3, "степь", 25, "трава");
        Herbivores giraffe = new Herbivores("Жираф", 20, "саванна", 18, "трава");
        Herbivores horse = new Herbivores("Лошадь", 9, "степь", 40, "овощи, трава");

        Predators hyena = new Predators("Гиена", 8, "степь", 45, "падаль");
        Predators tiger = new Predators("Тигр", 15, "тайга", 70, "мясо");
        Predators bear = new Predators("Медведь", 21, "тундра", 35, "мясо, ягоды, сладости");

        Amphibians frog = new Amphibians("Лягушка", 2, "болото");
        Amphibians snakeFreshwater = new Amphibians("Уж пресноводный", 5, "пресная вода");

        Flightless peacock = new Flightless("Павлин", 12, "джунгли", "бег");
        Flightless penguin = new Flightless("Пингвин", 4, "вечная мерзлота", "прыжки");
        Flightless birdDodo = new Flightless("Птица Додо", 9, "джунгли", "ходьба");

        Flying gull = new Flying("Чайка",3,"побережье","летает");
        Flying albatross = new Flying("Альбатрос", 14, "острова","летает");
        Flying falcon = new Flying("Сокол", 5, "везде","летает");


        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        conclusionAnimal();
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        conclusionAnimal();
        System.out.println(frog);
        System.out.println(snakeFreshwater);
        conclusionAnimal();
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(birdDodo);
        conclusionAnimal();
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        conclusionAnimal();

        System.out.println("Проверка на совпадение объектов.");
        System.out.println(giraffe.equals(gazelle));
        System.out.println(giraffe.equals(horse));
        System.out.println(gazelle.equals(horse));


    }
    public static void conclusionAnimal(){
        System.out.println("===================");
    }
}
