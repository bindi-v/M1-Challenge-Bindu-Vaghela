package com.company;

import com.company.interfaces.Converter;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    private Converter convert = new ConverterIf();

    @Test
    public void convertMonth() {
        assertEquals("June", convert.convertMonth(6));
        assertEquals("November", convert.convertMonth(11));
    }

    @Test
    public void convertDay() {
        assertEquals("Monday", convert.convertDay(2));
        assertEquals("Saturday", convert.convertDay(7));
    }
}