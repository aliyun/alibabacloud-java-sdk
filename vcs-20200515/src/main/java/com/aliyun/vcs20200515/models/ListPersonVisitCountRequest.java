// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonVisitCountRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("AggregateType")
    public String aggregateType;

    @NameInMap("TagCode")
    public String tagCode;

    @NameInMap("TimeAggregateType")
    public String timeAggregateType;

    @NameInMap("MinVal")
    public Integer minVal;

    @NameInMap("MaxVal")
    public Integer maxVal;

    @NameInMap("CountType")
    public String countType;

    public static ListPersonVisitCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersonVisitCountRequest self = new ListPersonVisitCountRequest();
        return TeaModel.build(map, self);
    }

    public ListPersonVisitCountRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListPersonVisitCountRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonVisitCountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersonVisitCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListPersonVisitCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListPersonVisitCountRequest setAggregateType(String aggregateType) {
        this.aggregateType = aggregateType;
        return this;
    }
    public String getAggregateType() {
        return this.aggregateType;
    }

    public ListPersonVisitCountRequest setTagCode(String tagCode) {
        this.tagCode = tagCode;
        return this;
    }
    public String getTagCode() {
        return this.tagCode;
    }

    public ListPersonVisitCountRequest setTimeAggregateType(String timeAggregateType) {
        this.timeAggregateType = timeAggregateType;
        return this;
    }
    public String getTimeAggregateType() {
        return this.timeAggregateType;
    }

    public ListPersonVisitCountRequest setMinVal(Integer minVal) {
        this.minVal = minVal;
        return this;
    }
    public Integer getMinVal() {
        return this.minVal;
    }

    public ListPersonVisitCountRequest setMaxVal(Integer maxVal) {
        this.maxVal = maxVal;
        return this;
    }
    public Integer getMaxVal() {
        return this.maxVal;
    }

    public ListPersonVisitCountRequest setCountType(String countType) {
        this.countType = countType;
        return this;
    }
    public String getCountType() {
        return this.countType;
    }

}
