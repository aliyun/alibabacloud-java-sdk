// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataShrinkRequest extends TeaModel {
    @NameInMap("ApiKeyName")
    public String apiKeyNameShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627269085</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>● pv</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
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
