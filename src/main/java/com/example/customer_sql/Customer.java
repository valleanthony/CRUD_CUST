package com.example.customer_sql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {

    @Id
    @NotNull // should the strategy be auto Gen?
    private long id;

    @NotNull
    private String Title;

    @NotNull
    private String Firstname;

    @NotNull
    private String Lastname;

    @NotNull
    private String Streetadress;

    @NotNull
    private String Zipcode;

    @NotNull
    private String Emailaddress;

    @NotNull
    private String Position;

    @NotNull
    private long Customerid;

    @NotNull
    private long Companyid;

    @NotNull
    private long cityid;

    @NotNull
    private long stateid;

    public Customer() {
    }

    public Customer(@NotNull long id, @NotNull String title, @NotNull String firstname, @NotNull String lastname, @NotNull String streetadress, @NotNull String zipcode, @NotNull String emailaddress, @NotNull String position, @NotNull long customerid, @NotNull long companyid, @NotNull long cityid, @NotNull long stateid) {
        this.id = id;
        Title = title;
        Firstname = firstname;
        Lastname = lastname;
        Streetadress = streetadress;
        Zipcode = zipcode;
        Emailaddress = emailaddress;
        Position = position;
        Customerid = customerid;
        Companyid = companyid;
        this.cityid = cityid;
        this.stateid = stateid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getStreetadress() {
        return Streetadress;
    }

    public void setStreetadress(String streetadress) {
        Streetadress = streetadress;
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

    public long getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(long customerid) {
        Customerid = customerid;
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





