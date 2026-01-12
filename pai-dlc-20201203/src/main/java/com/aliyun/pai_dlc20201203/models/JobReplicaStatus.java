// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobReplicaStatus extends TeaModel {
    @NameInMap("Active")
    public Integer active;

    @NameInMap("Dequeued")
    public Integer dequeued;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EstimatedAutoScalingSpec")
    public AutoScalingSpec estimatedAutoScalingSpec;

    @NameInMap("EstimatedPodCount")
    public Long estimatedPodCount;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EstimatedResourceConfig")
    public ResourceConfig estimatedResourceConfig;

    @NameInMap("Queuing")
    public Integer queuing;

    @NameInMap("Type")
    public String type;

    public static JobReplicaStatus build(java.util.Map<String, ?> map) throws Exception {
        JobReplicaStatus self = new JobReplicaStatus();
        return TeaModel.build(map, self);
    }

    public JobReplicaStatus setActive(Integer active) {
        this.active = active;
        return this;
    }
    public Integer getActive() {
        return this.active;
    }

    public JobReplicaStatus setDequeued(Integer dequeued) {
        this.dequeued = dequeued;
        return this;
    }
    public Integer getDequeued() {
        return this.dequeued;
    }

    public JobReplicaStatus setEstimatedAutoScalingSpec(AutoScalingSpec estimatedAutoScalingSpec) {
        this.estimatedAutoScalingSpec = estimatedAutoScalingSpec;
        return this;
    }
    public AutoScalingSpec getEstimatedAutoScalingSpec() {
        return this.estimatedAutoScalingSpec;
    }

    public JobReplicaStatus setEstimatedPodCount(Long estimatedPodCount) {
        this.estimatedPodCount = estimatedPodCount;
        return this;
    }
    public Long getEstimatedPodCount() {
        return this.estimatedPodCount;
    }

    public JobReplicaStatus setEstimatedResourceConfig(ResourceConfig estimatedResourceConfig) {
        this.estimatedResourceConfig = estimatedResourceConfig;
        return this;
    }
    public ResourceConfig getEstimatedResourceConfig() {
        return this.estimatedResourceConfig;
    }

    public JobReplicaStatus setQueuing(Integer queuing) {
        this.queuing = queuing;
        return this;
    }
    public Integer getQueuing() {
        return this.queuing;
    }

    public JobReplicaStatus setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
