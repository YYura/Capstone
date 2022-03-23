package com.example.capstone.data;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name="item_classify")
public class ItemClassify {
    @Id
    private String classifyCode;
    private String classifyName;
    private String classifyDescription;
}
