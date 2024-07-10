// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationScalingRulesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static DescribeApplicationScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesResponseBody self = new DescribeApplicationScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationScalingRulesResponseBody setData(DescribeApplicationScalingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationScalingRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationScalingRulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationScalingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationScalingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationScalingRulesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics extends TeaModel {
        /**
         * <p>The limit on the metric.</p>
         * <ul>
         * <li>The limit on the CPU utilization. Unit: percentage.</li>
         * <li>The limit on the memory usage. Unit: percentage.</li>
         * <li>The limit on the average number of active TCP connections per second.</li>
         * <li>The limit on the queries per second (QPS) of the Internet-facing Server Load Balancer (SLB) instance.</li>
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
         * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections per second of an application instance in 30 seconds.</li>
         * <li><strong>SLB_QPS</strong>: the average QPS of the Internet-facing SLB instance associated with an application instance in 15 seconds.</li>
         * <li><strong>SLB_RT</strong>: the average response time of the Internet-facing SLB instance in 15 seconds.</li>
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

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics setSlbLogstore(String slbLogstore) {
            this.slbLogstore = slbLogstore;
            return this;
        }
        public String getSlbLogstore() {
            return this.slbLogstore;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics setSlbProject(String slbProject) {
            this.slbProject = slbProject;
            return this;
        }
        public String getSlbProject() {
            return this.slbProject;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics setVport(String vport) {
            this.vport = vport;
            return this;
        }
        public String getVport() {
            return this.vport;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics extends TeaModel {
        /**
         * <p>The current value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentValue")
        public Long currentValue;

        /**
         * <p>The name of the metric.</p>
         * <ul>
         * <li><strong>cpu</strong>: the CPU utilization.</li>
         * <li><strong>memory</strong>: the memory usage.</li>
         * <li><strong>tcpActiveConn</strong>: the number of active TCP connections.</li>
         * <li><strong>slb_incall_qps</strong>: the QPS of the Internet-facing SLB instance.</li>
         * <li><strong>slb_incall_rt</strong>: the response time of the Internet-facing SLB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the data. This parameter corresponds to the metric.</p>
         * <ul>
         * <li><strong>Resource</strong>: used when the metric is the <strong>CPU utilization</strong> or <strong>memory usage</strong>.</li>
         * <li><strong>Pods</strong>: used when the metric is the <strong>number of active TCP connections</strong>.</li>
         * <li><strong>External</strong>: used when the metric is about the <strong>SLB</strong> instance or from <strong>Application Real-Time Monitoring Service (ARMS)</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
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
        /**
         * <p>The name of the metric.</p>
         * <ul>
         * <li><strong>cpu</strong>: the CPU utilization.</li>
         * <li><strong>memory</strong>: the memory usage.</li>
         * <li><strong>tcpActiveConn</strong>: the number of active TCP connections.</li>
         * <li><strong>slb_incall_qps</strong>: the QPS of the Internet-facing SLB instance.</li>
         * <li><strong>slb_incall_rt</strong>: the response time of the Internet-facing SLB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The metric value as a percentage that triggers the application scale-in next time.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextScaleInAverageUtilization")
        public Integer nextScaleInAverageUtilization;

        /**
         * <p>The metric value as a percentage that triggers the application scale-out next time.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
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
        /**
         * <p>The metrics that are used to trigger the auto scaling policy this time.</p>
         */
        @NameInMap("CurrentMetrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusCurrentMetrics> currentMetrics;

        /**
         * <p>The current number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CurrentReplicas")
        public Long currentReplicas;

        /**
         * <p>The expected number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesiredReplicas")
        public Long desiredReplicas;

        /**
         * <p>The time when the auto scaling policy was last triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-11T08:14:32Z</p>
         */
        @NameInMap("LastScaleTime")
        public String lastScaleTime;

        /**
         * <p>The maximum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReplicas")
        public Long maxReplicas;

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReplicas")
        public Long minReplicas;

        /**
         * <p>The metrics that are used to trigger the auto scaling policy next time.</p>
         */
        @NameInMap("NextScaleMetrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics> nextScaleMetrics;

        /**
         * <p>The duration for which the metric-based auto scaling policy takes effect next time.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
        /**
         * <p>Indicates whether the application scale-in was disabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The application scale-in was disabled.</li>
         * <li><strong>false</strong>: The application scale-in was enabled.</li>
         * </ul>
         * <blockquote>
         * <p> When this parameter is set to true, the application instances will never be reduced. This prevents risks to your business in peak hours. By default, this parameter is set to false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown time of the scale-in. Valid values: 0 to 3600. Unit: seconds. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The step size for the scale-in. The maximum number of instances that can be reduced in a unit of time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>Indicates whether the application scale-in was disabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The application scale-in was disabled.</li>
         * <li><strong>false</strong>: The application scale-in was enabled.</li>
         * </ul>
         * <blockquote>
         * <p> When this parameter is set to true, the application instances will never be reduced. This prevents risks to your business in peak hours. By default, this parameter is set to false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown time of the scale-out. Valid values: 0 to 3600. Unit: seconds. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The step size for the scale-out. The maximum number of instances that can be added in a unit of time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The maximum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The list of metrics that are used to trigger the auto scaling policy.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics> metrics;

        /**
         * <p>The execution status of the metric-based auto scaling policy.</p>
         */
        @NameInMap("MetricsStatus")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatus metricsStatus;

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>Rules that determine the application scale-in.</p>
         */
        @NameInMap("ScaleDownRules")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules scaleDownRules;

        /**
         * <p>Rules that determine the application scale-out.</p>
         */
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
         * <p>50</p>
         */
        @NameInMap("MaxReplicas")
        public Long maxReplicas;

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReplicas")
        public Long minReplicas;

        /**
         * <p>The expected number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
        /**
         * <p>The start date of the validity period of the scheduled auto scaling policy. Valid values:</p>
         * <ul>
         * <li>If both the <strong>BeginDate</strong> and <strong>EndDate</strong> parameters are set to <strong>null</strong>, the auto scaling policy can always be triggered. The default value for these parameters is null.</li>
         * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is 2021-03-25 and <strong>EndDate</strong> is 2021-04-25, the auto scaling policy is valid for one month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the validity period of the scheduled auto scaling policy. Valid values:</p>
         * <ul>
         * <li>If both the <strong>BeginDate</strong> and <strong>EndDate</strong> parameters are set to <strong>null</strong>, the auto scaling policy can always be triggered. The default value for these parameters is null.</li>
         * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is 2021-03-25 and <strong>EndDate</strong> is 2021-04-25, the auto scaling policy is valid for one month.</li>
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
         * <li><p><em><em>\</em> \</em> \***: The scheduled auto scaling policy takes effect at a specified time every day.</p>
         * </li>
         * <li><p><em><em>\</em> \</em> Fri,Mon**: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a week. The specified time is in the GMT+8 time zone. Valid values:</p>
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
         * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy takes effect on the specified days other than the 31st day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The points in time when the auto scaling policy is triggered within one day.</p>
         */
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
        /**
         * <p>The ID of the application.</p>
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
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric metric;

        @NameInMap("MinReadyInstanceRatio")
        public Integer minReadyInstanceRatio;

        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

        /**
         * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: disabled</li>
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
         * <li><strong>timing</strong>: the scheduled auto scaling policy.</li>
         * <li><strong>metric</strong>: the metric-based auto scaling policy.</li>
         * <li><strong>mix</strong>: the hybrid auto scaling policy.</li>
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
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer timer;

        /**
         * <p>The time when the auto scaling policy was updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
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

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }
        public Integer getMinReadyInstanceRatio() {
            return this.minReadyInstanceRatio;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setMinReadyInstances(Integer minReadyInstances) {
            this.minReadyInstances = minReadyInstances;
            return this;
        }
        public Integer getMinReadyInstances() {
            return this.minReadyInstances;
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
        /**
         * <p>The auto scaling policies of the application.</p>
         */
        @NameInMap("ApplicationScalingRules")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> applicationScalingRules;

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of auto scaling policies.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
