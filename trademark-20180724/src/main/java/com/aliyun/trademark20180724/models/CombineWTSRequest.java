// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CombineWTSRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Contact")
    public String contact;

    @NameInMap("ContactAddressPost")
    public String contactAddressPost;

    @NameInMap("ContactMobile")
    public String contactMobile;

    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("MaterialName")
    public String materialName;

    @NameInMap("Nationality")
    public String nationality;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("TmNum")
    public String tmNum;

    @NameInMap("TmProduceType")
    public String tmProduceType;

    @NameInMap("TrademarkName")
    public String trademarkName;

    @NameInMap("WtsType")
    public String wtsType;

    public static CombineWTSRequest build(java.util.Map<String, ?> map) throws Exception {
        CombineWTSRequest self = new CombineWTSRequest();
        return TeaModel.build(map, self);
    }

    public CombineWTSRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CombineWTSRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public CombineWTSRequest setContactAddressPost(String contactAddressPost) {
        this.contactAddressPost = contactAddressPost;
        return this;
    }
    public String getContactAddressPost() {
        return this.contactAddressPost;
    }

    public CombineWTSRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public CombineWTSRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public CombineWTSRequest setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public CombineWTSRequest setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public CombineWTSRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public CombineWTSRequest setTmNum(String tmNum) {
        this.tmNum = tmNum;
        return this;
    }
    public String getTmNum() {
        return this.tmNum;
    }

    public CombineWTSRequest setTmProduceType(String tmProduceType) {
        this.tmProduceType = tmProduceType;
        return this;
    }
    public String getTmProduceType() {
        return this.tmProduceType;
    }

    public CombineWTSRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public CombineWTSRequest setWtsType(String wtsType) {
        this.wtsType = wtsType;
        return this;
    }
    public String getWtsType() {
        return this.wtsType;
    }

}
