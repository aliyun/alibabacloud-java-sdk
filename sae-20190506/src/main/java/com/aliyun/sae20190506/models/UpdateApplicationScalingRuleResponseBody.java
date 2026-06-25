// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or a POP error code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client-side error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server-side error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public UpdateApplicationScalingRuleResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is returned only if the request fails.</p>
     * </li>
     * <li><p>For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message.</p>
     * <ul>
     * <li><p><strong>success</strong> is returned if the request is successful.</p>
     * </li>
     * <li><p>An error message is returned if the request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query call details.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UpdateApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScalingRuleResponseBody self = new UpdateApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScalingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateApplicationScalingRuleResponseBody setData(UpdateApplicationScalingRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateApplicationScalingRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateApplicationScalingRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApplicationScalingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateApplicationScalingRuleResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpdateApplicationScalingRuleResponseBodyDataMetricMetrics extends TeaModel {
        /**
         * <p>The target value for the specified metric. The unit varies based on the metric type.</p>
         * <ul>
         * <li><p>Target CPU utilization, in percentage.</p>
         * </li>
         * <li><p>Target memory usage, in percentage.</p>
         * </li>
         * <li><p>Target queries per second (QPS).</p>
         * </li>
         * <li><p>Target response time, in milliseconds.</p>
         * </li>
         * <li><p>The target number of active TCP connections.</p>
         * </li>
         * <li><p>Target QPS for the public-facing SLB instance.</p>
         * </li>
         * <li><p>Target response time of the public-facing SLB instance, in milliseconds.</p>
         * </li>
         * <li><p>Target QPS for the internal SLB instance.</p>
         * </li>
         * <li><p>Target response time of the internal SLB instance, in milliseconds.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <p>The metric that triggers the scaling policy. Valid values:</p>
         * <ul>
         * <li><p><strong>CPU</strong>: CPU utilization.</p>
         * </li>
         * <li><p><strong>MEMORY</strong>: memory usage.</p>
         * </li>
         * <li><p><strong>QPS</strong>: The average queries per second (QPS) per instance over the last minute. This applies only to Java applications.</p>
         * </li>
         * <li><p><strong>RT</strong>: The average response time (RT) of all service interfaces in the application over the last minute. This applies only to Java applications.</p>
         * </li>
         * <li><p><strong>tcpActiveConn</strong>: The average number of active TCP connections per instance over the last 30 seconds.</p>
         * </li>
         * <li><p><strong>SLB_QPS</strong>: The average QPS from the public-facing SLB, per instance, over the last 15 seconds.</p>
         * </li>
         * <li><p><strong>SLB_RT</strong>: The average response time of a public-facing SLB instance over the last 15 seconds.</p>
         * </li>
         * <li><p><strong>INTRANET_SLB_QPS</strong>: The average QPS from the internal SLB, per instance, over the last 15 seconds.</p>
         * </li>
         * <li><p><strong>INTRANET_SLB_RT</strong>: The average response time of an internal SLB instance over the last 15 seconds.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The SLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-xxx</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The name of the Logstore for SLB access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbLogstore")
        public String slbLogstore;

        /**
         * <p>The name of the Log Service Project for SLB access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbProject")
        public String slbProject;

        /**
         * <p>The SLB port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Vport")
        public String vport;

        public static UpdateApplicationScalingRuleResponseBodyDataMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyDataMetricMetrics self = new UpdateApplicationScalingRuleResponseBodyDataMetricMetrics();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetricMetrics setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetricMetrics setSlbLogstore(String slbLogstore) {
            this.slbLogstore = slbLogstore;
            return this;
        }
        public String getSlbLogstore() {
            return this.slbLogstore;
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetricMetrics setSlbProject(String slbProject) {
            this.slbProject = slbProject;
            return this;
        }
        public String getSlbProject() {
            return this.slbProject;
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetricMetrics setVport(String vport) {
            this.vport = vport;
            return this;
        }
        public String getVport() {
            return this.vport;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyDataMetric extends TeaModel {
        /**
         * <p>The maximum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The metrics that trigger scaling actions.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<UpdateApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static UpdateApplicationScalingRuleResponseBodyDataMetric build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyDataMetric self = new UpdateApplicationScalingRuleResponseBodyDataMetric();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetric setMetrics(java.util.List<UpdateApplicationScalingRuleResponseBodyDataMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<UpdateApplicationScalingRuleResponseBodyDataMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public UpdateApplicationScalingRuleResponseBodyDataMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyDataTimerSchedules extends TeaModel {
        /**
         * <p>The time at which the scaling action is triggered. Format: <strong>HH:mm</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("AtTime")
        public String atTime;

        /**
         * <p>The maximum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>The target number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TargetReplicas")
        public Integer targetReplicas;

        public static UpdateApplicationScalingRuleResponseBodyDataTimerSchedules build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyDataTimerSchedules self = new UpdateApplicationScalingRuleResponseBodyDataTimerSchedules();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimerSchedules setAtTime(String atTime) {
            this.atTime = atTime;
            return this;
        }
        public String getAtTime() {
            return this.atTime;
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimerSchedules setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimerSchedules setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimerSchedules setTargetReplicas(Integer targetReplicas) {
            this.targetReplicas = targetReplicas;
            return this;
        }
        public Integer getTargetReplicas() {
            return this.targetReplicas;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyDataTimer extends TeaModel {
        /**
         * <p>The start date of the short-term scheduled scaling policy.</p>
         * <ul>
         * <li><p>If <strong>BeginDate</strong> and <strong>EndDate</strong> are both set to <strong>null</strong>, the policy is long-term by default.</p>
         * </li>
         * <li><p>If you specify a date range, for example, <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the policy is effective for one month.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the short-term scheduled scaling policy.</p>
         * <ul>
         * <li><p>If <strong>BeginDate</strong> and <strong>EndDate</strong> are both set to <strong>null</strong>, the policy is long-term by default.</p>
         * </li>
         * <li><p>If you specify a date range, for example, <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the policy is effective for one month.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-04-25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The recurrence schedule for the scaling policy.</p>
         * <ul>
         * <li><p><em><em>\</em> \</em> \***: The policy runs at a specified time every day.</p>
         * </li>
         * <li><p><em><em>\</em> \</em> Fri,Mon**: The policy runs at a specified time on specific days of a week. You can select multiple days. The time is in the GMT+8 time zone. Valid values:</p>
         * <ul>
         * <li><p><strong>Sun</strong>: Sunday</p>
         * </li>
         * <li><p><strong>Mon</strong>: Monday</p>
         * </li>
         * <li><p><strong>Tue</strong>: Tuesday</p>
         * </li>
         * <li><p><strong>Wed</strong>: Wednesday</p>
         * </li>
         * <li><p><strong>Thu</strong>: Thursday</p>
         * </li>
         * <li><p><strong>Fri</strong>: Friday</p>
         * </li>
         * <li><p><strong>Sat</strong>: Saturday</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: The policy runs at a specified time on specific days of a month. You can select multiple days. If a month does not have a specific day, such as the 31st, the policy skips that day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The schedules for the scaling policy.</p>
         */
        @NameInMap("Schedules")
        public java.util.List<UpdateApplicationScalingRuleResponseBodyDataTimerSchedules> schedules;

        public static UpdateApplicationScalingRuleResponseBodyDataTimer build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyDataTimer self = new UpdateApplicationScalingRuleResponseBodyDataTimer();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimer setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimer setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimer setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public UpdateApplicationScalingRuleResponseBodyDataTimer setSchedules(java.util.List<UpdateApplicationScalingRuleResponseBodyDataTimerSchedules> schedules) {
            this.schedules = schedules;
            return this;
        }
        public java.util.List<UpdateApplicationScalingRuleResponseBodyDataTimerSchedules> getSchedules() {
            return this.schedules;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the scaling policy was created, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether to enable idle mode.</p>
         */
        @NameInMap("EnableIdle")
        public Boolean enableIdle;

        /**
         * <p>The time when the scaling policy was last disabled, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1641882854484</p>
         */
        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        /**
         * <p>The configuration for metric-based scaling.</p>
         */
        @NameInMap("Metric")
        public UpdateApplicationScalingRuleResponseBodyDataMetric metric;

        /**
         * <p>Specifies whether the scaling policy is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <p>The name of the scaling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        /**
         * <p>The type of the scaling policy. Valid values:</p>
         * <ul>
         * <li><p><strong>timing</strong>: scheduled scaling</p>
         * </li>
         * <li><p><strong>metric</strong>: metric-based scaling</p>
         * </li>
         * <li><p><strong>mix</strong>: hybrid scaling</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>timing</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The configuration for scheduled scaling.</p>
         */
        @NameInMap("Timer")
        public UpdateApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <p>The time when the scaling policy was updated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static UpdateApplicationScalingRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyData self = new UpdateApplicationScalingRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateApplicationScalingRuleResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateApplicationScalingRuleResponseBodyData setEnableIdle(Boolean enableIdle) {
            this.enableIdle = enableIdle;
            return this;
        }
        public Boolean getEnableIdle() {
            return this.enableIdle;
        }

        public UpdateApplicationScalingRuleResponseBodyData setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public UpdateApplicationScalingRuleResponseBodyData setMetric(UpdateApplicationScalingRuleResponseBodyDataMetric metric) {
            this.metric = metric;
            return this;
        }
        public UpdateApplicationScalingRuleResponseBodyDataMetric getMetric() {
            return this.metric;
        }

        public UpdateApplicationScalingRuleResponseBodyData setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public UpdateApplicationScalingRuleResponseBodyData setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public UpdateApplicationScalingRuleResponseBodyData setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public UpdateApplicationScalingRuleResponseBodyData setTimer(UpdateApplicationScalingRuleResponseBodyDataTimer timer) {
            this.timer = timer;
            return this;
        }
        public UpdateApplicationScalingRuleResponseBodyDataTimer getTimer() {
            return this.timer;
        }

        public UpdateApplicationScalingRuleResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
