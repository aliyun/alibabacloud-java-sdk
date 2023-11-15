// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmDissentOriginalRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ContactAddress")
    public String contactAddress;

    @NameInMap("ContactCity")
    public String contactCity;

    @NameInMap("ContactCounty")
    public String contactCounty;

    @NameInMap("ContactDistrict")
    public String contactDistrict;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactNumber")
    public String contactNumber;

    @NameInMap("ContactProvince")
    public String contactProvince;

    @NameInMap("OperateType")
    public String operateType;

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

    public ConfirmDissentOriginalRequest setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public String getContactAddress() {
        return this.contactAddress;
    }

    public ConfirmDissentOriginalRequest setContactCity(String contactCity) {
        this.contactCity = contactCity;
        return this;
    }
    public String getContactCity() {
        return this.contactCity;
    }

    public ConfirmDissentOriginalRequest setContactCounty(String contactCounty) {
        this.contactCounty = contactCounty;
        return this;
    }
    public String getContactCounty() {
        return this.contactCounty;
    }

    public ConfirmDissentOriginalRequest setContactDistrict(String contactDistrict) {
        this.contactDistrict = contactDistrict;
        return this;
    }
    public String getContactDistrict() {
        return this.contactDistrict;
    }

    public ConfirmDissentOriginalRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
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

    public ConfirmDissentOriginalRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
