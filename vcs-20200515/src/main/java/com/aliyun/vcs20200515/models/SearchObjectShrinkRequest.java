// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchObjectShrinkRequest extends TeaModel {
    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("Conditions")
    public String conditionsShrink;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceList")
    public String deviceListShrink;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ImagePath")
    public String imagePathShrink;

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

    public static SearchObjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectShrinkRequest self = new SearchObjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchObjectShrinkRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public SearchObjectShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public SearchObjectShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchObjectShrinkRequest setDeviceListShrink(String deviceListShrink) {
        this.deviceListShrink = deviceListShrink;
        return this;
    }
    public String getDeviceListShrink() {
        return this.deviceListShrink;
    }

    public SearchObjectShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchObjectShrinkRequest setImagePathShrink(String imagePathShrink) {
        this.imagePathShrink = imagePathShrink;
        return this;
    }
    public String getImagePathShrink() {
        return this.imagePathShrink;
    }

    public SearchObjectShrinkRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public SearchObjectShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchObjectShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchObjectShrinkRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public SearchObjectShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
