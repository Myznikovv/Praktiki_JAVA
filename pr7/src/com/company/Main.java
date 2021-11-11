package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(new ex1("13579", "24680").play());
        System.out.println(new ex1("12345", "67890").play());
        System.out.println(new ex1("13029", "42685").play());

        System.out.println(new ex2("13579", "24680").play());
        System.out.println(new ex2("12345", "67890").play());
        System.out.println(new ex2("13029", "42685").play());

        System.out.println(new ex3("13579", "24680").play());
        System.out.println(new ex3("12345", "67890").play());
        System.out.println(new ex3("13029", "42685").play());

        System.out.println(new ex4("13579", "24680").play());
        System.out.println(new ex4("12345", "67890").play());
        System.out.println(new ex4("13029", "42685").play());
    }
}
