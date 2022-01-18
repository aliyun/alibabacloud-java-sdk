// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeApplicationScalingRuleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRuleResponseBody self = new DescribeApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRuleResponseBody setData(DescribeApplicationScalingRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationScalingRuleResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationScalingRuleResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricMetrics extends TeaModel {
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        @NameInMap("MetricType")
        public String metricType;

        public static DescribeApplicationScalingRuleResponseBodyDataMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataMetricMetrics self = new DescribeApplicationScalingRuleResponseBodyDataMetricMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics extends TeaModel {
        @NameInMap("CurrentValue")
        public Long currentValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics self = new DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics setCurrentValue(Long currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public Long getCurrentValue() {
            return this.currentValue;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NextScaleInAverageUtilization")
        public Integer nextScaleInAverageUtilization;

        @NameInMap("NextScaleOutAverageUtilization")
        public Integer nextScaleOutAverageUtilization;

        public static DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics self = new DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics setNextScaleInAverageUtilization(Integer nextScaleInAverageUtilization) {
            this.nextScaleInAverageUtilization = nextScaleInAverageUtilization;
            return this;
        }
        public Integer getNextScaleInAverageUtilization() {
            return this.nextScaleInAverageUtilization;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics setNextScaleOutAverageUtilization(Integer nextScaleOutAverageUtilization) {
            this.nextScaleOutAverageUtilization = nextScaleOutAverageUtilization;
            return this;
        }
        public Integer getNextScaleOutAverageUtilization() {
            return this.nextScaleOutAverageUtilization;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus extends TeaModel {
        @NameInMap("CurrentMetrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics> currentMetrics;

        @NameInMap("CurrentReplicas")
        public Long currentReplicas;

        @NameInMap("DesiredReplicas")
        public Long desiredReplicas;

        @NameInMap("LastScaleTime")
        public String lastScaleTime;

        @NameInMap("NextScaleMetrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics> nextScaleMetrics;

        @NameInMap("NextScaleTimePeriod")
        public Integer nextScaleTimePeriod;

        public static DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus self = new DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus setCurrentMetrics(java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics> getCurrentMetrics() {
            return this.currentMetrics;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus setCurrentReplicas(Long currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }
        public Long getCurrentReplicas() {
            return this.currentReplicas;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus setDesiredReplicas(Long desiredReplicas) {
            this.desiredReplicas = desiredReplicas;
            return this;
        }
        public Long getDesiredReplicas() {
            return this.desiredReplicas;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus setLastScaleTime(String lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }
        public String getLastScaleTime() {
            return this.lastScaleTime;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus setNextScaleMetrics(java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics> nextScaleMetrics) {
            this.nextScaleMetrics = nextScaleMetrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics> getNextScaleMetrics() {
            return this.nextScaleMetrics;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus setNextScaleTimePeriod(Integer nextScaleTimePeriod) {
            this.nextScaleTimePeriod = nextScaleTimePeriod;
            return this;
        }
        public Integer getNextScaleTimePeriod() {
            return this.nextScaleTimePeriod;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules extends TeaModel {
        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        @NameInMap("Step")
        public Long step;

        public static DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules self = new DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules setStabilizationWindowSeconds(Long stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Long getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules extends TeaModel {
        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        @NameInMap("Step")
        public Long step;

        public static DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules self = new DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules setStabilizationWindowSeconds(Long stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Long getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetric extends TeaModel {
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        @NameInMap("MetricsStatus")
        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus metricsStatus;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        @NameInMap("ScaleDownRules")
        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules scaleDownRules;

        @NameInMap("ScaleUpRules")
        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules scaleUpRules;

        public static DescribeApplicationScalingRuleResponseBodyDataMetric build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataMetric self = new DescribeApplicationScalingRuleResponseBodyDataMetric();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetric setMetrics(java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetric setMetricsStatus(DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus metricsStatus) {
            this.metricsStatus = metricsStatus;
            return this;
        }
        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus getMetricsStatus() {
            return this.metricsStatus;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetric setScaleDownRules(DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules scaleDownRules) {
            this.scaleDownRules = scaleDownRules;
            return this;
        }
        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules getScaleDownRules() {
            return this.scaleDownRules;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetric setScaleUpRules(DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules scaleUpRules) {
            this.scaleUpRules = scaleUpRules;
            return this;
        }
        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleUpRules getScaleUpRules() {
            return this.scaleUpRules;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataTimerSchedules extends TeaModel {
        @NameInMap("AtTime")
        public String atTime;

        @NameInMap("TargetReplicas")
        public Integer targetReplicas;

        public static DescribeApplicationScalingRuleResponseBodyDataTimerSchedules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataTimerSchedules self = new DescribeApplicationScalingRuleResponseBodyDataTimerSchedules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataTimerSchedules setAtTime(String atTime) {
            this.atTime = atTime;
            return this;
        }
        public String getAtTime() {
            return this.atTime;
        }

        public DescribeApplicationScalingRuleResponseBodyDataTimerSchedules setTargetReplicas(Integer targetReplicas) {
            this.targetReplicas = targetReplicas;
            return this;
        }
        public Integer getTargetReplicas() {
            return this.targetReplicas;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataTimer extends TeaModel {
        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Period")
        public String period;

        @NameInMap("Schedules")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataTimerSchedules> schedules;

        public static DescribeApplicationScalingRuleResponseBodyDataTimer build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyDataTimer self = new DescribeApplicationScalingRuleResponseBodyDataTimer();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyDataTimer setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public DescribeApplicationScalingRuleResponseBodyDataTimer setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeApplicationScalingRuleResponseBodyDataTimer setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeApplicationScalingRuleResponseBodyDataTimer setSchedules(java.util.List<DescribeApplicationScalingRuleResponseBodyDataTimerSchedules> schedules) {
            this.schedules = schedules;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataTimerSchedules> getSchedules() {
            return this.schedules;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        @NameInMap("Metric")
        public DescribeApplicationScalingRuleResponseBodyDataMetric metric;

        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Timer")
        public DescribeApplicationScalingRuleResponseBodyDataTimer timer;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeApplicationScalingRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRuleResponseBodyData self = new DescribeApplicationScalingRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRuleResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationScalingRuleResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationScalingRuleResponseBodyData setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public DescribeApplicationScalingRuleResponseBodyData setMetric(DescribeApplicationScalingRuleResponseBodyDataMetric metric) {
            this.metric = metric;
            return this;
        }
        public DescribeApplicationScalingRuleResponseBodyDataMetric getMetric() {
            return this.metric;
        }

        public DescribeApplicationScalingRuleResponseBodyData setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public DescribeApplicationScalingRuleResponseBodyData setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public DescribeApplicationScalingRuleResponseBodyData setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public DescribeApplicationScalingRuleResponseBodyData setTimer(DescribeApplicationScalingRuleResponseBodyDataTimer timer) {
            this.timer = timer;
            return this;
        }
        public DescribeApplicationScalingRuleResponseBodyDataTimer getTimer() {
            return this.timer;
        }

        public DescribeApplicationScalingRuleResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
