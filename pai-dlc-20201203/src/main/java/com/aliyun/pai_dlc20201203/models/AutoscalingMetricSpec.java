// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AutoscalingMetricSpec extends TeaModel {
    /**
     * <p>The name of the monitoring metrics used for auto scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>POD_CPU_UTIL</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The duration of the stabilization window for the auto scaling metric, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("StabilizationWindowSeconds")
    public Integer stabilizationWindowSeconds;

    /**
     * <p>The target value of the monitoring metrics for auto scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("TargetValue")
    public Integer targetValue;

    /**
     * <p>The allowed bias ratio for the target value of the monitoring metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
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
