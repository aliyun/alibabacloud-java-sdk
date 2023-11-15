// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CombineLoaRequest extends TeaModel {
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

    @NameInMap("TmNumber")
    public String tmNumber;

    @NameInMap("TmProduceType")
    public String tmProduceType;

    @NameInMap("TrademarkName")
    public String trademarkName;

    public static CombineLoaRequest build(java.util.Map<String, ?> map) throws Exception {
        CombineLoaRequest self = new CombineLoaRequest();
        return TeaModel.build(map, self);
    }

    public CombineLoaRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CombineLoaRequest setApplicantType(String applicantType) {
        this.applicantType = applicantType;
        return this;
    }
    public String getApplicantType() {
        return this.applicantType;
    }

    public CombineLoaRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CombineLoaRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public CombineLoaRequest setContactPostcode(String contactPostcode) {
        this.contactPostcode = contactPostcode;
        return this;
    }
    public String getContactPostcode() {
        return this.contactPostcode;
    }

    public CombineLoaRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public CombineLoaRequest setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public CombineLoaRequest setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public CombineLoaRequest setPersonalType(String personalType) {
        this.personalType = personalType;
        return this;
    }
    public String getPersonalType() {
        return this.personalType;
    }

    public CombineLoaRequest setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public CombineLoaRequest setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
        return this;
    }
    public String getTmNumber() {
        return this.tmNumber;
    }

    public CombineLoaRequest setTmProduceType(String tmProduceType) {
        this.tmProduceType = tmProduceType;
        return this;
    }
    public String getTmProduceType() {
        return this.tmProduceType;
    }

    public CombineLoaRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

}
