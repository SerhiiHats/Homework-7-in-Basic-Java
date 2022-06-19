package models;

public class Price implements Comparable<Price>{
    private String nameOfProduct;
    private String nameOfShop;
    private double priceOfProduct;

    public Price(String nameOfProduct, String nameOfShop, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.nameOfShop = nameOfShop;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    @Override
    public String toString() {
        return "Название товара : " + nameOfProduct +
                ", название магазина : " + nameOfShop +
                ", стоимость товара : " + priceOfProduct +
                " грн. ";
    }


    @Override
    public int compareTo(Price other) {
        return nameOfShop.compareTo(other.nameOfShop);
    }
}
