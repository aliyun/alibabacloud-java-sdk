// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskMetricsRequest extends TeaModel {
    /**
     * <p>The cluster ID. Usage note: This parameter accepts only the ID of a training AIDB cluster created by calling CreateAIDBClusterTask. MaaS clusters with RunType set to maas are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2zejpr***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code> (UTC time).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric type. Valid values:</p>
     * <ul>
     * <li><code>all</code></li>
     * <li><code>train</code></li>
     * <li><code>eval</code></li>
     * </ul>
     * <blockquote>
     * <p>Default value: <em>all</em>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The page number of the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The instance ID of the associated PolarDB.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zejpr***</p>
     */
    @NameInMap("RelativeDBClusterId")
    public String relativeDBClusterId;

    /**
     * <p>Specifies whether to sort the results in descending order. Default value: <em>false</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The start time of the query. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code> (UTC time).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T14:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAIDBClusterTaskMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTaskMetricsRequest self = new DescribeAIDBClusterTaskMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTaskMetricsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAIDBClusterTaskMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAIDBClusterTaskMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeAIDBClusterTaskMetricsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAIDBClusterTaskMetricsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAIDBClusterTaskMetricsRequest setRelativeDBClusterId(String relativeDBClusterId) {
        this.relativeDBClusterId = relativeDBClusterId;
        return this;
    }
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    public DescribeAIDBClusterTaskMetricsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public DescribeAIDBClusterTaskMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
