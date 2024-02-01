package ru.netology.service;

import org.testng.Assert;


@org.testng.annotations.Test
public class CashBackHackerTest {

    public void shouldRemain100WhenAmount900() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }
}