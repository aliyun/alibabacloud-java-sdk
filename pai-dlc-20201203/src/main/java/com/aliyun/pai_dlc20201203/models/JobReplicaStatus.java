// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobReplicaStatus extends TeaModel {
    /**
     * <p>The number of active pods for this replica type.</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The type of spot instance in use, if any.</p>
     */
    @NameInMap("CurrentSpotInstanceType")
    public String currentSpotInstanceType;

    /**
     * <p>The number of dequeued pods.</p>
     */
    @NameInMap("Dequeued")
    public Integer dequeued;

    /**
     * <p>The estimated auto scaling specification.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EstimatedAutoScalingSpec")
    public AutoScalingSpec estimatedAutoScalingSpec;

    /**
     * <p>The estimated number of pods for this replica type, used for auto scaling.</p>
     */
    @NameInMap("EstimatedPodCount")
    public Long estimatedPodCount;

    /**
     * <p>The estimated resource configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EstimatedResourceConfig")
    public ResourceConfig estimatedResourceConfig;

    /**
     * <p>The number of queued pods.</p>
     */
    @NameInMap("Queuing")
    public Integer queuing;

    /**
     * <p>The type of the job replica.</p>
     */
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

    public JobReplicaStatus setCurrentSpotInstanceType(String currentSpotInstanceType) {
        this.currentSpotInstanceType = currentSpotInstanceType;
        return this;
    }
    public String getCurrentSpotInstanceType() {
        return this.currentSpotInstanceType;
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
