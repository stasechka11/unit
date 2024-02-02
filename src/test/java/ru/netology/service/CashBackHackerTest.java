package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackerTest {
    @Test
    public void shouldRemain100IfAmount900() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0IfAmount1000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0IfAmount3000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 3000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain901IfAmount99() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1;

        int actual = cashBackHacker.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain500IfAmount500() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 500;

        int actual = cashBackHacker.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain900IfAmount1100() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1100;

        int actual = cashBackHacker.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain1000IfAmount0() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 0;

        int actual = cashBackHacker.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}