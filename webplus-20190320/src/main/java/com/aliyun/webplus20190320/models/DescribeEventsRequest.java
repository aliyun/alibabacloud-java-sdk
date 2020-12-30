// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ChangeId")
    public String changeId;

    @NameInMap("LastChangeEvents")
    public Boolean lastChangeEvents;

    @NameInMap("ReverseByTimestamp")
    public Boolean reverseByTimestamp;

    public static DescribeEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsRequest self = new DescribeEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DescribeEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsRequest setChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }
    public String getChangeId() {
        return this.changeId;
    }

    public DescribeEventsRequest setLastChangeEvents(Boolean lastChangeEvents) {
        this.lastChangeEvents = lastChangeEvents;
        return this;
    }
    public Boolean getLastChangeEvents() {
        return this.lastChangeEvents;
    }

    public DescribeEventsRequest setReverseByTimestamp(Boolean reverseByTimestamp) {
        this.reverseByTimestamp = reverseByTimestamp;
        return this;
    }
    public Boolean getReverseByTimestamp() {
        return this.reverseByTimestamp;
    }

}
