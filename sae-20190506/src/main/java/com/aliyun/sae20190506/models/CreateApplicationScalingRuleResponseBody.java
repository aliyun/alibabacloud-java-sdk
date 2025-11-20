// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or the error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: The request was redirected.</li>
     * <li><strong>4xx</strong>: The request failed.</li>
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
    public CreateApplicationScalingRuleResponseBodyData data;

    /**
     * <p>The status code. Value values:</p>
     * <ul>
     * <li>If the request was successful, <strong>ErrorCode</strong> is not returned.</li>
     * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see <strong>Error codes</strong> in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned. The following limits are imposed on the ID:</p>
     * <ul>
     * <li>If the request was successful, <strong>success</strong> is returned.</li>
     * <li>An error code is returned when a request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application instances were restarted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The application instances were restarted.</li>
     * <li><strong>false</strong>: The application instances failed to be restarted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     * 
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
         * <p>The limit on the metric.</p>
         * <ul>
         * <li>The limit on the CPU utilization. Unit: percentage.</li>
         * <li>The limit on the memory usage. Unit: percentage.</li>
         * <li>The limit on the queries per second (QPS). Unit: seconds.</li>
         * <li>The limit on the response time. Unit: milliseconds.</li>
         * <li>The limit on the average number of active TCP connections per second.</li>
         * <li>The limit on the QPS of the Internet-facing SLB instance.</li>
         * <li>The limit on the response time of the Internet-facing SLB instance. Unit: milliseconds.</li>
         * <li>The limit on the QPS of the internal-facing SLB instance.</li>
         * <li>The limit on the response time of the internal-facing SLB instance. Unit: milliseconds.</li>
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
         * <li><strong>QPS</strong>: the average QPS within 1 minute per Java application instance.</li>
         * <li><strong>RT</strong>: the average response time of all API operations within 1 minute in the Java application.</li>
         * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections within 30 seconds per instance.</li>
         * <li><strong>SLB_QPS</strong>: the average QPS of the Internet-facing SLB instance within 15 seconds per instance.</li>
         * <li><strong>SLB_RT</strong>: the average response time of the Internet-facing SLB instance within 15 seconds.</li>
         * <li><strong>INTRANET_SLB_QPS</strong>: the average QPS of the internal-facing SLB instance within 15 seconds per instance.</li>
         * <li><strong>INTRANET_SLB_RT</strong>: the average response time of the internal-facing SLB instance within 15 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-xxx</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The Logstore that stores the SLB access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbLogstore")
        public String slbLogstore;

        /**
         * <p>The project that stores the SLB access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbProject")
        public String slbProject;

        /**
         * <p>The port number of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
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
         * <p>The maximum number of Elastic Compute Service (ECS) instances supported by the node pool.</p>
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
        public java.util.List<CreateApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        /**
         * <p>The minimum number of instances.</p>
         * 
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
         * <p>The point in time. Format: <strong>Hour:Minute</strong>.</p>
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
         * <p>5</p>
         */
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
         * <p>The start date of the validity period of the scheduled auto scaling policy.</p>
         * <ul>
         * <li><strong>null</strong> (default): If you set <strong>BeginDate</strong> and <strong>EndDate</strong> to null, the scheduled auto scaling policy can always be triggered.</li>
         * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the auto scaling policy is valid for one month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the validity period of the scheduled auto scaling policy.</p>
         * <ul>
         * <li><strong>null</strong> (default): If you set <strong>BeginDate</strong> and <strong>EndDate</strong> to null, the scheduled auto scaling policy can always be triggered.</li>
         * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the auto scaling policy is valid for one month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-04-25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The days on which the scheduled auto scaling policy takes effect. Valid values:</p>
         * <ul>
         * <li><p><em><em>\</em> \</em> \***: The scheduled auto scaling policy is executed at a specified point in time every day.</p>
         * </li>
         * <li><p><em><em>\</em> \</em> Fri,Mon**: The scheduled auto scaling policy is executed at a specified point in time on one or more days every week. The time must be in GMT+8. Valid values:</p>
         * <ul>
         * <li><strong>Sun</strong>: Sunday</li>
         * <li><strong>Mon</strong>: Monday</li>
         * <li><strong>Tue</strong>: Tuesday</li>
         * <li><strong>Wed</strong>: Wednesday</li>
         * <li><strong>Thu</strong>: Thursday</li>
         * <li><strong>Fri</strong>: Friday</li>
         * <li><strong>Sat</strong>: Saturday</li>
         * </ul>
         * </li>
         * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: The scheduled auto scaling policy is executed at a specified point in time on one or more dates of each month. Valid values: 1 to 31. If a month does not have the 31st day, the auto scaling policy is executed on the specified days other than the 31st day.</p>
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
         * <p>null</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>null null</p>
         * 
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnableIdle")
        public Boolean enableIdle;

        /**
         * <p>null</p>
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
        public CreateApplicationScalingRuleResponseBodyDataMetric metric;

        /**
         * <p>null null</p>
         * <ul>
         * <li><strong>null</strong></li>
         * <li><strong>null</strong></li>
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
         * <p>null null</p>
         * <ul>
         * <li><strong>null</strong></li>
         * <li><strong>metric</strong>: a metric-based auto scaling policy.</li>
         * <li><strong>mix</strong>: a hybrid auto scaling policy.</li>
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
        public CreateApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <p>null null</p>
         * 
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

        public CreateApplicationScalingRuleResponseBodyData setEnableIdle(Boolean enableIdle) {
            this.enableIdle = enableIdle;
            return this;
        }
        public Boolean getEnableIdle() {
            return this.enableIdle;
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
