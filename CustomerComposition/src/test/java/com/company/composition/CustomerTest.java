package com.company.composition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
      customer = new Customer();
      customer.setFirstName("Tom");
      customer.setLastName("Jerry");
      customer.setEmail("abc@email.com");
      customer.setPhoneNumber(1234567890);
      customer.setShippingAddress(new Address("123, Point Dr","Apt 1"," Rosswell" ,"GA" , "30040"));
      customer.setBillingAddress(new Address("Test street 1", "Test street 2", "City", "State", "30000"));
      customer.setRewardMember(new RewardMember(true));
    }

    @Test
    public void shouldReturnFirstNameOfCustomer() {
        assertEquals("Tom", customer.getFirstName());
    }
    @Test
    public void shouldReturnLastNameOfCustomer() {
        assertEquals("Jerry", customer.getLastName());
    }
    @Test
    public void shouldReturnEmailOfCustomer() {

        assertEquals("abc@email.com", customer.getEmail());
    }

    @Test
    public void shouldReturnCustomerPhNum() {
        assertEquals(1234567890, customer.getPhoneNumber());
    }

//    @Test
//    public void shouldReturnCustomerShippingAddress() {
//        assertEquals("123", "123, Point Dr", "Apt 1", "Rosswell", "GA", "30040",  customer.getShippingAddress());
//    }
//
//     //assertEquals(String address, String s, String s1, String rosswell, String ga, String s2, Address shippingAddress) {
//    //}


//    @Test
//    public void shouldReturnCustomerIsRewardMemberOrNot() {
//        assertEquals(true, customer.getRewardMember());
//    }
}