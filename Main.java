import java.util.Objects;
import java.util.Scanner;

public class Main {



    static boolean isTurnOn() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Дома ли хозяева?" + "" + ':');
        String isOwnersHere = scr.next();
        if (isOwnersHere.equals("да")) {
            return true;
        }
        return false;
    }

    static boolean isJalousieOpen() {
        Scanner in = new Scanner(System.in);

        System.out.println("Были ли подняты шторы? " + "" + ':');
        String openClose = in.next();

        if (openClose.equals("да")) {
            return true;
        }
        return false;


    }

    public static void main(String[] args) {

        //ввод с клавиатуры
        Scanner scanner = new Scanner(System.in);
        //текущее время
        System.out.println("Сколько сейчас время?" + "" + ':');
        int realTime = scanner.nextInt();
        // текщий день недели
        System.out.println("Сегодня будний или выходной?"+ "" + ':');
        String dayOfWeek = scanner.next();
        //Включена ли сигнализация бул


        //"Умный дом" должен реализовать следующие сценарии:
        //1) В будний день в 8ч поднять шторы, если хозяева дома (сигнализация отключена)
        //2) В выходной день в 11ч поднять шторы, если хозяева дома
        //3) В будний день в 20ч вечера включить чайник, если хозяев нет дома


        if (realTime == 8 && dayOfWeek.equals("будний") && isTurnOn() == true) {
            System.out.println("Шторы во всем доме будут подняты,Доброе утро!");
        }
        if (realTime == 11 && dayOfWeek.equals("выходной") && isTurnOn() == true){
            System.out.println("Шторы будут подняты, хороших выходных");
        }


        if ( realTime == 20 && dayOfWeek.equals("будний") && isTurnOn() == false) {
            System.out.println("Чайник будет включен");
        }
       //4) В будний день в 23ч опустить шторы, если шторы были подняты
        //Выполнение действия обозначать выводом соответствующего сообщения на экран.

        if ( realTime == 23 && dayOfWeek.equals("будний") && isJalousieOpen() == true) {
            System.out.println("Шторы будут пущены");
        }
        if (realTime == 23 && dayOfWeek.equals("будний") && isJalousieOpen() == false) {
            System.out.println("Шторы остоются закрытыми");

        }

    }
}