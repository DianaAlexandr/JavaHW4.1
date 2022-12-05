package ru.netology;

public class Main {
    BonusService service = new BonusService();
    long amount = 1000;
    boolean registered = true;
    long expected = 30;
    long actual = service.calculate(amount, registered);
}