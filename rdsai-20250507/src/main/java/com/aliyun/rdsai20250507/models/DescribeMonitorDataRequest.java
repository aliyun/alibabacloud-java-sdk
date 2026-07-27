// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataRequest extends TeaModel {
    /**
     * <p>The API key name.</p>
     */
    @NameInMap("ApiKeyName")
    public java.util.List<String> apiKeyName;

    /**
     * <p>The end time. Format: Timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627269085</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The statistical period. Default value: 15s.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The metric to query.</p>
     * <ul>
     * <li><p>pv</p>
     * </li>
     * <li><p>uv</p>
     * </li>
     * <li><p>qps</p>
     * </li>
     * <li><p>success_rate</p>
     * </li>
     * <li><p>rt</p>
     * </li>
     * <li><p>rate_limited_count</p>
     * </li>
     * <li><p>tpm</p>
     * </li>
     * <li><p>cache</p>
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
     * <p>The start time. Format: Timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorDataRequest self = new DescribeMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorDataRequest setApiKeyName(java.util.List<String> apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public java.util.List<String> getApiKeyName() {
        return this.apiKeyName;
    }

    public DescribeMonitorDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeMonitorDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMonitorDataRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeMonitorDataRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeMonitorDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
