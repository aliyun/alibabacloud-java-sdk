// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileListShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CatalogId")
    public Long catalogId;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("FaceImageId")
    public String faceImageId;

    @NameInMap("FaceUrl")
    public String faceUrl;

    @NameInMap("Gender")
    public Integer gender;

    @NameInMap("IdNumber")
    public String idNumber;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("LiveAddress")
    public String liveAddress;

    @NameInMap("MatchingRateThreshold")
    public String matchingRateThreshold;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PersonIdList")
    public String personIdListShrink;

    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("PlateNo")
    public String plateNo;

    @NameInMap("ProfileIdList")
    public String profileIdListShrink;

    @NameInMap("SceneType")
    public String sceneType;

    public static GetProfileListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProfileListShrinkRequest self = new GetProfileListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetProfileListShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetProfileListShrinkRequest setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

    public GetProfileListShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetProfileListShrinkRequest setFaceImageId(String faceImageId) {
        this.faceImageId = faceImageId;
        return this;
    }
    public String getFaceImageId() {
        return this.faceImageId;
    }

    public GetProfileListShrinkRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public GetProfileListShrinkRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public GetProfileListShrinkRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public GetProfileListShrinkRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public GetProfileListShrinkRequest setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }
    public String getLiveAddress() {
        return this.liveAddress;
    }

    public GetProfileListShrinkRequest setMatchingRateThreshold(String matchingRateThreshold) {
        this.matchingRateThreshold = matchingRateThreshold;
        return this;
    }
    public String getMatchingRateThreshold() {
        return this.matchingRateThreshold;
    }

    public GetProfileListShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProfileListShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetProfileListShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetProfileListShrinkRequest setPersonIdListShrink(String personIdListShrink) {
        this.personIdListShrink = personIdListShrink;
        return this;
    }
    public String getPersonIdListShrink() {
        return this.personIdListShrink;
    }

    public GetProfileListShrinkRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public GetProfileListShrinkRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public GetProfileListShrinkRequest setProfileIdListShrink(String profileIdListShrink) {
        this.profileIdListShrink = profileIdListShrink;
        return this;
    }
    public String getProfileIdListShrink() {
        return this.profileIdListShrink;
    }

    public GetProfileListShrinkRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
