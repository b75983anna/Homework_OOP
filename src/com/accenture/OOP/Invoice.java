package com.accenture.OOP;

public class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private int pricePerItem;

    public Invoice(String partNumber, String description, int quantity, int pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public int getInvoiceAmount(int quantity, int pricePerItem) {
       if (quantity<0 || pricePerItem<0) {
           return 0;
        }
        int value = quantity*pricePerItem;
        return value;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }
}
