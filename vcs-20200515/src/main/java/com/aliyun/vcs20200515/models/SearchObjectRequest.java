// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchObjectRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("ObjectType")
    @Validation(required = true)
    public String objectType;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("DeviceList")
    public java.util.Map<String, ?> deviceList;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("Conditions")
    public java.util.Map<String, ?> conditions;

    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("ImagePath")
    public java.util.Map<String, ?> imagePath;

    public static SearchObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectRequest self = new SearchObjectRequest();
        return TeaModel.build(map, self);
    }

    public SearchObjectRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchObjectRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public SearchObjectRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchObjectRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchObjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchObjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchObjectRequest setDeviceList(java.util.Map<String, ?> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.Map<String, ?> getDeviceList() {
        return this.deviceList;
    }

    public SearchObjectRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public SearchObjectRequest setConditions(java.util.Map<String, ?> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.Map<String, ?> getConditions() {
        return this.conditions;
    }

    public SearchObjectRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public SearchObjectRequest setImagePath(java.util.Map<String, ?> imagePath) {
        this.imagePath = imagePath;
        return this;
    }
    public java.util.Map<String, ?> getImagePath() {
        return this.imagePath;
    }

}
