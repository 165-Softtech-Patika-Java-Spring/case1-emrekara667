package com.emrekara;

import java.math.BigDecimal;

public class RealEstate {
    private BigDecimal price;
    private BigDecimal squareMeter;
    private Long numberOfRooms;
    private Long numberOfHalls;

    public RealEstate(BigDecimal price, BigDecimal squareMeter, Long numberOfRooms, Long numberOfHalls) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSquareMeter() {
        return this.squareMeter;
    }

    public void setSquareMeter(BigDecimal squareMeter) {
        this.squareMeter = squareMeter;
    }

    public Long getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public void setNumberOfRooms(Long numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Long getNumberOfHalls() {
        return this.numberOfHalls;
    }

    public void setNumberOfHalls(Long numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }
}
