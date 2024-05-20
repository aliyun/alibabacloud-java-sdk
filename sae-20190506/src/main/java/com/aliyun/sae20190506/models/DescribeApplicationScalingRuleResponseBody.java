// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationScalingRuleResponseBodyData data;

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

    public static DescribeApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRuleResponseBody self = new DescribeApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationScalingRuleResponseBody setData(DescribeApplicationScalingRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationScalingRuleResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationScalingRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationScalingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationScalingRuleResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricMetrics extends TeaModel {
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

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbLogstore")
        public String slbLogstore;

        @NameInMap("SlbProject")
        public String slbProject;

        @NameInMap("Vport")
        public String vport;

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

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetrics setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetrics setSlbLogstore(String slbLogstore) {
            this.slbLogstore = slbLogstore;
            return this;
        }
        public String getSlbLogstore() {
            return this.slbLogstore;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetrics setSlbProject(String slbProject) {
            this.slbProject = slbProject;
            return this;
        }
        public String getSlbProject() {
            return this.slbProject;
        }

        public DescribeApplicationScalingRuleResponseBodyDataMetricMetrics setVport(String vport) {
            this.vport = vport;
            return this;
        }
        public String getVport() {
            return this.vport;
        }

    }

    public static class DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics extends TeaModel {
        /**
         * <p>The current value of the metric.</p>
         */
        @NameInMap("CurrentValue")
        public Long currentValue;

        /**
         * <p>The name of the metric.</p>
         * <br>
         * <p>*   **cpu**: the CPU utilization.</p>
         * <p>*   **memory**: the memory usage.</p>
         * <p>*   **tcpActiveConn**: the number of active TCP connections.</p>
         * <p>*   **slb_incall_qps**: the QPS of the Internet-facing SLB instance.</p>
         * <p>*   **slb_incall_rt**: the response time of the Internet-facing SLB instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the data. This parameter corresponds to the metric.</p>
         * <br>
         * <p>*   **Resource**: used when the metric is the **CPU utilization** or **memory usage**.</p>
         * <p>*   **Pods**: used when the metric is the **number of active TCP connections**.</p>
         * <p>*   **External**: used when the metric is about the **SLB** instance or from **Application Real-Time Monitoring Service (ARMS)**.</p>
         */
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
        /**
         * <p>The name of the metric.</p>
         * <br>
         * <p>*   **cpu**: the CPU utilization.</p>
         * <p>*   **memory**: the memory usage.</p>
         * <p>*   **tcpActiveConn**: the number of active TCP connections.</p>
         * <p>*   **slb_incall_qps**: the QPS of the Internet-facing SLB instance.</p>
         * <p>*   **slb_incall_rt**: the response time of the Internet-facing SLB instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The metric value as a percentage that triggers the application scale-in next time.</p>
         */
        @NameInMap("NextScaleInAverageUtilization")
        public Integer nextScaleInAverageUtilization;

        /**
         * <p>The metric value as a percentage that triggers the application scale-out next time.</p>
         */
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
        /**
         * <p>The metrics that is used to trigger the current auto scaling policy.</p>
         */
        @NameInMap("CurrentMetrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics> currentMetrics;

        /**
         * <p>The current number of instances.</p>
         */
        @NameInMap("CurrentReplicas")
        public Long currentReplicas;

        /**
         * <p>The expected number of instances.</p>
         */
        @NameInMap("DesiredReplicas")
        public Long desiredReplicas;

        /**
         * <p>The time when the auto scaling policy was last triggered.</p>
         */
        @NameInMap("LastScaleTime")
        public String lastScaleTime;

        /**
         * <p>The metrics that are used to trigger the auto scaling policy next time.</p>
         */
        @NameInMap("NextScaleMetrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics> nextScaleMetrics;

        /**
         * <p>The duration for which the metric-based auto scaling policy takes effect next time.</p>
         */
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
        /**
         * <p>Indicates whether the application scale-in is disabled. Valid values:</p>
         * <br>
         * <p>*   **true**: disabled.</p>
         * <p>*   **false**: enabled.</p>
         * <br>
         * <p>>  When this parameter is set to true, the application instances are never reduced. This prevents risks to your business in peak hours. By default, this parameter is set to false.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown time of the scale-in. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The step size for the scale-in. The maximum number of instances that can be reduced within a specific period of time.</p>
         */
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
        /**
         * <p>Indicates whether the application scale-in is disabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The application scale-in is disabled.</p>
         * <p>*   **false**: The application scale-in is enabled.</p>
         * <br>
         * <p>>  When this parameter is set to true, the application instances are never reduced. This prevents risks to your business in peak hours. By default, this parameter is set to false.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown time of the scale-out. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The step size for the scale-out. The maximum number of instances that can be added within a specific period of time.</p>
         */
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
        /**
         * <p>The maximum number of instances.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The list of metrics that are used to trigger the auto scaling policy.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        /**
         * <p>The execution status of the metric-based auto scaling policy.</p>
         */
        @NameInMap("MetricsStatus")
        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus metricsStatus;

        /**
         * <p>The minimum number of instances.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>Rules that determine the application scale-in.</p>
         */
        @NameInMap("ScaleDownRules")
        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules scaleDownRules;

        /**
         * <p>Rules that determine the application scale-out.</p>
         */
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
        /**
         * <p>The point in time. Format: **Hour:Minute**.</p>
         */
        @NameInMap("AtTime")
        public String atTime;

        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>The expected number of instances.</p>
         */
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

        public DescribeApplicationScalingRuleResponseBodyDataTimerSchedules setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRuleResponseBodyDataTimerSchedules setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
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
        /**
         * <p>The start date of the validity period of the scheduled auto scaling policy. Valid values:</p>
         * <br>
         * <p>*   If both the **BeginDate** and **EndDate** parameters are set to **null**, the auto scaling policy can always be triggered. The default value for these parameters is null.</p>
         * <p>*   If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if **BeginDate** is **2021-03-25** and **EndDate** is **2021-04-25**, the auto scaling policy is valid for one month.</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the validity period of the scheduled auto scaling policy. Valid values:</p>
         * <br>
         * <p>*   If both the **BeginDate** and **EndDate** parameters are set to **null**, the auto scaling policy can always be triggered. The default value for these parameters is null.</p>
         * <p>*   If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if **BeginDate** is **2021-03-25** and **EndDate** is **2021-04-25**, the auto scaling policy is valid for one month.</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The days on which the scheduled auto scaling policy takes effect. Valid values:</p>
         * <br>
         * <p>*   **\\* \\* \\***: The scheduled auto scaling policy takes effect at a specified time every day.</p>
         * <br>
         * <p>*   **\\* \\* Fri,Mon**: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a week. The specified time is in the GMT+8 time zone. Valid values:</p>
         * <br>
         * <p>    *   **Sun**: Sunday</p>
         * <p>    *   **Mon**: Monday</p>
         * <p>    *   **Tue**: Tuesday</p>
         * <p>    *   **Wed**: Wednesday</p>
         * <p>    *   **Thu**: Thursday</p>
         * <p>    *   **Fri**: Friday</p>
         * <p>    *   **Sat**: Saturday</p>
         * <br>
         * <p>*   **1,2,3,28,31 \\* \\***: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy takes effect on the specified days other than the 31st day.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The points in time when the auto scaling policy is triggered within one day.</p>
         */
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
        public DescribeApplicationScalingRuleResponseBodyDataMetric metric;

        @NameInMap("MinReadyInstanceRatio")
        public Integer minReadyInstanceRatio;

        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

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
        public DescribeApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <p>The time when the auto scaling policy was updated. Unit: milliseconds.</p>
         */
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

        public DescribeApplicationScalingRuleResponseBodyData setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }
        public Integer getMinReadyInstanceRatio() {
            return this.minReadyInstanceRatio;
        }

        public DescribeApplicationScalingRuleResponseBodyData setMinReadyInstances(Integer minReadyInstances) {
            this.minReadyInstances = minReadyInstances;
            return this;
        }
        public Integer getMinReadyInstances() {
            return this.minReadyInstances;
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
