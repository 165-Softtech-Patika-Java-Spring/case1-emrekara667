package com.emrekara;

import java.math.BigDecimal;

public class House extends RealEstate {
    public House(BigDecimal price, BigDecimal squareMeter, Long numberOfRooms, Long numberOfHalls) {
        super(price, squareMeter, numberOfRooms, numberOfHalls);
    }
}
