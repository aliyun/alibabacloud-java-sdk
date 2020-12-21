// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileListRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("Name")
    public String name;

    @NameInMap("CatalogId")
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

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PersonIdList")
    public java.util.Map<String, ?> personIdList;

    @NameInMap("ProfileIdList")
    public java.util.Map<String, ?> profileIdList;

    @NameInMap("MatchingRateThreshold")
    public String matchingRateThreshold;

    @NameInMap("FaceImageId")
    public String faceImageId;

    public static GetProfileListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProfileListRequest self = new GetProfileListRequest();
        return TeaModel.build(map, self);
    }

    public GetProfileListRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetProfileListRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public GetProfileListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProfileListRequest setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

    public GetProfileListRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public GetProfileListRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public GetProfileListRequest setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }
    public String getLiveAddress() {
        return this.liveAddress;
    }

    public GetProfileListRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public GetProfileListRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public GetProfileListRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public GetProfileListRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public GetProfileListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetProfileListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetProfileListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetProfileListRequest setPersonIdList(java.util.Map<String, ?> personIdList) {
        this.personIdList = personIdList;
        return this;
    }
    public java.util.Map<String, ?> getPersonIdList() {
        return this.personIdList;
    }

    public GetProfileListRequest setProfileIdList(java.util.Map<String, ?> profileIdList) {
        this.profileIdList = profileIdList;
        return this;
    }
    public java.util.Map<String, ?> getProfileIdList() {
        return this.profileIdList;
    }

    public GetProfileListRequest setMatchingRateThreshold(String matchingRateThreshold) {
        this.matchingRateThreshold = matchingRateThreshold;
        return this;
    }
    public String getMatchingRateThreshold() {
        return this.matchingRateThreshold;
    }

    public GetProfileListRequest setFaceImageId(String faceImageId) {
        this.faceImageId = faceImageId;
        return this;
    }
    public String getFaceImageId() {
        return this.faceImageId;
    }

}
