// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchTargetRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TargetAttributes")
    public String targetAttributes;

    @NameInMap("TargetImageUrl")
    public String targetImageUrl;

    @NameInMap("TargetImageData")
    public String targetImageData;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("DeviceList")
    public String deviceList;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("SimilarityThreshold")
    public Double similarityThreshold;

    public static SearchTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTargetRequest self = new SearchTargetRequest();
        return TeaModel.build(map, self);
    }

    public SearchTargetRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchTargetRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchTargetRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchTargetRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public SearchTargetRequest setTargetAttributes(String targetAttributes) {
        this.targetAttributes = targetAttributes;
        return this;
    }
    public String getTargetAttributes() {
        return this.targetAttributes;
    }

    public SearchTargetRequest setTargetImageUrl(String targetImageUrl) {
        this.targetImageUrl = targetImageUrl;
        return this;
    }
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

    public SearchTargetRequest setTargetImageData(String targetImageData) {
        this.targetImageData = targetImageData;
        return this;
    }
    public String getTargetImageData() {
        return this.targetImageData;
    }

    public SearchTargetRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchTargetRequest setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public String getDeviceList() {
        return this.deviceList;
    }

    public SearchTargetRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SearchTargetRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public SearchTargetRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SearchTargetRequest setSimilarityThreshold(Double similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        return this;
    }
    public Double getSimilarityThreshold() {
        return this.similarityThreshold;
    }

}
