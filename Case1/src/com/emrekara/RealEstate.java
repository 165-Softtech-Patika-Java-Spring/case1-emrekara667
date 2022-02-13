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
        return price;
    }

    public BigDecimal getSquareMeter() {
        return squareMeter;
    }

    public Long getNumberOfRooms() {
        return numberOfRooms;
    }

    public Long getNumberOfHalls() {
        return numberOfHalls;
    }
}
