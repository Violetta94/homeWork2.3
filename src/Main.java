import transport.Bus;
import transport.Car;
import transport.Train;
import animals.Herbivores;
import animals.Predators;
import animals.Amphibians;
import animals.Flightless;
import animals.Flying;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car( "Lada","Granta", 2015, "Russia", "yellow", 200);
        Car audi = new Car("Audi","A8 50 L TDI quattro", 2020, "Germany", "black", 450 );
        Car bmw = new Car("BMW", "Z8", 2021,"Germany", "black", 400);
        Car kia = new Car("Kia","Sportage 4-го поколения",2018,"South Korea","red", 350);
        Car hyundai = new Car("Hyundai","Avante",2016,"South Korea","orange", 300);
        lada.prez();
        lada.refill();

        Train lastochca = new Train("Ласточка", "В-901", 2011,
                "Россия", null, 301, 3500 , 0 , "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019,
                "Россия", null, 270, 1700 , 0 , "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        lastochca.poezd();
        leningrad.poezd();
        lastochca.refill();

        Bus mercedec = new Bus( "Mercedec","Granta", 2015, "Russia", "yellow", 300);
        Bus audiBus = new Bus("Audi","Quattro", 2020, "Germany", "black", 450 );
        Bus bmwBus = new Bus("BMW", "Q8", 2021,"Germany", "black", 400);
        mercedec.busPrez();
        audiBus.busPrez();
        bmwBus.busPrez();
        mercedec.refill();

     Herbivores gazelle = new Herbivores("Газель", 3,"зоопарк", 60,"трава");
     Herbivores giraffe = new Herbivores("Жираф", 2,"сафари-парк", 15,"трава");
     Herbivores horse = new Herbivores("Лошадь", 1,"поле колосистое", 80,"трава");
     System.out.println(gazelle);
     System.out.println(giraffe);
     System.out.println(horse);

     Predators hyena = new Predators("Гиена", 3 , "сафари", 50,"мясо антилоп");
     Predators tiger = new Predators("Тигр", 5 , "зоопарк", 75,"мясо");
     Predators bear = new Predators("Медведь", 10 , "тайга", 25,"мясо");
     System.out.println(hyena);
     System.out.println(tiger);
     System.out.println(bear);

        Amphibians frog = new Amphibians("Лягушка", 1, "болото");
        Amphibians snake = new Amphibians("Уж пресноводный", 2,"лес");
        System.out.println(frog);
        System.out.println(snake);

        Flightless peacock = new Flightless("Павлин", 5, "зоопарк","ходьба");
        Flightless penguin = new Flightless("Пингвин", 4, "арктика","ходьба");
        Flightless dodo = new Flightless("Птица додо", 8, "зоопарк","ходьба");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);


        Flying seagull = new Flying("Чайка", 2, "у моря","полёт");
        Flying albatross = new Flying("Альбатрос", 4, "у моря","полёт");
        Flying falcon = new Flying("Сокол", 10, "лес","полёт");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}