package com.example.capstone.data;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.sql.Blob;
import java.sql.Timestamp;


@Data
@Entity
@NoArgsConstructor
@Table(name="member")
public class Member {
    @Id
    private String memberCode;
    private String memberId;
    private String memberPw;
    private String memberEmail;
    private String memberNickname;
    private String memberName;
    private String memberPhone;
    private String memberZipcode;
    private String memberAddress;
    private char memberState;
    @Lob
    private Blob memberImage;
    private Timestamp memberLeaveDate;


}
