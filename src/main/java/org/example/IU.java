package org.example;

import java.util.Scanner;

public class IU {
    public static String nameDB(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static void hello(){
        System.out.println("Вас приветствует небольшое приложение 'Заметки'. Введите название для ваших заметок.\n" +
                "Вы можете ввести 'stop' и приложение закончит работу.");
    }
}
