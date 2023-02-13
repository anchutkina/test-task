package com.anchutkina;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Currency {
    @Id
    @SequenceGenerator(
            name = "currency_id_sequence",
            sequenceName = "currency_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "currency_id_sequence"
    )
    private Integer id;
    private String shortName;
    private Date validFrom;
    private String name;
    private String country;
    private Double move;
    private Integer amount;
    private Double valBuy;
    private Double valSell;
    private Double valMid;
    private Double currBuy;
    private Double currSell;
    private Double currMid;
    private Integer version;
    private Double cnbMid;
    private Double ecbMid;


    public Currency(String shortName,
                    Date validFrom,
                    String name,
                    String country,
                    Double move,
                    Integer amount,
                    Double valBuy,
                    Double valSell,
                    Double valMid,
                    Double currBuy,
                    Double currSell,
                    Double currMid,
                    Integer version,
                    Double cnbMid,
                    Double ecbMid) {
        this.shortName = shortName;
        this.validFrom = validFrom;
        this.name = name;
        this.country = country;
        this.move = move;
        this.amount = amount;
        this.valBuy = valBuy;
        this.valSell = valSell;
        this.valMid = valMid;
        this.currBuy = currBuy;
        this.currSell = currSell;
        this.currMid = currMid;
        this.version = version;
        this.cnbMid = cnbMid;
        this.ecbMid = ecbMid;

    }

    public Currency() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName (String shortName){
        this.shortName = shortName;
    }

    public Date getValidFrom () {
        return validFrom;
    }

    public void setValidFrom (Date validFrom){
        this.validFrom = validFrom;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry (String country){
        this.country = country;
    }

    public Double getMove () {
        return move;
    }

    public void setMove (Double move){
        this.move = move;
    }

    public Integer getAmount () {
        return amount;
    }

    public void setAmount (Integer amount){
        this.amount = amount;
    }

    public Double getValBuy () {
        return valBuy;
    }

    public void setValBuy (Double valBuy){
        this.valBuy = valBuy;
    }

    public Double getValSell () {
        return valSell;
    }

    public void setValSell (Double valSell){
        this.valSell = valSell;
    }

    public Double getValMid () {
        return valMid;
    }

    public void setValMid (Double valMid){
        this.valMid = valMid;
    }

    public Double getCurrBuy () {
        return currBuy;
    }

    public void setCurrBuy (Double currBuy){
        this.currBuy = currBuy;
    }

    public Double getCurrSell () {
        return currSell;
    }

    public void setCurrSell (Double currSell){
        this.currSell = currSell;
    }

    public Double getCurrMid () {
        return currMid;
    }

    public void setCurrMid (Double currMid){
        this.currMid = currMid;
    }

    public Integer getVersion () {
        return version;
    }

    public void setVersion (Integer version){
        this.version = version;
    }

    public Double getCnbMid () {
        return cnbMid;
    }

    public void setCnbMid (Double cnbMid){
        this.cnbMid = cnbMid;
    }

    public Double getEcbMid () {
        return ecbMid;
    }

    public void setEcbMid (Double ecbMid){
        this.ecbMid = ecbMid;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(id, currency.id) && Objects.equals(shortName, currency.shortName) && Objects.equals(validFrom, currency.validFrom) && Objects.equals(name, currency.name) && Objects.equals(country, currency.country) && Objects.equals(move, currency.move) && Objects.equals(amount, currency.amount) && Objects.equals(valBuy, currency.valBuy) && Objects.equals(valSell, currency.valSell) && Objects.equals(valMid, currency.valMid) && Objects.equals(currBuy, currency.currBuy) && Objects.equals(currSell, currency.currSell) && Objects.equals(currMid, currency.currMid) && Objects.equals(version, currency.version) && Objects.equals(cnbMid, currency.cnbMid) && Objects.equals(ecbMid, currency.ecbMid);
    }

    @Override
    public int hashCode () {
        return Objects.hash(id, shortName, validFrom, name, country, move, amount, valBuy, valSell, valMid, currBuy, currSell, currMid, version, cnbMid, ecbMid);
    }


    @Override
    public String toString () {
        return "Currency{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                ", validFrom=" + validFrom +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", move=" + move +
                ", amount=" + amount +
                ", valBuy=" + valBuy +
                ", valSell=" + valSell +
                ", valMid=" + valMid +
                ", currBuy=" + currBuy +
                ", currSell=" + currSell +
                ", currMid=" + currMid +
                ", version=" + version +
                ", cnbMid=" + cnbMid +
                ", ecbMid=" + ecbMid +
                '}';
    }

}