package xyz.zedler.patrick.grocy.model;

import com.google.gson.annotations.SerializedName;

public class MissingProduct {

    @SerializedName("id")
    int id;

    @SerializedName("name")
    String name;

    @SerializedName("amount_missing")
    int amountMissing;

    @SerializedName("is_partly_in_stock")
    int isPartlyInStock;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmountMissing() {
        return amountMissing;
    }

    public int getIsPartlyInStock() {
        return isPartlyInStock;
    }
}
