import transport.Bus;
import transport.Car;
import transport.Train;
import animals.herbivores_1_1_1;
import animals.predators_1_1_2;
import animals.amphibians_1_2;
import animals.flightless_1_3_1;
import animals.flying_1_3_2;

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

     herbivores_1_1_1 gazelle = new herbivores_1_1_1("Газель", 3,"зоопарк", 60,"трава");
     herbivores_1_1_1 giraffe = new herbivores_1_1_1("Жираф", 2,"сафари-парк", 15,"трава");
     herbivores_1_1_1 horse = new herbivores_1_1_1("Лошадь", 1,"поле колосистое", 80,"трава");
     System.out.println(gazelle);
     System.out.println(giraffe);
     System.out.println(horse);

     predators_1_1_2 hyena = new predators_1_1_2("Гиена", 3 , "сафари", 50,"мясо антилоп");
     predators_1_1_2 tiger = new predators_1_1_2("Тигр", 5 , "зоопарк", 75,"мясо");
     predators_1_1_2 bear = new predators_1_1_2("Медведь", 10 , "тайга", 25,"мясо");
     System.out.println(hyena);
     System.out.println(tiger);
     System.out.println(bear);

        amphibians_1_2 frog = new amphibians_1_2("Лягушка", 1, "болото");
        amphibians_1_2 snake = new amphibians_1_2("Уж пресноводный", 2,"лес");
        System.out.println(frog);
        System.out.println(snake);

        flightless_1_3_1 peacock = new flightless_1_3_1("Павлин", 5, "зоопарк","ходьба");
        flightless_1_3_1 penguin = new flightless_1_3_1("Пингвин", 4, "арктика","ходьба");
        flightless_1_3_1 dodo = new flightless_1_3_1("Птица додо", 8, "зоопарк","ходьба");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);


        flying_1_3_2 seagull = new flying_1_3_2("Чайка", 2, "у моря","полёт");
        flying_1_3_2 albatross = new flying_1_3_2("Альбатрос", 4, "у моря","полёт");
        flying_1_3_2 falcon = new flying_1_3_2("Сокол", 10, "лес","полёт");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}