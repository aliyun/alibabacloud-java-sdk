// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTradeMarkReviewMaterialDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Region")
    public Integer region;

    @NameInMap("Country")
    public String country;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactNumber")
    public String contactNumber;

    @NameInMap("ContactEmail")
    public String contactEmail;

    @NameInMap("ContactAddress")
    public String contactAddress;

    @NameInMap("LoaOssKey")
    public String loaOssKey;

    @NameInMap("Name")
    public String name;

    @NameInMap("CardNumber")
    public String cardNumber;

    @NameInMap("Province")
    public String province;

    @NameInMap("Address")
    public String address;

    @NameInMap("EngName")
    public String engName;

    @NameInMap("EngAddress")
    public String engAddress;

    @NameInMap("IdCardOssKey")
    public String idCardOssKey;

    @NameInMap("BusinessLicenceOssKey")
    public String businessLicenceOssKey;

    @NameInMap("PassportOssKey")
    public String passportOssKey;

    @NameInMap("LegalNoticeOssKey")
    public String legalNoticeOssKey;

    @NameInMap("ApplicationOssKey")
    public String applicationOssKey;

    @NameInMap("AdditionalOssKeyList")
    public java.util.Map<String, ?> additionalOssKeyList;

    @NameInMap("SubmitType")
    public Integer submitType;

    public static SaveTradeMarkReviewMaterialDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTradeMarkReviewMaterialDetailRequest self = new SaveTradeMarkReviewMaterialDetailRequest();
        return TeaModel.build(map, self);
    }

    public SaveTradeMarkReviewMaterialDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setRegion(Integer region) {
        this.region = region;
        return this;
    }
    public Integer getRegion() {
        return this.region;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public String getContactAddress() {
        return this.contactAddress;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setLoaOssKey(String loaOssKey) {
        this.loaOssKey = loaOssKey;
        return this;
    }
    public String getLoaOssKey() {
        return this.loaOssKey;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setEngName(String engName) {
        this.engName = engName;
        return this;
    }
    public String getEngName() {
        return this.engName;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setEngAddress(String engAddress) {
        this.engAddress = engAddress;
        return this;
    }
    public String getEngAddress() {
        return this.engAddress;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setIdCardOssKey(String idCardOssKey) {
        this.idCardOssKey = idCardOssKey;
        return this;
    }
    public String getIdCardOssKey() {
        return this.idCardOssKey;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setBusinessLicenceOssKey(String businessLicenceOssKey) {
        this.businessLicenceOssKey = businessLicenceOssKey;
        return this;
    }
    public String getBusinessLicenceOssKey() {
        return this.businessLicenceOssKey;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setPassportOssKey(String passportOssKey) {
        this.passportOssKey = passportOssKey;
        return this;
    }
    public String getPassportOssKey() {
        return this.passportOssKey;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setLegalNoticeOssKey(String legalNoticeOssKey) {
        this.legalNoticeOssKey = legalNoticeOssKey;
        return this;
    }
    public String getLegalNoticeOssKey() {
        return this.legalNoticeOssKey;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setApplicationOssKey(String applicationOssKey) {
        this.applicationOssKey = applicationOssKey;
        return this;
    }
    public String getApplicationOssKey() {
        return this.applicationOssKey;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setAdditionalOssKeyList(java.util.Map<String, ?> additionalOssKeyList) {
        this.additionalOssKeyList = additionalOssKeyList;
        return this;
    }
    public java.util.Map<String, ?> getAdditionalOssKeyList() {
        return this.additionalOssKeyList;
    }

    public SaveTradeMarkReviewMaterialDetailRequest setSubmitType(Integer submitType) {
        this.submitType = submitType;
        return this;
    }
    public Integer getSubmitType() {
        return this.submitType;
    }

}
