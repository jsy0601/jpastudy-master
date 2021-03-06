package com.circus.jpastudy.store;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class Store extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String storeName;  // DB: store_name
    private String storePhone;
    private String bossName;
    private String address;
    private String number;
    private String intro;
    private String opening;
    private String breaktime;
    private String holiday;
    private String temholiday;



    @Builder
    public Store(String storeName, String storePhone, String bossName, String address, String number, String intro, String opening, String breaktime, String holiday, String temholiday, String storeLatitude, String storeLongitude) {
        this.storeName = storeName;
        this.storePhone = storePhone;
        this.bossName = bossName;
        this.address = address;
        this.number = number;
        this.intro = intro;
        this.opening = opening;
        this.breaktime = breaktime;
        this.holiday = holiday;
        this.temholiday = temholiday;
    }

    public Store(StoreRegisterDTO storeRegisterDTO) {
        this.storeName = storeRegisterDTO.getStoreName();
        this.storePhone = storeRegisterDTO.getStorePhone();
        this.bossName = storeRegisterDTO.getBossName();
        this.address = storeRegisterDTO.getAddress();
        this.number = storeRegisterDTO.getNumber();
        this.intro = storeRegisterDTO.getIntro();
        this.opening = storeRegisterDTO.getOpening();
        this.breaktime = storeRegisterDTO.getBreaktime();
        this.holiday = storeRegisterDTO.getHoliday();
        this.temholiday = storeRegisterDTO.getTemholiday();
    }

    public void update(StoreRegisterDTO storeRegisterDTO) {
        this.storeName = storeRegisterDTO.getStoreName();
        this.storePhone = storeRegisterDTO.getStorePhone();
        this.bossName = storeRegisterDTO.getBossName();
        this.address = storeRegisterDTO.getAddress();
        this.number = storeRegisterDTO.getNumber();
        this.intro = storeRegisterDTO.getIntro();
        this.opening = storeRegisterDTO.getOpening();
        this.breaktime = storeRegisterDTO.getBreaktime();
        this.holiday = storeRegisterDTO.getHoliday();
        this.temholiday = storeRegisterDTO.getTemholiday();
    }
}
