package com.emrekara;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RealEstateService {

    private  List<RealEstate> houseList ;
    private  List<RealEstate> summerHouseList;
    private  List<RealEstate> villaList;
    private  List<RealEstate> realEstateList;

    private RealEstate house1 = new House(new BigDecimal("250000"), new BigDecimal("120"), 1L, 1L);
    private RealEstate house2 = new House(new BigDecimal("300000"), new BigDecimal("140"), 2L, 1L);
    private RealEstate house3 = new House(new BigDecimal("350000"), new BigDecimal("190"), 3L, 1L);


    private RealEstate villa1 = new Villa(new BigDecimal("500000"), new BigDecimal("200"), 5L, 2L);
    private RealEstate villa2 = new Villa(new BigDecimal("550000"), new BigDecimal("230"), 6L, 2L);
    private RealEstate villa3 = new Villa(new BigDecimal("600000"), new BigDecimal("250"), 7L, 2L);


    private RealEstate summerHouse1 = new SummerHouse(new BigDecimal("400000"), new BigDecimal("150"), 2L, 1L);
    private RealEstate summerHouse2 = new SummerHouse(new BigDecimal("450000"), new BigDecimal("160"), 4L, 2L);
    private RealEstate summerHouse3 = new SummerHouse(new BigDecimal("475000"), new BigDecimal("190"), 5L, 2L);

    public RealEstateService(){
        setHouseList();
        setSummerHouselist();
        setVillaList();
        setRealEstateList();
    }

    public void setRealEstateList(){
        realEstateList = new ArrayList();
        realEstateList.add(this.house1);
        realEstateList.add(this.house2);
        realEstateList.add(this.house3);
        realEstateList.add(this.villa1);
        realEstateList.add(this.villa2);
        realEstateList.add(this.villa3);
        realEstateList.add(this.summerHouse1);
        realEstateList.add(this.summerHouse2);
        realEstateList.add(this.summerHouse3);
    }


    public List<RealEstate> getRealEstateList() {
        return realEstateList;
    }

    public void setHouseList(){
        houseList = new ArrayList<>();
        houseList.add(this.house1);
        houseList.add(this.house2);
        houseList.add(this.house3);
    }

    public List<RealEstate> getHouseList() {
        return houseList;
    }

    public void setVillaList(){
        villaList = new ArrayList<>();
        villaList.add(this.villa1);
        villaList.add(this.villa2);
        villaList.add(this.villa3);
    }

    public List<RealEstate> getVillaList() {
        return villaList;
    }

    public void setSummerHouselist(){
        summerHouseList = new ArrayList<>();
        summerHouseList.add(this.summerHouse1);
        summerHouseList.add(this.summerHouse2);
        summerHouseList.add(this.summerHouse3);
    }

    public List<RealEstate> getSummerHouseList() {
        return summerHouseList;
    }

    public static void main(String[] args) {

        RealEstateService realEstateService = new RealEstateService();
        CalculatorService calculatorService = new CalculatorService();

        List<RealEstate> houseList = realEstateService.getHouseList();
        List<RealEstate> villaList = realEstateService.getVillaList();
        List<RealEstate> summerHouseList = realEstateService.getSummerHouseList();
        List<RealEstate> realEstateList = realEstateService.getRealEstateList();


        System.out.println("Total price of houses : " + calculatorService.totalPriceHouse(houseList));
        System.out.println("Total price of villas :  " + calculatorService.totalPriceVilla(villaList));
        System.out.println("total price of summer houses : " + calculatorService.totalPriceSummerHouse(summerHouseList));
        System.out.println("Total price of all real estate : " + calculatorService.totalPriceAllEstate(realEstateList));
        System.out.println("Average square meter of Houses : " + calculatorService.averageSquareMetersofHouse(houseList));
        System.out.println("Average square meter of Villas : " + calculatorService.averageSquareMetersofVilla(villaList));
        System.out.println("Average square meter of Summer Houses : " + calculatorService.averageSquareMetersofSummerHouse(summerHouseList));
        System.out.println("Average square meter of all Real Estate : " + calculatorService.averageSquareMetersofRealEstates(realEstateList));
        calculatorService.getSelectedRealEstate(realEstateList, 7L, 2L);
        calculatorService.getSelectedRealEstate(realEstateList, 10L, 2L);
    }
}
