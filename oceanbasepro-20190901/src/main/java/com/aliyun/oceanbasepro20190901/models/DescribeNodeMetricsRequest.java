// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsRequest extends TeaModel {
    /**
     * <p>$.parameters[7].schema.description</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-13T15:40:43Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>$.parameters[7].schema.enumValueTitles</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tps</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>$.parameters[10].schema.description</p>
     * 
     * <strong>example:</strong>
     * <p>[i-bp16niirq4zdmgvm****,i-bp16n56hq4z4fgvm****]</p>
     */
    @NameInMap("NodeIdList")
    public String nodeIdList;

    /**
     * <p>$.parameters[8].schema.example</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp16niirq4zdmgvm****</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>$.parameters[6].schema.description</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>$.parameters[9].schema.example</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13T15:40:43Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>$.parameters[6].schema.enumValueTitles</p>
     * 
     * <strong>example:</strong>
     * <p>tfafd34fs****</p>
     */
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
