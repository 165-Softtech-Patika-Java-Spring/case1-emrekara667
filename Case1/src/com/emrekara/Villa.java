package com.emrekara;

import java.math.BigDecimal;

public class Villa extends RealEstate {
    public Villa(BigDecimal price, BigDecimal squareMeter, Long numberOfRooms, Long numberOfHalls) {
        super(price, squareMeter, numberOfRooms, numberOfHalls);
    }
}
