// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmDetailsRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("EventValue")
    public String eventValue;

    @NameInMap("ExtendValue")
    public String extendValue;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("StartTime")
    public String startTime;

    public static ListEventAlgorithmDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmDetailsRequest self = new ListEventAlgorithmDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmDetailsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListEventAlgorithmDetailsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListEventAlgorithmDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListEventAlgorithmDetailsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListEventAlgorithmDetailsRequest setEventValue(String eventValue) {
        this.eventValue = eventValue;
        return this;
    }
    public String getEventValue() {
        return this.eventValue;
    }

    public ListEventAlgorithmDetailsRequest setExtendValue(String extendValue) {
        this.extendValue = extendValue;
        return this;
    }
    public String getExtendValue() {
        return this.extendValue;
    }

    public ListEventAlgorithmDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEventAlgorithmDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEventAlgorithmDetailsRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public ListEventAlgorithmDetailsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListEventAlgorithmDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
