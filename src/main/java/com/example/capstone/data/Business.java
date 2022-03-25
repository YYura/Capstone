package com.example.capstone.data;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;


@Data
@Entity
@NoArgsConstructor
@Table(name="business")
public class Business {
    @Id
    private String businessCode;
    private String memberCode;
    private String businessName;
    private String businessRepresentative;
    private String businessZipcode;
    private String businessAddress;
    private String businessPhone;
    private String businessHomepage;
    private Timestamp businessEnrollment;


}
