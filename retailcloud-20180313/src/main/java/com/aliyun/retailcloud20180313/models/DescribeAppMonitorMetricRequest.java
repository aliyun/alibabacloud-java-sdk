// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppMonitorMetricRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("DeployOrderId")
    public String deployOrderId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("PodName")
    public String podName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    public static DescribeAppMonitorMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppMonitorMetricRequest self = new DescribeAppMonitorMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppMonitorMetricRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppMonitorMetricRequest setDeployOrderId(String deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public String getDeployOrderId() {
        return this.deployOrderId;
    }

    public DescribeAppMonitorMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAppMonitorMetricRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public DescribeAppMonitorMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeAppMonitorMetricRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public DescribeAppMonitorMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAppMonitorMetricRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
