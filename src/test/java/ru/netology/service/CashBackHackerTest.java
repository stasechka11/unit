package ru.netology.service;

import org.junit.Assert;

public class CashBackHackerTest {
    @org.junit.Test
    public void shouldRemain100IfAmount900() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemain0IfAmount1000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemain0IfAmount3000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 3000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemain999IfAmount1() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1;

        int actual = cashBackHacker.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemain500IfAmount500() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 500;

        int actual = cashBackHacker.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemain900IfAmount1100() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1100;

        int actual = cashBackHacker.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemain1000IfAmount0() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 0;

        int actual = cashBackHacker.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain100IfAmount900Jupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain0IfAmount1000Jupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain0IfAmount3000Jupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 3000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain999IfAmount1Jupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1;

        int actual = cashBackHacker.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain500IfAmount500Jupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 500;

        int actual = cashBackHacker.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain900IfAmount1100Jupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1100;

        int actual = cashBackHacker.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain1000IfAmount0Jupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 0;

        int actual = cashBackHacker.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

}