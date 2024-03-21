// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckMaterialValidityRequest extends TeaModel {
    @NameInMap("BusinessLicenseOssKey")
    public String businessLicenseOssKey;

    @NameInMap("CardNumber")
    public String cardNumber;

    @NameInMap("IdCardName")
    public String idCardName;

    @NameInMap("IdCardNumber")
    public String idCardNumber;

    @NameInMap("IdCardOssKey")
    public String idCardOssKey;

    @NameInMap("MaterialId")
    public Long materialId;

    @NameInMap("MaterialRegion")
    public Integer materialRegion;

    @NameInMap("MaterialType")
    public Integer materialType;

    @NameInMap("Name")
    public String name;

    @NameInMap("PersonalType")
    public Long personalType;

    public static CheckMaterialValidityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMaterialValidityRequest self = new CheckMaterialValidityRequest();
        return TeaModel.build(map, self);
    }

    public CheckMaterialValidityRequest setBusinessLicenseOssKey(String businessLicenseOssKey) {
        this.businessLicenseOssKey = businessLicenseOssKey;
        return this;
    }
    public String getBusinessLicenseOssKey() {
        return this.businessLicenseOssKey;
    }

    public CheckMaterialValidityRequest setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public CheckMaterialValidityRequest setIdCardName(String idCardName) {
        this.idCardName = idCardName;
        return this;
    }
    public String getIdCardName() {
        return this.idCardName;
    }

    public CheckMaterialValidityRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public CheckMaterialValidityRequest setIdCardOssKey(String idCardOssKey) {
        this.idCardOssKey = idCardOssKey;
        return this;
    }
    public String getIdCardOssKey() {
        return this.idCardOssKey;
    }

    public CheckMaterialValidityRequest setMaterialId(Long materialId) {
        this.materialId = materialId;
        return this;
    }
    public Long getMaterialId() {
        return this.materialId;
    }

    public CheckMaterialValidityRequest setMaterialRegion(Integer materialRegion) {
        this.materialRegion = materialRegion;
        return this;
    }
    public Integer getMaterialRegion() {
        return this.materialRegion;
    }

    public CheckMaterialValidityRequest setMaterialType(Integer materialType) {
        this.materialType = materialType;
        return this;
    }
    public Integer getMaterialType() {
        return this.materialType;
    }

    public CheckMaterialValidityRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CheckMaterialValidityRequest setPersonalType(Long personalType) {
        this.personalType = personalType;
        return this;
    }
    public Long getPersonalType() {
        return this.personalType;
    }

}
