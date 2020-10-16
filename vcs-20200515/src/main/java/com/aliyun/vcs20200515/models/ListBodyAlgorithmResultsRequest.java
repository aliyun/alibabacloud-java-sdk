// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListBodyAlgorithmResultsRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("AlgorithmType")
    @Validation(required = true)
    public String algorithmType;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("CapStyle")
    public String capStyle;

    public static ListBodyAlgorithmResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBodyAlgorithmResultsRequest self = new ListBodyAlgorithmResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListBodyAlgorithmResultsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListBodyAlgorithmResultsRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public ListBodyAlgorithmResultsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListBodyAlgorithmResultsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBodyAlgorithmResultsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBodyAlgorithmResultsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListBodyAlgorithmResultsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListBodyAlgorithmResultsRequest setCapStyle(String capStyle) {
        this.capStyle = capStyle;
        return this;
    }
    public String getCapStyle() {
        return this.capStyle;
    }

}
