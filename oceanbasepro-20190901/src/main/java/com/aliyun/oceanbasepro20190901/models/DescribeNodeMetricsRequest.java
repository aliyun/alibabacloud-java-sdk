// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsRequest extends TeaModel {
    // 参数历史查看的结束时间。
    @NameInMap("EndTime")
    public String endTime;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 监控指标
    @NameInMap("Metrics")
    public String metrics;

    // 节点列表
    @NameInMap("NodeIdList")
    public String nodeIdList;

    // 节点名称
    @NameInMap("NodeName")
    public String nodeName;

    // 分页查询的页码。 起始值：1 默认值：1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。 最大值：100 默认值：10
    @NameInMap("PageSize")
    public Integer pageSize;

    // 参数历史查看的起始时间。
    @NameInMap("StartTime")
    public String startTime;

    // 租户ID。
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
