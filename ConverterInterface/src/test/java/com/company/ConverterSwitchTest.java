package com.company;

import com.company.interfaces.Converter;
import junit.framework.TestFailure;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    private Converter converter = new ConverterSwitch();

    @Test
    public void convertMonth() {
        assertEquals("January", converter.convertMonth(1));
        assertEquals("September", converter.convertMonth(9));
    }

    @Test
    public void convertDay() {
        assertEquals("Tuesday", converter.convertDay(3));
        assertEquals("Sunday", converter.convertDay(1));
    }
}