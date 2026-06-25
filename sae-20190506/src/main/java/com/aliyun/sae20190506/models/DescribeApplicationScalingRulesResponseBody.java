// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: The request was invalid.</p>
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
    public DescribeApplicationScalingRulesResponseBodyData data;

    /**
     * <p>The error code. This parameter is returned only when the request fails.</p>
     * <ul>
     * <li></li>
     * <li><p>For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message. Valid values:</p>
     * <ul>
     * <li><p>Returns <strong>success</strong> if the request is successful.</p>
     * </li>
     * <li><p>Returns an error message if the request fails.</p>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query the details of a request.</p>
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
         * <p>The target value for the metric. The unit varies based on the value of <code>MetricType</code>.</p>
         * <ul>
         * <li><p>Target CPU usage, in percent.</p>
         * </li>
         * <li><p>Target memory usage, in percent.</p>
         * </li>
         * <li><p>Target QPS, in queries per second.</p>
         * </li>
         * <li><p>Target response time, in milliseconds.</p>
         * </li>
         * <li><p>Target number of active TCP connections.</p>
         * </li>
         * <li><p>Target QPS of a public-facing SLB instance, in queries per second.</p>
         * </li>
         * <li><p>Target response time of a public-facing SLB instance, in milliseconds.</p>
         * </li>
         * <li><p>Target QPS of a private SLB instance, in queries per second.</p>
         * </li>
         * <li><p>Target response time of a private SLB instance, in milliseconds.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <p>The metric used to trigger the auto scaling policy. Valid values:</p>
         * <ul>
         * <li><p><strong>CPU</strong>: CPU usage.</p>
         * </li>
         * <li><p><strong>MEMORY</strong>: memory usage.</p>
         * </li>
         * <li><p><strong>QPS</strong>: Average queries per second (QPS) per instance over a 1-minute period. This metric applies to Java applications only.</p>
         * </li>
         * <li><p><strong>RT</strong>: Average response time of all service interfaces in a Java application over a 1-minute period.</p>
         * </li>
         * <li><p><strong>tcpActiveConn</strong>: Average number of active TCP connections per instance over a 30-second period.</p>
         * </li>
         * <li><p><strong>SLB_QPS</strong>: Average QPS per instance for a public-facing SLB instance over a 15-second period.</p>
         * </li>
         * <li><p><strong>SLB_RT</strong>: Average response time of a public-facing SLB instance over a 15-second period.</p>
         * </li>
         * <li><p><strong>INTRANET_SLB_QPS</strong>: Average QPS per instance for a private SLB instance over a 15-second period.</p>
         * </li>
         * <li><p><strong>INTRANET_SLB_RT</strong>: Average response time of a private SLB instance over a 15-second period.</p>
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
         * <p>The Logstore in Log Service that stores SLB access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbLogstore")
        public String slbLogstore;

        /**
         * <p>The project in Log Service that stores SLB access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbProject")
        public String slbProject;

        /**
         * <p>The monitored port of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
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
         * <p>The current value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentValue")
        public Long currentValue;

        /**
         * <p>The name of the trigger condition.</p>
         * <ul>
         * <li><p><strong>cpu</strong>: CPU usage.</p>
         * </li>
         * <li><p><strong>memory</strong>: memory usage.</p>
         * </li>
         * <li><p><strong>arms_incall_qps_v2</strong>: QPS of a Java application.</p>
         * </li>
         * <li><p><strong>arms_incall_rt</strong>: Response time of a Java application.</p>
         * </li>
         * <li><p><strong>tcpActiveConn</strong>: The number of active TCP connections.</p>
         * </li>
         * <li><p><strong>slb_incall_qps</strong>: QPS of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>slb_incall_rt</strong>: Response time of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_qps</strong>: QPS of a private SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_rt</strong>: Response time of a private SLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type. This parameter is associated with the specified metric.</p>
         * <ul>
         * <li><p><strong>Resource</strong>: The metric value for <strong>cpu</strong> or <strong>memory</strong>.</p>
         * </li>
         * <li><p><strong>Pods</strong>: The metric value for <strong>tcpActiveConn</strong>.</p>
         * </li>
         * <li><p><strong>External</strong>: The metric value for <strong>arms</strong> or <strong>slb</strong>.</p>
         * </li>
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
         * <p>The name of the trigger condition.</p>
         * <ul>
         * <li><p><strong>cpu</strong>: CPU usage.</p>
         * </li>
         * <li><p><strong>memory</strong>: memory usage.</p>
         * </li>
         * <li><p><strong>arms_incall_qps_v2</strong>: QPS of a Java application.</p>
         * </li>
         * <li><p><strong>arms_incall_rt</strong>: Response time of a Java application.</p>
         * </li>
         * <li><p><strong>tcpActiveConn</strong>: The number of active TCP connections.</p>
         * </li>
         * <li><p><strong>slb_incall_qps</strong>: QPS of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>slb_incall_rt</strong>: Response time of a public-facing SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_qps</strong>: QPS of a private SLB instance.</p>
         * </li>
         * <li><p><strong>intranet_slb_incall_rt</strong>: Response time of a private SLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The metric value that triggers the next scale-in event. The value is a percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextScaleInAverageUtilization")
        public Integer nextScaleInAverageUtilization;

        /**
         * <p>The metric value that triggers the next scale-out event. The value is a percentage.</p>
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
         * <p>A list of the current metrics for scaling.</p>
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
         * <p>A list of metrics for the next scaling activity.</p>
         */
        @NameInMap("NextScaleMetrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetricsStatusNextScaleMetrics> nextScaleMetrics;

        /**
         * <p>The next period for metric-based scaling.</p>
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

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics extends TeaModel {
        /**
         * <p>The Prometheus query.</p>
         */
        @NameInMap("PrometheusQuery")
        public String prometheusQuery;

        /**
         * <p>The target value for the Prometheus query that triggers a scaling event.</p>
         */
        @NameInMap("TargetMetricValue")
        public String targetMetricValue;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics setPrometheusQuery(String prometheusQuery) {
            this.prometheusQuery = prometheusQuery;
            return this;
        }
        public String getPrometheusQuery() {
            return this.prometheusQuery;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics setTargetMetricValue(String targetMetricValue) {
            this.targetMetricValue = targetMetricValue;
            return this;
        }
        public String getTargetMetricValue() {
            return this.targetMetricValue;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules extends TeaModel {
        /**
         * <p>Specifies whether to disable scale-in. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Disables scale-in.</p>
         * </li>
         * <li><p><strong>false</strong>: Enables scale-in.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Setting this to <code>true</code> prevents the application from scaling in, which can be useful to avoid service disruptions from unexpected capacity reduction during peak hours. Default: <code>false</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown time for scale-in events, in seconds. During this period, no further scaling events are triggered. The value must be an integer from 0 to 3,600. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The number of instances to remove in a single scale-in event.</p>
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
         * <p>Specifies whether to disable scale-out. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Disables scale-out.</p>
         * </li>
         * <li><p><strong>false</strong>: Enables scale-out.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is set to <code>true</code>, application instances are never scaled out. This can be useful to freeze the application capacity during specific events. By default, this parameter is set to <code>false</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The cooldown time for scale-out events, in seconds. During this period, no further scaling events are triggered. The value must be an integer from 0 to 3,600. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Long stabilizationWindowSeconds;

        /**
         * <p>The number of instances to add in a single scale-out event.</p>
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
         * <p>The source of the metrics.</p>
         */
        @NameInMap("MetricSource")
        public String metricSource;

        /**
         * <p>The metric-based conditions that trigger scaling.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricMetrics> metrics;

        /**
         * <p>The status of the metric-based scaling policy.</p>
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
         * <p>The Prometheus metrics.</p>
         */
        @NameInMap("PrometheusMetrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics> prometheusMetrics;

        /**
         * <p>The Prometheus token.</p>
         */
        @NameInMap("PrometheusToken")
        public String prometheusToken;

        /**
         * <p>The endpoint of the Prometheus service.</p>
         */
        @NameInMap("PrometheusUrl")
        public String prometheusUrl;

        /**
         * <p>Configuration for scale-in events.</p>
         */
        @NameInMap("ScaleDownRules")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricScaleDownRules scaleDownRules;

        /**
         * <p>Configuration for scale-out events.</p>
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

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setMetricSource(String metricSource) {
            this.metricSource = metricSource;
            return this;
        }
        public String getMetricSource() {
            return this.metricSource;
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

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setPrometheusMetrics(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics> prometheusMetrics) {
            this.prometheusMetrics = prometheusMetrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetricPrometheusMetrics> getPrometheusMetrics() {
            return this.prometheusMetrics;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setPrometheusToken(String prometheusToken) {
            this.prometheusToken = prometheusToken;
            return this;
        }
        public String getPrometheusToken() {
            return this.prometheusToken;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric setPrometheusUrl(String prometheusUrl) {
            this.prometheusUrl = prometheusUrl;
            return this;
        }
        public String getPrometheusUrl() {
            return this.prometheusUrl;
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
         * <p>The trigger time in <code>HH:mm</code> format.</p>
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
         * <p>The target number of instances.</p>
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
         * <p>The start date of the short-term scheduled scaling policy. The following rules apply:</p>
         * <ul>
         * <li><p>If <strong>BeginDate</strong> and <strong>EndDate</strong> are not specified, the policy is long-term by default.</p>
         * </li>
         * <li><p>If you specify a <code>BeginDate</code> and an <code>EndDate</code>, the policy is short-term and applies only within that date range.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <p>The end date of the short-term scheduled scaling policy. The following rules apply:</p>
         * <ul>
         * <li><p>If <strong>BeginDate</strong> and <strong>EndDate</strong> are not specified, the policy is long-term by default.</p>
         * </li>
         * <li><p>If you specify a <code>BeginDate</code> and an <code>EndDate</code>, the policy is short-term and applies only within that date range.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-04-25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The days on which the scheduled scaling policy runs. Valid values:</p>
         * <ul>
         * <li><p><em><em>\</em> \</em> \***: The policy is executed at a specified time every day.</p>
         * </li>
         * <li><p><em><em>\</em> \</em> Fri,Mon**: Executes the policy on specified days of the week. The time zone is GMT+8. Valid days are listed below:</p>
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
         * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: Executes the policy on specified days of the month (1-31). If a specified day does not exist in a given month (e.g., the 31st), the policy does not run on that day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The daily trigger schedule for the policy.</p>
         */
        @NameInMap("Schedules")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules> schedules;

        /**
         * <p>The time zone.</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

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

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The timestamp of the policy\&quot;s creation, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616642248938</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The timestamp of when the policy was last disabled.</p>
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
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesMetric metric;

        /**
         * <p>The minimum number of available instances, specified as a percentage. Valid values:</p>
         * <ul>
         * <li><p><strong>-1</strong>: Indicates that this parameter is not used.</p>
         * </li>
         * <li><p><strong>0 to 100</strong>: a percentage that is rounded up to the nearest integer. For example, if you set this parameter to 50% and you have five instances, the minimum number of available instances is 3.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify both <strong>MinReadyInstances</strong> and <strong>MinReadyInstanceRatio</strong>, the value of <strong>MinReadyInstanceRatio</strong> takes precedence, unless it is set to <strong>-1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MinReadyInstanceRatio")
        public Integer minReadyInstanceRatio;

        /**
         * <p>The minimum number of available instances. Valid values:</p>
         * <ul>
         * <li><p>If you set this parameter to <strong>0</strong>, the application may be interrupted during an upgrade.</p>
         * </li>
         * <li><p>If you set this parameter to <strong>-1</strong>, a recommended value is used, which is 25% of the current number of instances, rounded up to the nearest integer. For example, if an application has five instances, the minimum number of available instances is 2 (5 \* 25% = 1.25, rounded up).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>To ensure business continuity during a rolling deployment, we recommend that you set this parameter to a value greater than or equal to 1.</p>
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
         * <li><p><strong>timing</strong>: A scheduled scaling policy.</p>
         * </li>
         * <li><p><strong>metric</strong>: A metric-based scaling policy.</p>
         * </li>
         * <li><p><strong>mix</strong>: A hybrid scaling policy.</p>
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
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer timer;

        /**
         * <p>The timestamp of the last policy update, in milliseconds.</p>
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
         * <p>A list of auto scaling policies for the application.</p>
         */
        @NameInMap("ApplicationScalingRules")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> applicationScalingRules;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of auto scaling policies for the application.</p>
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
