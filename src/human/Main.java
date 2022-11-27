package human;
import human.Human;
public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Human person1 = new Human(" Максим ", " Минск ", 1988, "бренд-менеджер");
        Human person2 = new Human(" Аня ", " Москва ", 1993, "методист образовательных программ");
        Human person3 = new Human(" Катя ", " Калининград ", 1992, "продакт-менеджер");
        Human person4 = new Human(" Артем ", " Москва ", 1995, "директор по развитию бизнеса");
        Human person5 = new Human(null, null, -1988, null);
        Human person6 = new Human(" Владимир ", " Казань ", currentYear - 21, null);
        Human.printInfo(person1);
        Human.printInfo(person2);
        Human.printInfo(person3);
        Human.printInfo(person4);
        Human.printInfo(person5);
        Human.printInfo(person6);
    }
}

