// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UpdateApplicationScalingRuleResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
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
         * <p>The limit on the metric.</p>
         * <br>
         * <p>*   The limit on the CPU utilization. Unit: percentage.</p>
         * <p>*   The limit on the memory usage. Unit: percentage.</p>
         * <p>*   The limit on the average number of active TCP connections per second.</p>
         * <p>*   The limit on the QPS of the Internet-facing SLB instance.</p>
         * <p>*   The limit on the response time of the Internet-facing SLB instance. Unit: milliseconds.</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <p>The metric that is used to trigger the auto scaling policy. Valid values:</p>
         * <br>
         * <p>*   **CPU**: the CPU utilization.</p>
         * <p>*   **MEMORY**: the memory usage.</p>
         * <p>*   **tcpActiveConn**: the average number of active TCP connections for an instance in 30 seconds.</p>
         * <p>*   **SLB_QPS**: the average QPS of the Internet-facing SLB instance associated with an application instance in 15 seconds.</p>
         * <p>*   **SLB_RT**: the average response time of the Internet-facing SLB instance in 15 seconds.</p>
         */
        @NameInMap("MetricType")
        public String metricType;

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

    }

    public static class UpdateApplicationScalingRuleResponseBodyDataMetric extends TeaModel {
        /**
         * <p>The maximum number of instances.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The list of metrics that are used to trigger the auto scaling policy.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<UpdateApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        /**
         * <p>The minimum number of instances.</p>
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
         * <p>The point in time. Format: **Hour:Minute**.</p>
         */
        @NameInMap("AtTime")
        public String atTime;

        /**
         * <p>The expected number of instances.</p>
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
         * <p>The start date of the validity period of the scheduled auto scaling policy. Parameter description:</p>
         * <br>
         * <p>*   If both the **BeginDate** and **EndDate** parameters are set to **null**, the auto scaling policy can always be triggered. The default value for these parameters is null.</p>
         * <p>*   If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if **BeginDate** is 2021-03-25 and **EndDate** is 2021-04-25, the auto scaling policy is valid for one month.</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the validity period of the scheduled auto scaling policy. Parameter description:</p>
         * <br>
         * <p>*   If both the **BeginDate** and **EndDate** parameters are set to **null**, the auto scaling policy can always be triggered. The default value for these parameters is null.</p>
         * <p>*   If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if **BeginDate** is 2021-03-25 and **EndDate** is 2021-04-25, the auto scaling policy is valid for one month.</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The days on which the scheduled auto scaling policy takes effect. Valid values:</p>
         * <br>
         * <p>*   **\* \* \***: The scheduled auto scaling policy takes effect at a specified time every day.</p>
         * <br>
         * <p>*   **\* \* Fri,Mon**: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a week. The specified time is in the GMT+8 time zone. Valid values:</p>
         * <br>
         * <p>    *   **Sun**: Sunday</p>
         * <p>    *   **Mon**: Monday</p>
         * <p>    *   **Tue**: Tuesday</p>
         * <p>    *   **Wed**: Wednesday</p>
         * <p>    *   **Thu**: Thursday</p>
         * <p>    *   **Fri**: Friday</p>
         * <p>    *   **Sat**: Saturday</p>
         * <br>
         * <p>*   **1,2,3,28,31 \* \***: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy takes effect on the specified days other than the 31st day.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The points in time when the auto scaling policy is triggered within one day.</p>
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
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the auto scaling policy was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the auto scaling policy was last disabled.</p>
         */
        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        /**
         * <p>The details of the metric-based auto scaling policy.</p>
         */
        @NameInMap("Metric")
        public UpdateApplicationScalingRuleResponseBodyDataMetric metric;

        /**
         * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <p>The name of the auto scaling policy.</p>
         */
        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        /**
         * <p>The type of the auto scaling policy. Valid values:</p>
         * <br>
         * <p>*   **timing**: the scheduled auto scaling policy.</p>
         * <p>*   **metric**: the metric-based auto scaling policy.</p>
         * <p>*   **mix**: the hybrid auto scaling policy.</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The details of the scheduled auto scaling policy.</p>
         */
        @NameInMap("Timer")
        public UpdateApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <p>The time when the auto scaling policy was updated. Unit: milliseconds.</p>
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
