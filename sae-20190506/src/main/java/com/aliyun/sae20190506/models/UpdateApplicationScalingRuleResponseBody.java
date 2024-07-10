// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public UpdateApplicationScalingRuleResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <ul>
     * <li>If the call is successful, <strong>ErrorCode</strong> is not returned.</li>
     * <li>If the call fails, <strong>ErrorCode</strong> is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Take note of the following rules:</p>
     * <ul>
     * <li>If the call is successful, <strong>success</strong> is returned.</li>
     * <li>If the call fails, an error code is returned.</li>
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
     * <p>Specifies whether the instances are successfully restarted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
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
         * <p>The limit on the metric.</p>
         * <ul>
         * <li>The limit on the CPU utilization. Unit: percentage.</li>
         * <li>The limit on the memory usage. Unit: percentage.</li>
         * <li>The limit on the average number of active TCP connections per second.</li>
         * <li>The limit on the QPS of the Internet-facing SLB instance.</li>
         * <li>The limit on the response time of the Internet-facing SLB instance. Unit: milliseconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <p>The metric that is used to trigger the auto scaling policy. Valid values:</p>
         * <ul>
         * <li><strong>CPU</strong>: the CPU utilization.</li>
         * <li><strong>MEMORY</strong>: the memory usage.</li>
         * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections of an application instance within 30 seconds.</li>
         * <li><strong>SLB_QPS</strong>: the average QPS of the Internet-facing SLB instance associated with an application instance within 15 seconds.</li>
         * <li><strong>SLB_RT</strong>: the average response time of the Internet-facing SLB instance within 15 seconds.</li>
         * </ul>
         * 
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
         * <p>The metrics that are used to trigger the auto scaling policy.</p>
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
         * <p>The point in time. Format: <strong>Hour:Minute</strong>.</p>
         * 
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
         * <p>The expected number of instances.</p>
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
         * <p>The start date of the validity period of the scheduled auto scaling policy. Parameter description:</p>
         * <ul>
         * <li>If <strong>BeginDate</strong> and <strong>EndDate</strong> are set to <strong>null</strong>, the auto scaling policy is a long-term policy. Default values of the beginDate and endDate parameters: null.</li>
         * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the auto scaling policy is valid for one month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the validity period of the scheduled auto scaling policy. Take note of the following rules:</p>
         * <ul>
         * <li>If <strong>BeginDate</strong> and <strong>EndDate</strong> are set to <strong>null</strong>, the auto scaling policy is a long-term policy. Default values of the beginDate and endDate parameters: null.</li>
         * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the auto scaling policy is valid for one month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-04-25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The frequency at which the scheduled auto scaling policy is executed. Valid values:</p>
         * <ul>
         * <li><p><em><em>\</em> \</em> \***: The scheduled auto scaling policy is executed at a specified point in time every day.</p>
         * </li>
         * <li><p><em><em>\</em> \</em> Fri,Mon**: The scheduled auto scaling policy is executed at a specified point in time on one or more days of each week. GMT+8 is used. Valid values:</p>
         * <ul>
         * <li><strong>Sun</strong></li>
         * <li><strong>Mon</strong></li>
         * <li><strong>Tue</strong></li>
         * <li><strong>Wed</strong></li>
         * <li><strong>Thu</strong></li>
         * <li><strong>Fri</strong></li>
         * <li><strong>Sat</strong></li>
         * </ul>
         * </li>
         * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: The scheduled auto scaling policy is executed at a specified point in time on one or more days of each month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy is executed on the specified days other than the 31st day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The points in time at which the auto scaling policy is triggered within one day.</p>
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
         * <p>The time when the auto scaling policy was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the auto scaling policy was last disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1641882854484</p>
         */
        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        /**
         * <p>The details of the metric-based auto scaling policy.</p>
         */
        @NameInMap("Metric")
        public UpdateApplicationScalingRuleResponseBodyDataMetric metric;

        /**
         * <p>Specifies whether to enable the auto scaling policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The auto scaling policy is enabled.</li>
         * <li><strong>false</strong>: The auto scaling policy is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <p>The name of the auto scaling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        /**
         * <p>The type of the auto scaling policy. Valid values:</p>
         * <ul>
         * <li><strong>timing</strong>: a scheduled auto scaling policy</li>
         * <li><strong>metric</strong>: a metric-based auto scaling policy</li>
         * <li><strong>mix</strong>: a hybrid auto scaling policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>timing</p>
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
