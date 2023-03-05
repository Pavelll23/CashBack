package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service =new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemain() {
        int actual = service.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldAmountMore1000(){
        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldAmountEqual1000(){
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}

