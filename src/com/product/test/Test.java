package com.product.test;

import com.product.books.Book;
import com.product.computers.Computer;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Computer> listcomputer = new ArrayList<>();
        ArrayList<Book> listbook = new ArrayList<>();
        boolean out = true;
        do {
            System.out.println("Please select:");
            System.out.println("1.Input information for n Computer.");
            System.out.println("2.Input information for n Book.");
            System.out.println("3.Display information of n Computers by sorting the price descending.");
            System.out.println("4.Display information of n Books by sorting the publisher ascending.");
            System.out.println("5.Exit");
            System.out.println("Your choice:");
            Scanner scan = new Scanner(System.in);
            int input = Integer.parseInt(scan.nextLine());
            switch (input) {
                case 1:
                    int n = numberN();
                    for (int i = 0; i < n; i++) {
                        Computer c = new Computer();
                        c.input();
                        listcomputer.add(c);
                    }
                    break;
                case 2:
                    int m = numberN();
                    for (int i = 0; i < m; i++) {
                        Book b = new Book();
                        b.input();
                        listbook.add(b);
                    }
                    break;
                case 3:
                    listcomputer.sort((a1, a2) -> (int) (a2.getPrice() - a1.getPrice()));
                    for(Computer c : listcomputer) c.display();
                    break;
                case 4:
                    listbook.sort(Comparator.comparing(Book::getPublisher));
                    for(Book b : listbook) b.display();
                    break;
                case 5:
                    out = false;
                    break;
                default:
                    System.out.println("Type from 1 to 5");
            }
        } while (out);
    }



    public static int numberN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number n: ");
        return Integer.parseInt(sc.nextLine());
    }
}
