// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchObjectRequest extends TeaModel {
    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("Conditions")
    public java.util.Map<String, ?> conditions;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceList")
    public java.util.Map<String, ?> deviceList;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ImagePath")
    public java.util.Map<String, ?> imagePath;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("StartTime")
    public Long startTime;

    public static SearchObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectRequest self = new SearchObjectRequest();
        return TeaModel.build(map, self);
    }

    public SearchObjectRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public SearchObjectRequest setConditions(java.util.Map<String, ?> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.Map<String, ?> getConditions() {
        return this.conditions;
    }

    public SearchObjectRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchObjectRequest setDeviceList(java.util.Map<String, ?> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.Map<String, ?> getDeviceList() {
        return this.deviceList;
    }

    public SearchObjectRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchObjectRequest setImagePath(java.util.Map<String, ?> imagePath) {
        this.imagePath = imagePath;
        return this;
    }
    public java.util.Map<String, ?> getImagePath() {
        return this.imagePath;
    }

    public SearchObjectRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
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

    public SearchObjectRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public SearchObjectRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
