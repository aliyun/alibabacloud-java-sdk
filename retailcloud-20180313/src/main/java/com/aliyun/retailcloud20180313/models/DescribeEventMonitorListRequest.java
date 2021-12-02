// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeEventMonitorListRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("EventLevel")
    public String eventLevel;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PodName")
    public String podName;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeEventMonitorListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventMonitorListRequest self = new DescribeEventMonitorListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventMonitorListRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeEventMonitorListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeEventMonitorListRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public DescribeEventMonitorListRequest setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public String getEventLevel() {
        return this.eventLevel;
    }

    public DescribeEventMonitorListRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeEventMonitorListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeEventMonitorListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventMonitorListRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public DescribeEventMonitorListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
