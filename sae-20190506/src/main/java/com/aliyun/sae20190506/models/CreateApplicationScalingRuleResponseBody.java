// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: success.</li>
     * <li><strong>3xx</strong>: redirection.</li>
     * <li><strong>4xx</strong>: request error.</li>
     * <li><strong>5xx</strong>: server error.</li>
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
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InstanceExist.ScalingRuleName</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li>If the request is normal, <strong>success</strong> is returned.</li>
     * <li>If the request is abnormal, a specific error code is returned.</li>
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
     * <p>Indicates whether the application instance is restarted successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: restarted successfully.</li>
     * <li><strong>false</strong>: failed to restart.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to accurately query the call information.</p>
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
         * <p>The target value of the monitoring metric.</p>
         * <ul>
         * <li>Target CPU utilization, in percentage.</li>
         * <li>Target memory utilization, in percentage.</li>
         * <li>QPS.</li>
         * <li>Response time, in milliseconds.</li>
         * <li>Average number of active TCP connections, in connections per second.</li>
         * <li>Public-Internet-facing SLB QPS.</li>
         * <li>Public-Internet-facing SLB response time, in milliseconds.</li>
         * <li>Private network SLB QPS.</li>
         * <li>Private network SLB response time, in milliseconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <p>The trigger condition for the monitoring metric. Valid values:</p>
         * <ul>
         * <li><strong>CPU</strong>: CPU utilization.</li>
         * <li><strong>MEMORY</strong>: memory utilization.</li>
         * <li><strong>QPS</strong>: the average QPS of a single instance of a Java application within 1 minute.</li>
         * <li><strong>RT</strong>: the average RT of all service interfaces of a Java application within 1 minute.</li>
         * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections of a single instance within 30 seconds.</li>
         * <li><strong>SLB_QPS</strong>: the average public-Internet-facing SLB QPS of a single instance within 15 seconds.</li>
         * <li><strong>SLB_RT</strong>: the average public-Internet-facing SLB response time within 15 seconds.</li>
         * <li><strong>INTRANET_SLB_QPS</strong>: the average private network SLB QPS of a single instance within 15 seconds.</li>
         * <li><strong>INTRANET_SLB_RT</strong>: the average private network SLB response time within 15 seconds.</li>
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
         * <p>The Simple Log Service Logstore for SLB access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbLogstore")
        public String slbLogstore;

        /**
         * <p>The Simple Log Service project for SLB access logs.</p>
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
         * <p>The maximum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The list of monitoring metric-based elastic scaling configurations.</p>
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
         * <p>The time point. Format: <strong>HH:mm</strong>.</p>
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
         * <p>The target number of instances.</p>
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
         * <p>The short-term start date of the scheduled elastic scaling policy.</p>
         * <ul>
         * <li>If both <strong>BeginDate</strong> and <strong>EndDate</strong> are <strong>null</strong>, the policy is executed on a long-term basis. This is the default value.</li>
         * <li>If specific dates are specified, for example, <strong>BeginDate</strong> is 2021-03-25 and <strong>EndDate</strong> is 2021-04-25, the validity period is one month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The short-term end date of the scheduled elastic scaling policy.</p>
         * <ul>
         * <li>If both <strong>BeginDate</strong> and <strong>EndDate</strong> are <strong>null</strong>, the policy is executed on a long-term basis. This is the default value.</li>
         * <li>If specific dates are specified, for example, <strong>BeginDate</strong> is 2021-03-25 and <strong>EndDate</strong> is 2021-04-25, the validity period is one month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-04-25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The epoch for executing the scheduled elastic scaling policy. Valid values:</p>
         * <ul>
         * <li><p><em><em>\</em> \</em> \***: executes the scheduled policy at the specified time every day.</p>
         * </li>
         * <li><p><em><em>\</em> \</em> Fri,Mon**: executes the scheduled policy at the specified time on the specified days of every week. Multiple days are supported. The time zone is GMT+8. Valid values: </p>
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
         * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: executes the scheduled policy at the specified time on the specified days of every month. Multiple days are supported. Valid values: [1,31\]. If the current month does not have the 31st day, the scheduled policy is skipped on that day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The trigger time points within a single day.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The creation time of the elastic scaling policy. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the idle mode is enabled.</p>
         */
        @NameInMap("EnableIdle")
        public Boolean enableIdle;

        /**
         * <p>The time when the elastic scaling policy was last disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1641882854484</p>
         */
        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        /**
         * <p>The monitoring metric-based elastic scaling configuration.</p>
         */
        @NameInMap("Metric")
        public CreateApplicationScalingRuleResponseBodyDataMetric metric;

        /**
         * <p>Indicates whether the elastic scaling policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <p>The name of the elastic scaling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        /**
         * <p>The type of the elastic scaling policy. Valid values:</p>
         * <ul>
         * <li><strong>timing</strong>: scheduled elastic scaling.</li>
         * <li><strong>metric</strong>: monitoring metric-based elastic scaling.</li>
         * <li><strong>mix</strong>: hybrid elastic scaling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>timing</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The scheduled elastic scaling configuration.</p>
         */
        @NameInMap("Timer")
        public CreateApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <p>The update time of the elastic scaling policy. Unit: milliseconds.</p>
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
