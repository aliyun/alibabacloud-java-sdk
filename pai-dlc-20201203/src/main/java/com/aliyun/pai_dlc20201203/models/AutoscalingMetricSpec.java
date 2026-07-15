// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AutoscalingMetricSpec extends TeaModel {
    /**
     * <p>The name of the metric for autoscaling. This can be a predefined or a custom metric.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The cooldown period, in seconds, after a scaling activity. This prevents the service from initiating another scaling action before the effects of the previous one are observable, stabilizing resource fluctuations.</p>
     */
    @NameInMap("StabilizationWindowSeconds")
    public Integer stabilizationWindowSeconds;

    /**
     * <p>The target value for the specified metric. The autoscaling service tries to maintain the metric at or near this value.</p>
     */
    @NameInMap("TargetValue")
    public Integer targetValue;

    /**
     * <p>The acceptable deviation from the <code>TargetValue</code>, specified as a percentage string. A scaling action is triggered only if the metric value moves outside the range defined by the <code>TargetValue</code> and this tolerance. This prevents scaling actions based on minor fluctuations.</p>
     */
    @NameInMap("Tolerance")
    public String tolerance;

    public static AutoscalingMetricSpec build(java.util.Map<String, ?> map) throws Exception {
        AutoscalingMetricSpec self = new AutoscalingMetricSpec();
        return TeaModel.build(map, self);
    }

    public AutoscalingMetricSpec setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public AutoscalingMetricSpec setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
        return this;
    }
    public Integer getStabilizationWindowSeconds() {
        return this.stabilizationWindowSeconds;
    }

    public AutoscalingMetricSpec setTargetValue(Integer targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public Integer getTargetValue() {
        return this.targetValue;
    }

    public AutoscalingMetricSpec setTolerance(String tolerance) {
        this.tolerance = tolerance;
        return this;
    }
    public String getTolerance() {
        return this.tolerance;
    }

}
