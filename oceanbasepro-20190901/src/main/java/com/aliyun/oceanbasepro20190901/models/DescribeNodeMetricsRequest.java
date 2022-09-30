// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("NodeIdList")
    public String nodeIdList;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeNodeMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeMetricsRequest self = new DescribeNodeMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeNodeMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNodeMetricsRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeNodeMetricsRequest setNodeIdList(String nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }
    public String getNodeIdList() {
        return this.nodeIdList;
    }

    public DescribeNodeMetricsRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeNodeMetricsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNodeMetricsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNodeMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeNodeMetricsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
