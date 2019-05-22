package com.example.customer_sql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {

    @Id
    @NotNull
    @GeneratedValue (strategy = GenerationType.IDENTITY)// should the strategy be auto Gen?
    private long customerid;

    @NotNull
    private String Title;

    @NotNull
    private String Firstname;

    @NotNull
    private String Lastname;

    @NotNull
    private String Streetaddress;

    @NotNull
    private String Zipcode;

    @NotNull
    private String Emailaddress;


    private String Position;


    private long Companyid;


    private long cityid;


    private long stateid;

    public Customer() {
    }

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getStreetaddress() {
        return Streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        Streetaddress = streetaddress;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public String getEmailaddress() {
        return Emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        Emailaddress = emailaddress;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public long getCompanyid() {
        return Companyid;
    }

    public void setCompanyid(long companyid) {
        Companyid = companyid;
    }

    public long getCityid() {
        return cityid;
    }

    public void setCityid(long cityid) {
        this.cityid = cityid;
    }

    public long getStateid() {
        return stateid;
    }

    public void setStateid(long stateid) {
        this.stateid = stateid;
    }
}





