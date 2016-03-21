package com.pickle.Domain;

import javax.persistence.*;

/**
 * Created by andrikurniawan.id@gmail.com on 3/17/2016.
 */
@Entity
@Table(name = "banksampah", schema = "pickle", catalog = "")
public class BanksampahEntity {
    private int id;
    private String nama;
    private String description;
    private String phoneNumber;
    private String locationLat;
    private String locationLng;
    private String locationName;
    private String locationDesc;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nama")
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "locationLat")
    public String getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(String locationLat) {
        this.locationLat = locationLat;
    }

    @Basic
    @Column(name = "LocationLng")
    public String getLocationLng() {
        return locationLng;
    }

    public void setLocationLng(String locationLng) {
        this.locationLng = locationLng;
    }

    @Basic
    @Column(name = "locationName")
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Basic
    @Column(name = "LocationDesc")
    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BanksampahEntity that = (BanksampahEntity) o;

        if (id != that.id) return false;
        if (nama != null ? !nama.equals(that.nama) : that.nama != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (locationLat != null ? !locationLat.equals(that.locationLat) : that.locationLat != null) return false;
        if (locationLng != null ? !locationLng.equals(that.locationLng) : that.locationLng != null) return false;
        if (locationName != null ? !locationName.equals(that.locationName) : that.locationName != null) return false;
        if (locationDesc != null ? !locationDesc.equals(that.locationDesc) : that.locationDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nama != null ? nama.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (locationLat != null ? locationLat.hashCode() : 0);
        result = 31 * result + (locationLng != null ? locationLng.hashCode() : 0);
        result = 31 * result + (locationName != null ? locationName.hashCode() : 0);
        result = 31 * result + (locationDesc != null ? locationDesc.hashCode() : 0);
        return result;
    }
}
