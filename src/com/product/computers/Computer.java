package com.product.computers;

import com.product.Product;
import java.util.Scanner;

public class Computer extends Product {
    private String speed;
    private String producer;

    public Computer(){

    }

    public Computer(String proId, String proName, int year, float price, String speed, String producer) {
        super(proId, proName, year, price);
        this.speed = speed;
        this.producer = producer;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
        System.out.println("Nhap speed: ");
        this.speed = sc.nextLine();
        System.out.println("Nhap producer: ");
        this.producer = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("proId" + this.proId);
        System.out.println("proName" + this.proName);
        System.out.println("year" + this.year);
        System.out.println("price" + this.price);
        System.out.println("speed" + this.speed);
        System.out.println("producer" + this.producer);
    }
}
