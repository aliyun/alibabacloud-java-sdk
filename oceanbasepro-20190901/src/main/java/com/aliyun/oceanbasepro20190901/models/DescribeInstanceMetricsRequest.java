// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMetricsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FuzzyName")
    public Boolean fuzzyName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInstanceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMetricsRequest self = new DescribeInstanceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceMetricsRequest setFuzzyName(Boolean fuzzyName) {
        this.fuzzyName = fuzzyName;
        return this;
    }
    public Boolean getFuzzyName() {
        return this.fuzzyName;
    }

    public DescribeInstanceMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceMetricsRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceMetricsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceMetricsRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeInstanceMetricsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceMetricsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
