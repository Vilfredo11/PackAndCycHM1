package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {
    @Test
    public void shouldCalcExact() {
        SqrService service = new SqrService();
        int expected = 3;
        int actual = service.sqr(300,200);

        Assertions.assertEquals(expected,actual);
    }
}

