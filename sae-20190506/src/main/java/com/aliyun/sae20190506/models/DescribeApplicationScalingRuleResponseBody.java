// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or a POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The operation is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: A redirection is required.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationScalingRuleResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li><p>If the request is successful, the <strong>ErrorCode</strong> field is not returned.</p>
     * </li>
     * <li><p>If the request fails, the <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, a specific error code is returned.</p>
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
     * <p>73404D3D-EE4F-4CB2-B197-5C46F6A1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application instance was successfully restarted.</p>
     * <ul>
     * <li><p><strong>true</strong>: The restart succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The restart failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID. Use this ID to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>0b57ff7e16243300839193068e****</p>
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
         * <p>The target value of the metric.</p>
         * <ul>
         * <li><p>The target CPU utilization. Unit: percent.</p>
         * </li>
         * <li><p>The target memory usage. Unit: percent.</p>
         * </li>
         * <li><p>The number of queries per second (QPS).</p>
         * </li>
         * <li><p>The response time. Unit: milliseconds.</p>
         * </li>
         * <li><p>The average number of active TCP connections per second.</p>
         * </li>
         * <li><p>The QPS of a public-facing SLB instance.</p>
         * </li>
         * <li><p>The response time of a public-facing SLB instance. Unit: milliseconds.</p>
         * </li>
         * <li><p>The QPS of a private SLB instance.</p>
         * </li>
         * <li><p>The response time of a private SLB instance. Unit: milliseconds.</p>
         * </li>
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
         * <li><p><strong>CPU</strong>: CPU utilization.</p>
         * </li>
         * <li><p><strong>MEMORY</strong>: memory usage.</p>
         * </li>
         * <li><p><strong>QPS</strong>: the average QPS of a single instance of a Java application in one minute.</p>
         * </li>
         * <li><p><strong>RT</strong>: the average response time (RT) of all service interfaces of a Java application in one minute.</p>
         * </li>
         * <li><p><strong>tcpActiveConn</strong>: the average number of active TCP connections of a single instance in 30 seconds.</p>
         * </li>
         * <li><p><strong>SLB_QPS</strong>: the average QPS of a single instance for a public-facing SLB instance in 15 seconds.</p>
         * </li>
         * <li><p><strong>SLB_RT</strong>: the average RT of a public-facing SLB instance in 15 seconds.</p>
         * </li>
         * <li><p><strong>INTRANET_SLB_QPS</strong>: the average QPS of a single instance for a private SLB instance in 15 seconds.</p>
         * </li>
         * <li><p><strong>INTRANET_SLB_RT</strong>: the average RT of a private SLB instance in 15 seconds.</p>
         * </li>
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
         * <p>The SLB access log Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbLogstore")
        public String slbLogstore;

        /**
         * <p>The SLB access log Project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbProject")
        public String slbProject;

        /**
         * <p>The port of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
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
         * <p>The current value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentValue")
        public Long currentValue;

        /**
         * <p>The name of the metric.</p>
         * <ul>
         * <li><p><strong>cpu</strong>: CPU utilization.</p>
         * </li>
         * <li><p><strong>memory</strong>: memory usage.</p>
         * </li>
         * <li><p><strong>arms_incall_qps</strong>: the average QPS of a single instance of a Java application in one minute.</p>
         * </li>
         * <li><p><strong>arms_incall_rt</strong>: the average RT of all service interfaces of a Java application in one minute.</p>
         * </li>
         * <li><p><strong>tcpActiveConn</strong>: the number of active TCP connections.</p>
         * </li>
         * <li><p><strong>slb_incall_qps</strong>: the QPS of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>slb_incall_rt</strong>: the RT of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_qps</strong>: the QPS of a private SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_rt</strong>: the RT of a private SLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the metric. This parameter is associated with the monitoring metric.</p>
         * <ul>
         * <li><p><strong>Resource</strong>: the metric value of <strong>cpu</strong> or <strong>memory</strong>.</p>
         * </li>
         * <li><p><strong>Pods</strong>: the metric value of <strong>tcpActiveConn</strong>.</p>
         * </li>
         * <li><p><strong>External</strong>: the metric value of <strong>arms</strong> or <strong>slb</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
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
         * <ul>
         * <li><p><strong>cpu</strong>: CPU utilization.</p>
         * </li>
         * <li><p><strong>memory</strong>: memory usage.</p>
         * </li>
         * <li><p><strong>arms_incall_qps</strong>: the average QPS of a single instance of a Java application in one minute.</p>
         * </li>
         * <li><p><strong>arms_incall_rt</strong>: the average RT of all service interfaces of a Java application in one minute.</p>
         * </li>
         * <li><p><strong>tcpActiveConn</strong>: the number of active TCP connections.</p>
         * </li>
         * <li><p><strong>slb_incall_qps</strong>: the QPS of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>slb_incall_rt</strong>: the RT of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_qps</strong>: the QPS of a private SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_rt</strong>: the RT of a private SLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The metric threshold for the next scale-in. The value is a percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextScaleInAverageUtilization")
        public Integer nextScaleInAverageUtilization;

        /**
         * <p>The metric threshold for the next scale-out. The value is a percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
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
         * <p>The data of the current metric-based scaling.</p>
         */
        @NameInMap("CurrentMetrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusCurrentMetrics> currentMetrics;

        /**
         * <p>The current number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CurrentReplicas")
        public Long currentReplicas;

        /**
         * <p>The target number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesiredReplicas")
        public Long desiredReplicas;

        /**
         * <p>The time of the last scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-11T08:14:32Z</p>
         */
        @NameInMap("LastScaleTime")
        public String lastScaleTime;

        /**
         * <p>The list of metrics for the next scaling activity.</p>
         */
        @NameInMap("NextScaleMetrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatusNextScaleMetrics> nextScaleMetrics;

        /**
         * <p>The period of the next metric-based scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>Indicates whether scale-in is disabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you enable this feature, the application is never scaled in. This prevents business risks that are caused by scale-ins during peak hours. By default, this feature is disabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown period for scale-ins. The value can be an integer from 0 to 3600. Unit: seconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The scaling step size for scale-ins. The maximum number of instances that can be removed at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>Indicates whether scale-in is disabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you enable this feature, the application is never scaled in. This prevents business risks that are caused by scale-ins during peak hours. By default, this feature is disabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown period for scale-outs. The value can be an integer from 0 to 3600. Unit: seconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The scaling step size for scale-outs. The maximum number of instances that can be added at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The list of metric-based scaling policies.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRuleResponseBodyDataMetricMetrics> metrics;

        /**
         * <p>The status of the metric-based scaling policy.</p>
         */
        @NameInMap("MetricsStatus")
        public DescribeApplicationScalingRuleResponseBodyDataMetricMetricsStatus metricsStatus;

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>The scale-in rules.</p>
         */
        @NameInMap("ScaleDownRules")
        public DescribeApplicationScalingRuleResponseBodyDataMetricScaleDownRules scaleDownRules;

        /**
         * <p>The scale-out rules.</p>
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
         * <p>The point in time. Format: <strong>HH:mm</strong>.</p>
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
         * <p>2</p>
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
         * <p>The start date of a short-term scheduled scaling policy. The following list describes the valid values:</p>
         * <ul>
         * <li><p>If you leave both <strong>BeginDate</strong> and <strong>EndDate</strong> empty, the policy is a long-term policy. This is the default value.</p>
         * </li>
         * <li><p>If you specify a date, for example, you set <strong>BeginDate</strong> to <strong>2021-03-25</strong> and <strong>EndDate</strong> to <strong>2021-04-25</strong>, the policy is effective for one month.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of a short-term scheduled scaling policy. The following list describes the valid values:</p>
         * <ul>
         * <li><p>If you leave both <strong>BeginDate</strong> and <strong>EndDate</strong> empty, the policy is a long-term policy. This is the default value.</p>
         * </li>
         * <li><p>If you specify a date, for example, you set <strong>BeginDate</strong> to <strong>2021-03-25</strong> and <strong>EndDate</strong> to <strong>2021-04-25</strong>, the policy is effective for one month.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-04-25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The period in which the scheduled scaling policy is executed. Valid values:</p>
         * <ul>
         * <li><p><em><em>\</em> \</em> \***: The policy is executed at a specified time every day.</p>
         * </li>
         * <li><p><em><em>\</em> \</em> Fri,Mon**: The policy is executed at a specified time on one or more days of a week. You can select multiple days. The time is in GMT+8. Valid values:</p>
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
         * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: The policy is executed at a specified time on one or more days of a month. You can select multiple days. The value can be an integer from 1 to 31. If a month does not have a 31st day, the policy is not executed on that day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The points in time when the auto scaling policy is triggered within a day.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a0d2e04c-159d-40a8-b240-d2f2c263****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the auto scaling policy was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624329843790</p>
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
         * <p>The metric-based scaling policy.</p>
         */
        @NameInMap("Metric")
        public DescribeApplicationScalingRuleResponseBodyDataMetric metric;

        /**
         * <p>The percentage of the minimum number of ready instances. Valid values:</p>
         * <ul>
         * <li><p><strong>-1</strong>: an initial value, which indicates that a percentage is not used.</p>
         * </li>
         * <li><p><strong>0 to 100</strong>: a percentage that is rounded up. For example, if you set this parameter to 50% and the current number of instances is 5, the minimum number of ready instances is 3.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify both MinReadyInstances and MinReadyInstanceRatio, and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the value of <strong>MinReadyInstanceRatio</strong> prevails. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the value <strong>50</strong> is used to calculate the minimum number of ready instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MinReadyInstanceRatio")
        public Integer minReadyInstanceRatio;

        /**
         * <p>The minimum number of ready instances. Valid values:</p>
         * <ul>
         * <li><p>If you set this parameter to <strong>0</strong>, the application is interrupted during an upgrade.</p>
         * </li>
         * <li><p>If you set this parameter to -1, the system uses a recommended value for the minimum number of ready instances. The value is 25% of the current number of instances. For example, if the current number of instances is 5, the minimum number of ready instances is 2 after 5 × 25% = 1.25 is rounded up.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Set the minimum number of ready instances to a value greater than or equal to 1 for each rolling deployment to ensure business continuity.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

        /**
         * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The policy is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The policy is disabled.</p>
         * </li>
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
         * <li><p><strong>timing</strong>: scheduled scaling.</p>
         * </li>
         * <li><p><strong>metric</strong>: metric-based scaling.</p>
         * </li>
         * <li><p><strong>mix</strong>: hybrid scaling.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>timing</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The scheduled scaling policy.</p>
         */
        @NameInMap("Timer")
        public DescribeApplicationScalingRuleResponseBodyDataTimer timer;

        /**
         * <p>The time when the auto scaling policy was updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624330075827</p>
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
