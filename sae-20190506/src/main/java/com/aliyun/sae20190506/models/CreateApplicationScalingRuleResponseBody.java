// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateApplicationScalingRuleResponseBodyData data;

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

    }

    public static class CreateApplicationScalingRuleResponseBodyDataMetric extends TeaModel {
        /**
         * <p>The maximum number of instances.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The list of metrics that are used to trigger the auto scaling policy.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<CreateApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        /**
         * <p>The minimum number of instances.</p>
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
         * <p>The point in time. Format: **Hour:Minute**.</p>
         */
        @NameInMap("AtTime")
        public String atTime;

        /**
         * <p>The expected number of instances.</p>
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
         * <p>The start date of the validity period of the scheduled auto scaling policy.</p>
         * <br>
         * <p>*   If both the **BeginDate** and **EndDate** parameters are set to **null**, the auto scaling policy can always be triggered. The default value for these parameters is null.</p>
         * <p>*   If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if **BeginDate** is 2021-03-25 and **EndDate** is 2021-04-25, the auto scaling policy is valid for one month.</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the validity period of the scheduled auto scaling policy.</p>
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
        public CreateApplicationScalingRuleResponseBodyDataMetric metric;

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
        public CreateApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <p>The time when the auto scaling policy was updated. Unit: milliseconds.</p>
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
