// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmDissentOriginalRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactAddress")
    public String contactAddress;

    @NameInMap("ContactNumber")
    public String contactNumber;

    @NameInMap("ContactProvince")
    public String contactProvince;

    @NameInMap("ContactCity")
    public String contactCity;

    @NameInMap("ContactDistrict")
    public String contactDistrict;

    @NameInMap("ContactCounty")
    public String contactCounty;

    public static ConfirmDissentOriginalRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDissentOriginalRequest self = new ConfirmDissentOriginalRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmDissentOriginalRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ConfirmDissentOriginalRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ConfirmDissentOriginalRequest setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public String getContactAddress() {
        return this.contactAddress;
    }

    public ConfirmDissentOriginalRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public ConfirmDissentOriginalRequest setContactProvince(String contactProvince) {
        this.contactProvince = contactProvince;
        return this;
    }
    public String getContactProvince() {
        return this.contactProvince;
    }

    public ConfirmDissentOriginalRequest setContactCity(String contactCity) {
        this.contactCity = contactCity;
        return this;
    }
    public String getContactCity() {
        return this.contactCity;
    }

    public ConfirmDissentOriginalRequest setContactDistrict(String contactDistrict) {
        this.contactDistrict = contactDistrict;
        return this;
    }
    public String getContactDistrict() {
        return this.contactDistrict;
    }

    public ConfirmDissentOriginalRequest setContactCounty(String contactCounty) {
        this.contactCounty = contactCounty;
        return this;
    }
    public String getContactCounty() {
        return this.contactCounty;
    }

}
