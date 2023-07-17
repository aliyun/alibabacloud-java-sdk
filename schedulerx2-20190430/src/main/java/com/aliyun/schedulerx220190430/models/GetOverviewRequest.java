// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetOverviewRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MetricType")
    public Integer metricType;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("Operate")
    public String operate;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOverviewRequest self = new GetOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetOverviewRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetOverviewRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetOverviewRequest setMetricType(Integer metricType) {
        this.metricType = metricType;
        return this;
    }
    public Integer getMetricType() {
        return this.metricType;
    }

    public GetOverviewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetOverviewRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GetOverviewRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public GetOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetOverviewRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
