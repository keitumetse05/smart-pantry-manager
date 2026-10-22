package com.example.smartpantrymanager.model;
import com.google.gson.annotations.SerializedName;
public class PantryItem {
    private Long id;
    private String name;
    private double quantity;
    private String unit;
    @SerializedName("expiry_date")
    private String expiryDate;

    public PantryItem(String name, double quantity, String unit, String expiryDate) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expiryDate = expiryDate;

}
public Long getId() { return id; }
public String getName() { return name; }
public double getQuantity() { return quantity; }
public String getUnit() { return unit; }
public String getExpiryDate() { return expiryDate; }
}