// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AutoScalingSpec extends TeaModel {
    /**
     * <p>The monitoring metrics configuration for autoscaling.</p>
     */
    @NameInMap("AutoscalingMetricSpec")
    public AutoscalingMetricSpec autoscalingMetricSpec;

    /**
     * <p>The maximum number of replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxReplicas")
    public Integer maxReplicas;

    /**
     * <p>The minimum number of replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinReplicas")
    public Integer minReplicas;

    /**
     * <p>The Pods to delete for scale-in. This can only be modified through UpdateJob, and the number of Pods to delete must match PodCount.</p>
     */
    @NameInMap("PodsToDelete")
    public java.util.List<String> podsToDelete;

    /**
     * <p>The autoscaling policy. Valid values: Default, ScaleByAPI, RayAutoscaler, and CloudMonitorMetric.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("ScalingStrategy")
    public String scalingStrategy;

    public static AutoScalingSpec build(java.util.Map<String, ?> map) throws Exception {
        AutoScalingSpec self = new AutoScalingSpec();
        return TeaModel.build(map, self);
    }

    public AutoScalingSpec setAutoscalingMetricSpec(AutoscalingMetricSpec autoscalingMetricSpec) {
        this.autoscalingMetricSpec = autoscalingMetricSpec;
        return this;
    }
    public AutoscalingMetricSpec getAutoscalingMetricSpec() {
        return this.autoscalingMetricSpec;
    }

    public AutoScalingSpec setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }
    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }

    public AutoScalingSpec setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }
    public Integer getMinReplicas() {
        return this.minReplicas;
    }

    public AutoScalingSpec setPodsToDelete(java.util.List<String> podsToDelete) {
        this.podsToDelete = podsToDelete;
        return this;
    }
    public java.util.List<String> getPodsToDelete() {
        return this.podsToDelete;
    }

    public AutoScalingSpec setScalingStrategy(String scalingStrategy) {
        this.scalingStrategy = scalingStrategy;
        return this;
    }
    public String getScalingStrategy() {
        return this.scalingStrategy;
    }

}
