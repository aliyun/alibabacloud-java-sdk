// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataShrinkRequest extends TeaModel {
    /**
     * <p>The names of the API keys to use for filtering the data. If this parameter is not specified, data from all keys is returned.</p>
     */
    @NameInMap("ApiKeyName")
    public String apiKeyNameShrink;

    /**
     * <p>The end of the query time range, specified as a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627269085</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The aggregation interval for monitoring data, in seconds. Default: 15.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The metric to query. Valid values:</p>
     * <ul>
     * <li><p><code>pv</code></p>
     * </li>
     * <li><p><code>uv</code></p>
     * </li>
     * <li><p><code>qps</code></p>
     * </li>
     * <li><p><code>success_rate</code></p>
     * </li>
     * <li><p><code>rt</code></p>
     * </li>
     * <li><p><code>rate_limited_count</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>● pv</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The start of the query time range, specified as a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeMonitorDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorDataShrinkRequest self = new DescribeMonitorDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorDataShrinkRequest setApiKeyNameShrink(String apiKeyNameShrink) {
        this.apiKeyNameShrink = apiKeyNameShrink;
        return this;
    }
    public String getApiKeyNameShrink() {
        return this.apiKeyNameShrink;
    }

    public DescribeMonitorDataShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeMonitorDataShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMonitorDataShrinkRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeMonitorDataShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeMonitorDataShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
