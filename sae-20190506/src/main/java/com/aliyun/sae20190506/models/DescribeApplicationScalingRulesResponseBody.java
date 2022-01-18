// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeApplicationScalingRulesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesResponseBody self = new DescribeApplicationScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesResponseBody setData(DescribeApplicationScalingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationScalingRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationScalingRulesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics extends TeaModel {
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        @NameInMap("MetricType")
        public String metricType;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics extends TeaModel {
        @NameInMap("CurrentValue")
        public Long currentValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics setCurrentValue(Long currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public Long getCurrentValue() {
            return this.currentValue;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NextScaleInAverageUtilization")
        public Integer nextScaleInAverageUtilization;

        @NameInMap("NextScaleOutAverageUtilization")
        public Integer nextScaleOutAverageUtilization;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics setNextScaleInAverageUtilization(Integer nextScaleInAverageUtilization) {
            this.nextScaleInAverageUtilization = nextScaleInAverageUtilization;
            return this;
        }
        public Integer getNextScaleInAverageUtilization() {
            return this.nextScaleInAverageUtilization;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics setNextScaleOutAverageUtilization(Integer nextScaleOutAverageUtilization) {
            this.nextScaleOutAverageUtilization = nextScaleOutAverageUtilization;
            return this;
        }
        public Integer getNextScaleOutAverageUtilization() {
            return this.nextScaleOutAverageUtilization;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus extends TeaModel {
        @NameInMap("CurrentMetrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics> currentMetrics;

        @NameInMap("CurrentReplicas")
        public Long currentReplicas;

        @NameInMap("DesiredReplicas")
        public Long desiredReplicas;

        @NameInMap("LastScaleTime")
        public String lastScaleTime;

        @NameInMap("MaxReplicas")
        public Long maxReplicas;

        @NameInMap("MinReplicas")
        public Long minReplicas;

        @NameInMap("NextScaleMetrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics> nextScaleMetrics;

        @NameInMap("NextScaleTimePeriod")
        public Integer nextScaleTimePeriod;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setCurrentMetrics(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics> getCurrentMetrics() {
            return this.currentMetrics;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setCurrentReplicas(Long currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }
        public Long getCurrentReplicas() {
            return this.currentReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setDesiredReplicas(Long desiredReplicas) {
            this.desiredReplicas = desiredReplicas;
            return this;
        }
        public Long getDesiredReplicas() {
            return this.desiredReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setLastScaleTime(String lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }
        public String getLastScaleTime() {
            return this.lastScaleTime;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setMaxReplicas(Long maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setMinReplicas(Long minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Long getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setNextScaleMetrics(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics> nextScaleMetrics) {
            this.nextScaleMetrics = nextScaleMetrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics> getNextScaleMetrics() {
            return this.nextScaleMetrics;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus setNextScaleTimePeriod(Integer nextScaleTimePeriod) {
            this.nextScaleTimePeriod = nextScaleTimePeriod;
            return this;
        }
        public Integer getNextScaleTimePeriod() {
            return this.nextScaleTimePeriod;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules extends TeaModel {
        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        @NameInMap("Step")
        public Long step;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules setStabilizationWindowSeconds(Long stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Long getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules extends TeaModel {
        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        @NameInMap("Step")
        public Long step;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules setStabilizationWindowSeconds(Long stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Long getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric extends TeaModel {
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics> metrics;

        @NameInMap("MetricsStatus")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus metricsStatus;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        @NameInMap("ScaleDownRules")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules scaleDownRules;

        @NameInMap("ScaleUpRules")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules scaleUpRules;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setMetrics(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setMetricsStatus(DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus metricsStatus) {
            this.metricsStatus = metricsStatus;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus getMetricsStatus() {
            return this.metricsStatus;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setScaleDownRules(DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules scaleDownRules) {
            this.scaleDownRules = scaleDownRules;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules getScaleDownRules() {
            return this.scaleDownRules;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setScaleUpRules(DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules scaleUpRules) {
            this.scaleUpRules = scaleUpRules;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleUpRules getScaleUpRules() {
            return this.scaleUpRules;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules extends TeaModel {
        @NameInMap("AtTime")
        public String atTime;

        @NameInMap("MaxReplicas")
        public Long maxReplicas;

        @NameInMap("MinReplicas")
        public Long minReplicas;

        @NameInMap("TargetReplicas")
        public Integer targetReplicas;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setAtTime(String atTime) {
            this.atTime = atTime;
            return this;
        }
        public String getAtTime() {
            return this.atTime;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setMaxReplicas(Long maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setMinReplicas(Long minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Long getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setTargetReplicas(Integer targetReplicas) {
            this.targetReplicas = targetReplicas;
            return this;
        }
        public Integer getTargetReplicas() {
            return this.targetReplicas;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer extends TeaModel {
        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Period")
        public String period;

        @NameInMap("Schedules")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules> schedules;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setSchedules(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules> schedules) {
            this.schedules = schedules;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules> getSchedules() {
            return this.schedules;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        @NameInMap("Metric")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric metric;

        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Timer")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer timer;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setMetric(DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric metric) {
            this.metric = metric;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric getMetric() {
            return this.metric;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setTimer(DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer timer) {
            this.timer = timer;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer getTimer() {
            return this.timer;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyData extends TeaModel {
        @NameInMap("ApplicationScalingRules")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> applicationScalingRules;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static DescribeApplicationScalingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyData self = new DescribeApplicationScalingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyData setApplicationScalingRules(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> applicationScalingRules) {
            this.applicationScalingRules = applicationScalingRules;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> getApplicationScalingRules() {
            return this.applicationScalingRules;
        }

        public DescribeApplicationScalingRulesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeApplicationScalingRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeApplicationScalingRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
