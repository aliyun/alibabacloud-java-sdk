// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("CatalogId")
    @Validation(required = true)
    public Long catalogId;

    @NameInMap("IdNumber")
    public String idNumber;

    @NameInMap("FaceUrl")
    public String faceUrl;

    @NameInMap("LiveAddress")
    public String liveAddress;

    @NameInMap("Gender")
    public Integer gender;

    @NameInMap("PlateNo")
    public String plateNo;

    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("SceneType")
    public String sceneType;

    @NameInMap("BizId")
    public String bizId;

    public static AddProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProfileRequest self = new AddProfileRequest();
        return TeaModel.build(map, self);
    }

    public AddProfileRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddProfileRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public AddProfileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddProfileRequest setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

    public AddProfileRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public AddProfileRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public AddProfileRequest setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }
    public String getLiveAddress() {
        return this.liveAddress;
    }

    public AddProfileRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public AddProfileRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public AddProfileRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public AddProfileRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public AddProfileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
