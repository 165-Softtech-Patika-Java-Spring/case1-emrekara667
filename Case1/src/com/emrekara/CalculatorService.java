package com.emrekara;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculatorService {


    public  BigDecimal totalPriceHouse(List<RealEstate> listHouse) {
        BigDecimal totalHousePrice = BigDecimal.ZERO;

        for(RealEstate houseTemp : listHouse){
            totalHousePrice = totalHousePrice.add(houseTemp.getPrice());
        }

        return totalHousePrice;
    }

    public  BigDecimal totalPriceVilla(List<RealEstate> listVilla) {
        BigDecimal totalVillaPrice = BigDecimal.ZERO;

        for(RealEstate villaTemp : listVilla){
            totalVillaPrice = totalVillaPrice.add(villaTemp.getPrice());
        }

        return totalVillaPrice;
    }

    public  BigDecimal totalPriceSummerHouse(List<RealEstate> listSummerHouse) {
        BigDecimal totalSummerHousePrice = BigDecimal.ZERO;

        for(RealEstate villaTemp : listSummerHouse){
            totalSummerHousePrice = totalSummerHousePrice.add(villaTemp.getPrice());
        }

        return totalSummerHousePrice;
    }

    public  BigDecimal totalPriceAllEstate(List<RealEstate> listEstate) {
        BigDecimal totalEstatePrice = BigDecimal.ZERO;

        for(RealEstate realEstateTemp : listEstate){
            totalEstatePrice = totalEstatePrice.add(realEstateTemp.getPrice());
        }

        return totalEstatePrice;
    }

    public  BigDecimal averageSquareMetersofHouse(List<RealEstate> listHouse) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfHouse = 0;

        for(RealEstate houseTemp : listHouse){
            averageSquaremeter = averageSquaremeter.add(houseTemp.getSquareMeter());
            numberOfHouse++;
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfHouse), 2, RoundingMode.HALF_UP);
    }

    public  BigDecimal averageSquareMetersofVilla(List<RealEstate> listVilla) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfVillas = 0;

        for(RealEstate villaTemp : listVilla){
            averageSquaremeter = averageSquaremeter.add(villaTemp.getSquareMeter());
            numberOfVillas++;
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfVillas), 2, RoundingMode.HALF_UP);
    }

    public  BigDecimal averageSquareMetersofSummerHouse(List<RealEstate> listSummerHouse) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfSummerHouse = 0;

        for(RealEstate summerHouseTemp : listSummerHouse){
            averageSquaremeter = averageSquaremeter.add(summerHouseTemp.getSquareMeter());
            numberOfSummerHouse++;
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfSummerHouse), 2, RoundingMode.HALF_UP);
    }

    public  BigDecimal averageSquareMetersofRealEstates(List<RealEstate> listRealEstate) {
        BigDecimal averageSquaremeter = BigDecimal.ZERO;
        int numberOfRealEstate = 0;

        for(RealEstate realEstateTemp : listRealEstate){
            averageSquaremeter = averageSquaremeter.add(realEstateTemp.getSquareMeter());
            numberOfRealEstate++;
        }

        return averageSquaremeter.divide(new BigDecimal(numberOfRealEstate), 2, RoundingMode.HALF_UP);
    }

    public  void getSelectedRealEstate(List<RealEstate> realEstateList, Long numberOfRooms, Long numberOfHalls) {
        List<RealEstate> realEstateTemp = new ArrayList();
        Iterator var4 = realEstateList.iterator();

       for(RealEstate realEstate: realEstateList){
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

    public void showRealEstate(List<RealEstate> realEstateList) {

        for(RealEstate realEstateTemp : realEstateList){
            System.out.println( realEstateTemp.getClass().getSimpleName() + " : Price : " + realEstateTemp.getPrice() + " Square meter : " + realEstateTemp.getSquareMeter());
    }

    }
}
