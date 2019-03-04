/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.todelete.DTO;

import dk.webtrade.todelete.entity.Address;
import dk.webtrade.todelete.entity.Customer;

/**
 *
 * @author thomas
 */
public class CustomerDTO {
    private String firstname;
    private String lastname;
    private int age;
    private String address;
    public CustomerDTO(Customer c) {
        this.firstname = c.getFirstname();
        this.lastname = c.getLastname();
        this.age = c.getAge();
        this.address = c.getAddress().toString();
    }
    public CustomerDTO(String fn, String ln, int age, Address address) {
        this.firstname = fn;
        this.lastname = ln;
        this.age = age;
        this.address = address.toString();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}