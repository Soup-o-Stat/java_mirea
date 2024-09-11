import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        //дефолт
        Car car_1 = new Car();
        car_1.To_String();
        car_1.Print_age();

        //пример
        Car car_2 = new Car("haval", "red", "xddd", 2005);
        car_2.To_String();
        car_2.Print_age();

        //выбор
        //модель
        Car car_3 = new Car("haval", "model");
        car_3.To_String();
        //цвет
        Car car_4=new Car("super red", "color");
        car_4.To_String();
        //лицензия
        Car car_5=new Car("from rutracker.org", "license");
        car_5.To_String();
        //год
        Car car_6=new Car("2014", "year");
        car_6.To_String();
        car_6.Print_age();
    }
}