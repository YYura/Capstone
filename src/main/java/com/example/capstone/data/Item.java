package com.example.capstone.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
@Table(name="item")
public class Item {
    @Id
    private String itemCode;
    private String businessCode;
    private String classifyCode;
    private String itemName;
    private int itemPrice;
    private String itemDescription;
    private char itemState;
    private int itemRecommendation;
    private Timestamp itemUpdateDate;
    private int deliveryPrice;
    private String itemSize;
    private String itemWeight;
    private String itemMaterial;
    private float itemStar;
    private String itemEntranceTime;
    private String itemLeavingTime;
}
