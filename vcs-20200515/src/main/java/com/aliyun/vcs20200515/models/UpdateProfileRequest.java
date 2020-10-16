// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateProfileRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("Name")
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

    @NameInMap("ProfileId")
    @Validation(required = true)
    public Long profileId;

    public static UpdateProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileRequest self = new UpdateProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProfileRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateProfileRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public UpdateProfileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProfileRequest setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

    public UpdateProfileRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public UpdateProfileRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public UpdateProfileRequest setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }
    public String getLiveAddress() {
        return this.liveAddress;
    }

    public UpdateProfileRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public UpdateProfileRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public UpdateProfileRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public UpdateProfileRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public UpdateProfileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateProfileRequest setProfileId(Long profileId) {
        this.profileId = profileId;
        return this;
    }
    public Long getProfileId() {
        return this.profileId;
    }

}
