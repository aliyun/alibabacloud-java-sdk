// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMetricsRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("TagCode")
    @Validation(required = true)
    public String tagCode;

    @NameInMap("AggregateType")
    @Validation(required = true)
    public String aggregateType;

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

    public static ListMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsRequest self = new ListMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListMetricsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListMetricsRequest setTagCode(String tagCode) {
        this.tagCode = tagCode;
        return this;
    }
    public String getTagCode() {
        return this.tagCode;
    }

    public ListMetricsRequest setAggregateType(String aggregateType) {
        this.aggregateType = aggregateType;
        return this;
    }
    public String getAggregateType() {
        return this.aggregateType;
    }

    public ListMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListMetricsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListMetricsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
