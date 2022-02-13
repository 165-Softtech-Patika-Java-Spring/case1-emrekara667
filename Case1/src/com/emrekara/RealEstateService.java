package com.emrekara;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RealEstateService {
    private RealEstate house1 = new House(new BigDecimal("250000"), new BigDecimal("120"), 1L, 1L);
    private RealEstate house2 = new House(new BigDecimal("300000"), new BigDecimal("140"), 2L, 1L);
    private RealEstate house3 = new House(new BigDecimal("350000"), new BigDecimal("190"), 3L, 1L);


    private RealEstate villa1 = new Villa(new BigDecimal("500000"), new BigDecimal("200"), 5L, 2L);
    private RealEstate villa2 = new Villa(new BigDecimal("550000"), new BigDecimal("230"), 6L, 2L);
    private RealEstate villa3 = new Villa(new BigDecimal("600000"), new BigDecimal("250"), 7L, 2L);


    private RealEstate summerHouse1 = new SummerHouse(new BigDecimal("400000"), new BigDecimal("150"), 2L, 1L);
    private RealEstate summerHouse2 = new SummerHouse(new BigDecimal("450000"), new BigDecimal("160"), 4L, 2L);
    private RealEstate summerHouse3 = new SummerHouse(new BigDecimal("475000"), new BigDecimal("190"), 5L, 2L);


    public List<RealEstate> getAllEstateList() {
        List<RealEstate> allEstatelist = new ArrayList();
        allEstatelist.add(this.house1);
        allEstatelist.add(this.house2);
        allEstatelist.add(this.house3);
        allEstatelist.add(this.villa1);
        allEstatelist.add(this.villa2);
        allEstatelist.add(this.villa3);
        allEstatelist.add(this.summerHouse1);
        allEstatelist.add(this.summerHouse2);
        allEstatelist.add(this.summerHouse3);
        return allEstatelist;
    }

    public List<RealEstate> getHouseList() {
        List<RealEstate> houseList = new ArrayList();
        houseList.add(this.house1);
        houseList.add(this.house2);
        houseList.add(this.house3);
        return houseList;
    }

    public List<RealEstate> getVillaList() {
        List<RealEstate> villaList = new ArrayList();
        villaList.add(this.villa1);
        villaList.add(this.villa2);
        villaList.add(this.villa3);
        return villaList;
    }

    public List<RealEstate> getSummerHouseList() {
        List<RealEstate> summerHouseList = new ArrayList();
        summerHouseList.add(this.summerHouse1);
        summerHouseList.add(this.summerHouse2);
        summerHouseList.add(this.summerHouse3);
        return summerHouseList;
    }

    public static void main(String[] args) {
        RealEstateService realEstateService = new RealEstateService();
        List<RealEstate> houseList = realEstateService.getHouseList();
        List<RealEstate> villaList = realEstateService.getVillaList();
        List<RealEstate> summerHouseList = realEstateService.getSummerHouseList();
        List<RealEstate> realEstateList = realEstateService.getAllEstateList();
        System.out.println("Total price of houses : " + CalculatorService.totalPriceHouse(houseList));
        System.out.println("Total price of villas :  " + CalculatorService.totalPriceVilla(villaList));
        System.out.println("total price of summer houses : " + CalculatorService.totalPriceSummerHouse(summerHouseList));
        System.out.println("Total price of all real estate : " + CalculatorService.totalPriceAllEstate(realEstateList));
        System.out.println("Average square meter of Houses : " + CalculatorService.averageSquareMetersofHouse(houseList));
        System.out.println("Average square meter of Villas : " + CalculatorService.averageSquareMetersofVilla(villaList));
        System.out.println("Average square meter of Summer Houses : " + CalculatorService.averageSquareMetersofSummerHouse(summerHouseList));
        System.out.println("Average square meter of all Real Estate : " + CalculatorService.averageSquareMetersofRealEstates(realEstateList));
        CalculatorService.getSelectedRealEstate(realEstateList, 7L, 2L);
        CalculatorService.getSelectedRealEstate(realEstateList, 10L, 2L);
    }
}
