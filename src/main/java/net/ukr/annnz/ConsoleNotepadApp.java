package net.ukr.annnz;

import java.util.Scanner;

class Notepad {
    Scanner sc = new Scanner(System.in);
    int date;

    public void launchApp() {
        data data = new data();
        data.input();
        data.note();
        data.view();
    }

    class data {
        String note[];
        int num;

        public void input() {
            System.out.println("Please, input a date: ");
            date = sc.nextInt();
        }

        public void note() {
            System.out.println("How many notes do You want to write down? ");
            num = sc.nextInt();
            note = new String[num];
            for (int i = 0; i < num; i++) {
                System.out.println("Please, input a note on this date: ");
                note[i] = sc.next();
            }
        }

        public void view() {
            System.out.println("Date: " + date);
            for (int i = 0; i < num; i++) {
                System.out.println("Note: " + note[i]);
            }
        }
    }
}

public class ConsoleNotepadApp {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.launchApp();
    }
}