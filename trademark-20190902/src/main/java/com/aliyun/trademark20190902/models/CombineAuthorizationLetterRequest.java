// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CombineAuthorizationLetterRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("ApplicantType")
    public String applicantType;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactPhone")
    public String contactPhone;

    @NameInMap("ContactPostcode")
    public String contactPostcode;

    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("MaterialName")
    public String materialName;

    @NameInMap("Nationality")
    public String nationality;

    @NameInMap("PersonalType")
    public String personalType;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("TmProduceType")
    public String tmProduceType;

    @NameInMap("TrademarkName")
    public String trademarkName;

    public static CombineAuthorizationLetterRequest build(java.util.Map<String, ?> map) throws Exception {
        CombineAuthorizationLetterRequest self = new CombineAuthorizationLetterRequest();
        return TeaModel.build(map, self);
    }

    public CombineAuthorizationLetterRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CombineAuthorizationLetterRequest setApplicantType(String applicantType) {
        this.applicantType = applicantType;
        return this;
    }
    public String getApplicantType() {
        return this.applicantType;
    }

    public CombineAuthorizationLetterRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CombineAuthorizationLetterRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public CombineAuthorizationLetterRequest setContactPostcode(String contactPostcode) {
        this.contactPostcode = contactPostcode;
        return this;
    }
    public String getContactPostcode() {
        return this.contactPostcode;
    }

    public CombineAuthorizationLetterRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public CombineAuthorizationLetterRequest setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public CombineAuthorizationLetterRequest setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public CombineAuthorizationLetterRequest setPersonalType(String personalType) {
        this.personalType = personalType;
        return this;
    }
    public String getPersonalType() {
        return this.personalType;
    }

    public CombineAuthorizationLetterRequest setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public CombineAuthorizationLetterRequest setTmProduceType(String tmProduceType) {
        this.tmProduceType = tmProduceType;
        return this;
    }
    public String getTmProduceType() {
        return this.tmProduceType;
    }

    public CombineAuthorizationLetterRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

}
