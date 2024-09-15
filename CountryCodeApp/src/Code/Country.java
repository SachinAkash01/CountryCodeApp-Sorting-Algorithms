/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author it21351372
 */
public class Country {
     private String CountryName;     
     private String alpha2Code;
     private String alpha3Code; 
     private int m49Code; 

    public Country(String CountryName, String alpha2Code, String alpha3Code, int m49Code) {
        this.CountryName = CountryName;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
        this.m49Code = m49Code;
    }

    public String getCountryName() {
        return CountryName;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public int getM49Code() {
        return m49Code;
    }
     
     
}
