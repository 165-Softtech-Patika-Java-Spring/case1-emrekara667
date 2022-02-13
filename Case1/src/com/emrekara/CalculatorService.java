package com.emrekara;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculatorService {
    public CalculatorService() {
    }

    public static BigDecimal totalPriceHouse(List<RealEstate> listHouse) {
        BigDecimal totalHousePrice = BigDecimal.ZERO;

        RealEstate houseTemp;
        for(Iterator var2 = listHouse.iterator(); var2.hasNext(); totalHousePrice = totalHousePrice.add(houseTemp.getPrice())) {
            houseTemp = (RealEstate)var2.next();
        }

        return totalHousePrice;
    }

    public static BigDecimal totalPriceVilla(List<RealEstate> listVilla) {
        BigDecimal totalHousePrice = BigDecimal.ZERO;

        RealEstate villaTemp;
        for(Iterator var2 = listVilla.iterator(); var2.hasNext(); totalHousePrice = totalHousePrice.add(villaTemp.getPrice())) {
            villaTemp = (RealEstate)var2.next();
        }

        return totalHousePrice;
    }

    public static BigDecimal totalPriceSummerHouse(List<RealEstate> listSummerHouse) {
        BigDecimal totalHousePrice = BigDecimal.ZERO;

        RealEstate summerHouseTemp;
        for(Iterator var2 = listSummerHouse.iterator(); var2.hasNext(); totalHousePrice = totalHousePrice.add(summerHouseTemp.getPrice())) {
            summerHouseTemp = (RealEstate)var2.next();
        }

        return totalHousePrice;
    }

    public static BigDecimal totalPriceAllEstate(List<RealEstate> listEstate) {
        BigDecimal totalEstatePrice = BigDecimal.ZERO;

        RealEstate estateTemp;
        for(Iterator var2 = listEstate.iterator(); var2.hasNext(); totalEstatePrice = totalEstatePrice.add(estateTemp.getPrice())) {
            estateTemp = (RealEstate)var2.next();
        }

        return totalEstatePrice;
    }

    public static BigDecimal averageSquareMetersofHouse(List<RealEstate> listHouse) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfHouses = 0;

        for(Iterator var3 = listHouse.iterator(); var3.hasNext(); ++numberOfHouses) {
            RealEstate houseTemp = (RealEstate)var3.next();
            averageSquaremeter = averageSquaremeter.add(houseTemp.getSquareMeter());
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfHouses), 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal averageSquareMetersofVilla(List<RealEstate> listVilla) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfVillas = 0;

        for(Iterator var3 = listVilla.iterator(); var3.hasNext(); ++numberOfVillas) {
            RealEstate villaTemp = (RealEstate)var3.next();
            averageSquaremeter = averageSquaremeter.add(villaTemp.getSquareMeter());
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfVillas), 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal averageSquareMetersofSummerHouse(List<RealEstate> listSummerHouse) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfSummerHouse = 0;

        for(Iterator var3 = listSummerHouse.iterator(); var3.hasNext(); ++numberOfSummerHouse) {
            RealEstate summerHouseTemp = (RealEstate)var3.next();
            averageSquaremeter = averageSquaremeter.add(summerHouseTemp.getSquareMeter());
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfSummerHouse), 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal averageSquareMetersofRealEstates(List<RealEstate> listRealEstate) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfRealEstate = 0;

        for(Iterator var3 = listRealEstate.iterator(); var3.hasNext(); ++numberOfRealEstate) {
            RealEstate realEstateTemp = (RealEstate)var3.next();
            averageSquaremeter = averageSquaremeter.add(realEstateTemp.getSquareMeter());
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfRealEstate), 2, RoundingMode.HALF_UP);
    }

    public static void getSelectedRealEstate(List<RealEstate> realEstateList, Long numberOfRooms, Long numberOfHalls) {
        List<RealEstate> realEstateTemp = new ArrayList();
        Iterator var4 = realEstateList.iterator();

        while(var4.hasNext()) {
            RealEstate realEstate = (RealEstate)var4.next();
            if (realEstate.getNumberOfHalls().equals(numberOfHalls) && realEstate.getNumberOfRooms().equals(numberOfRooms)) {
                realEstateTemp.add(realEstate);
            }
        }

        if (realEstateTemp.isEmpty()) {
            System.out.println("This type of real estate as not found ! Rooms : " + numberOfRooms + " Halls : " + numberOfHalls);
        } else {
            System.out.println("Selected Real Estate Types Rooms : " + numberOfRooms + " Halls : " + numberOfHalls);
            showRealEstate(realEstateTemp);
        }

    }

    public static void showRealEstate(List<RealEstate> realEstateList) {
        Iterator var1 = realEstateList.iterator();

        while(var1.hasNext()) {
            RealEstate realEstateTemp = (RealEstate)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = realEstateTemp.getClass().getSimpleName();
            var10000.println(var10001 + " : Price : " + realEstateTemp.getPrice() + " Square meter : " + realEstateTemp.getSquareMeter());
        }

    }
}
