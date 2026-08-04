// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotBidPreviewItem extends TeaModel {
    /**
     * <p>Indicates whether the spot bid is active. If set to <code>false</code>, the bid is paused.</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>Determines whether instances can be deployed across different High-Performance Network (HPN) zones. Defaults to <code>false</code>.</p>
     */
    @NameInMap("allowCrossHpnZone")
    public Boolean allowCrossHpnZone;

    /**
     * <p>The ID of the cluster where resources are provisioned.</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The GC level for the spot instance.</p>
     */
    @NameInMap("gcLevel")
    public String gcLevel;

    /**
     * <p>The type of compute instance.</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The name of the associated job.</p>
     */
    @NameInMap("jobName")
    public String jobName;

    /**
     * <p>The maximum discount percentage from the on-demand price.</p>
     */
    @NameInMap("maxDiscount")
    public Double maxDiscount;

    /**
     * <p>A message that provides additional details about the current phase.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the spot bid preview.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The current phase of the spot bid preview. Valid values are <code>Pending</code>, <code>Active</code>, and <code>Failed</code>.</p>
     */
    @NameInMap("phase")
    public String phase;

    /**
     * <p>The number of instance replicas.</p>
     */
    @NameInMap("replicas")
    public Integer replicas;

    public static SpotBidPreviewItem build(java.util.Map<String, ?> map) throws Exception {
        SpotBidPreviewItem self = new SpotBidPreviewItem();
        return TeaModel.build(map, self);
    }

    public SpotBidPreviewItem setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public SpotBidPreviewItem setAllowCrossHpnZone(Boolean allowCrossHpnZone) {
        this.allowCrossHpnZone = allowCrossHpnZone;
        return this;
    }
    public Boolean getAllowCrossHpnZone() {
        return this.allowCrossHpnZone;
    }

    public SpotBidPreviewItem setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SpotBidPreviewItem setGcLevel(String gcLevel) {
        this.gcLevel = gcLevel;
        return this;
    }
    public String getGcLevel() {
        return this.gcLevel;
    }

    public SpotBidPreviewItem setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SpotBidPreviewItem setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SpotBidPreviewItem setMaxDiscount(Double maxDiscount) {
        this.maxDiscount = maxDiscount;
        return this;
    }
    public Double getMaxDiscount() {
        return this.maxDiscount;
    }

    public SpotBidPreviewItem setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SpotBidPreviewItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SpotBidPreviewItem setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public SpotBidPreviewItem setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

}
