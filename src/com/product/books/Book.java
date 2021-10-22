package com.product.books;

import com.product.Product;

import java.util.Scanner;

public class Book extends Product {
    private String type;
    private String publisher;

    public Book() {

    }

    public Book(String proId, String proName, int year, float price, String type, String publisher) {
        super(proId, proName, year, price);
        this.type = type;
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap proId: ");
        this.proId = sc.nextLine();
        System.out.println("Nhap proName: ");
        this.proName = sc.nextLine();
        System.out.println("Nhap year:");
        this.year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap price:");
        this.price = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap type: ");
        this.type = sc.nextLine();
        System.out.println("Nhap pulisher: ");
        this.publisher = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("proId" + this.proId);
        System.out.println("proName" + this.proName);
        System.out.println("year" + this.year);
        System.out.println("price" + this.price);
        System.out.println("speed" + this.type);
        System.out.println("producer" + this.publisher);
    }
}
