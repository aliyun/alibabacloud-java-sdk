// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateApplicationScalingRuleResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static CreateApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationScalingRuleResponseBody self = new CreateApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationScalingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateApplicationScalingRuleResponseBody setData(CreateApplicationScalingRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateApplicationScalingRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateApplicationScalingRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationScalingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateApplicationScalingRuleResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateApplicationScalingRuleResponseBodyDataMetricMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbLogstore")
        public String slbLogstore;

        @NameInMap("SlbProject")
        public String slbProject;

        @NameInMap("Vport")
        public String vport;

        public static CreateApplicationScalingRuleResponseBodyDataMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyDataMetricMetrics self = new CreateApplicationScalingRuleResponseBodyDataMetricMetrics();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyDataMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public CreateApplicationScalingRuleResponseBodyDataMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public CreateApplicationScalingRuleResponseBodyDataMetricMetrics setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public CreateApplicationScalingRuleResponseBodyDataMetricMetrics setSlbLogstore(String slbLogstore) {
            this.slbLogstore = slbLogstore;
            return this;
        }
        public String getSlbLogstore() {
            return this.slbLogstore;
        }

        public CreateApplicationScalingRuleResponseBodyDataMetricMetrics setSlbProject(String slbProject) {
            this.slbProject = slbProject;
            return this;
        }
        public String getSlbProject() {
            return this.slbProject;
        }

        public CreateApplicationScalingRuleResponseBodyDataMetricMetrics setVport(String vport) {
            this.vport = vport;
            return this;
        }
        public String getVport() {
            return this.vport;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyDataMetric extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metrics")
        public java.util.List<CreateApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static CreateApplicationScalingRuleResponseBodyDataMetric build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyDataMetric self = new CreateApplicationScalingRuleResponseBodyDataMetric();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyDataMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyDataMetric setMetrics(java.util.List<CreateApplicationScalingRuleResponseBodyDataMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<CreateApplicationScalingRuleResponseBodyDataMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public CreateApplicationScalingRuleResponseBodyDataMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyDataTimerSchedules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("AtTime")
        public String atTime;

        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TargetReplicas")
        public Integer targetReplicas;

        public static CreateApplicationScalingRuleResponseBodyDataTimerSchedules build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyDataTimerSchedules self = new CreateApplicationScalingRuleResponseBodyDataTimerSchedules();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyDataTimerSchedules setAtTime(String atTime) {
            this.atTime = atTime;
            return this;
        }
        public String getAtTime() {
            return this.atTime;
        }

        public CreateApplicationScalingRuleResponseBodyDataTimerSchedules setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyDataTimerSchedules setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyDataTimerSchedules setTargetReplicas(Integer targetReplicas) {
            this.targetReplicas = targetReplicas;
            return this;
        }
        public Integer getTargetReplicas() {
            return this.targetReplicas;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyDataTimer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <strong>example:</strong>
         * <p>2021-04-25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Period")
        public String period;

        @NameInMap("Schedules")
        public java.util.List<CreateApplicationScalingRuleResponseBodyDataTimerSchedules> schedules;

        public static CreateApplicationScalingRuleResponseBodyDataTimer build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyDataTimer self = new CreateApplicationScalingRuleResponseBodyDataTimer();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyDataTimer setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public CreateApplicationScalingRuleResponseBodyDataTimer setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public CreateApplicationScalingRuleResponseBodyDataTimer setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public CreateApplicationScalingRuleResponseBodyDataTimer setSchedules(java.util.List<CreateApplicationScalingRuleResponseBodyDataTimerSchedules> schedules) {
            this.schedules = schedules;
            return this;
        }
        public java.util.List<CreateApplicationScalingRuleResponseBodyDataTimerSchedules> getSchedules() {
            return this.schedules;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1641882854484</p>
         */
        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        @NameInMap("Metric")
        public CreateApplicationScalingRuleResponseBodyDataMetric metric;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        /**
         * <strong>example:</strong>
         * <p>timing</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Timer")
        public CreateApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static CreateApplicationScalingRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyData self = new CreateApplicationScalingRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateApplicationScalingRuleResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateApplicationScalingRuleResponseBodyData setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public CreateApplicationScalingRuleResponseBodyData setMetric(CreateApplicationScalingRuleResponseBodyDataMetric metric) {
            this.metric = metric;
            return this;
        }
        public CreateApplicationScalingRuleResponseBodyDataMetric getMetric() {
            return this.metric;
        }

        public CreateApplicationScalingRuleResponseBodyData setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public CreateApplicationScalingRuleResponseBodyData setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public CreateApplicationScalingRuleResponseBodyData setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public CreateApplicationScalingRuleResponseBodyData setTimer(CreateApplicationScalingRuleResponseBodyDataTimer timer) {
            this.timer = timer;
            return this;
        }
        public CreateApplicationScalingRuleResponseBodyDataTimer getTimer() {
            return this.timer;
        }

        public CreateApplicationScalingRuleResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
