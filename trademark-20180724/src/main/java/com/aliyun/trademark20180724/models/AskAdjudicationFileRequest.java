// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class AskAdjudicationFileRequest extends TeaModel {
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

    public static AskAdjudicationFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AskAdjudicationFileRequest self = new AskAdjudicationFileRequest();
        return TeaModel.build(map, self);
    }

    public AskAdjudicationFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AskAdjudicationFileRequest setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public String getContactAddress() {
        return this.contactAddress;
    }

    public AskAdjudicationFileRequest setContactCity(String contactCity) {
        this.contactCity = contactCity;
        return this;
    }
    public String getContactCity() {
        return this.contactCity;
    }

    public AskAdjudicationFileRequest setContactCounty(String contactCounty) {
        this.contactCounty = contactCounty;
        return this;
    }
    public String getContactCounty() {
        return this.contactCounty;
    }

    public AskAdjudicationFileRequest setContactDistrict(String contactDistrict) {
        this.contactDistrict = contactDistrict;
        return this;
    }
    public String getContactDistrict() {
        return this.contactDistrict;
    }

    public AskAdjudicationFileRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public AskAdjudicationFileRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public AskAdjudicationFileRequest setContactProvince(String contactProvince) {
        this.contactProvince = contactProvince;
        return this;
    }
    public String getContactProvince() {
        return this.contactProvince;
    }

}
