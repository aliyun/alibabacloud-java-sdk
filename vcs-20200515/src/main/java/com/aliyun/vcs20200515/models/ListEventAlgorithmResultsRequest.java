// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmResultsRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("EventType")
    @Validation(required = true)
    public String eventType;

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

    @NameInMap("ExtendValue")
    public String extendValue;

    public static ListEventAlgorithmResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmResultsRequest self = new ListEventAlgorithmResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmResultsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListEventAlgorithmResultsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListEventAlgorithmResultsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListEventAlgorithmResultsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListEventAlgorithmResultsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListEventAlgorithmResultsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListEventAlgorithmResultsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListEventAlgorithmResultsRequest setExtendValue(String extendValue) {
        this.extendValue = extendValue;
        return this;
    }
    public String getExtendValue() {
        return this.extendValue;
    }

}
