package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "countries")
public class Country {

    public Country () {
    }

    @Id
    @Column(name = "iso_code")
    private String isoCode;
    @Column(name = "country_name")
    private String name;
    private String timezone;

    public Country(String name, String isoCode, String timezone) {
        this.name = name;
        this.isoCode = isoCode;
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", timeZone='" + timezone + '\'' +
                '}';
    }
}
