// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobReplicaStatus extends TeaModel {
    /**
     * <p>The number of replicas of this role that are currently running.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The currently selected spot instance type (applies only to elastic spot tasks).</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.gn6e-c12g1.3xlarge</p>
     */
    @NameInMap("CurrentSpotInstanceType")
    public String currentSpotInstanceType;

    /**
     * <p>The number of replicas of this role that have been dequeued.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Dequeued")
    public Integer dequeued;

    /**
     * <p>The estimated auto-scaling configuration for this role.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EstimatedAutoScalingSpec")
    public AutoScalingSpec estimatedAutoScalingSpec;

    /**
     * <p>The estimated number of pods for this role.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EstimatedPodCount")
    public Long estimatedPodCount;

    /**
     * <p>The estimated resource configuration for this role.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EstimatedResourceConfig")
    public ResourceConfig estimatedResourceConfig;

    /**
     * <p>The number of replicas of this role that are still in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Queuing")
    public Integer queuing;

    /**
     * <p>The role type to which the task replicas belong.</p>
     * 
     * <strong>example:</strong>
     * <p>Worker</p>
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
