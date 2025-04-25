package ru.rusguardian;

import org.jsoup.Jsoup;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ссылку на html страницу.");
        System.out.println("url:");
        String url = sc.nextLine();



        try {
            var document = Jsoup.connect(url).get();
            var links = document.select("a");
            for (var element: links) {
                System.out.println(element.attr("href"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}