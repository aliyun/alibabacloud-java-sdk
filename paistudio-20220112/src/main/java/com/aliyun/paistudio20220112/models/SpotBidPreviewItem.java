// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotBidPreviewItem extends TeaModel {
    /**
     * <p>Specifies whether it is active.</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>Specifies whether cross-super-node zones are allowed.</p>
     */
    @NameInMap("allowCrossHpnZone")
    public Boolean allowCrossHpnZone;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster1</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The GC level.</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("gcLevel")
    public String gcLevel;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ml.gp7vf.16.40xlarge</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc1abcdefg12345</p>
     */
    @NameInMap("jobName")
    public String jobName;

    /**
     * <p>The maximum discount price.</p>
     * 
     * <strong>example:</strong>
     * <p>0.4</p>
     */
    @NameInMap("maxDiscount")
    public Double maxDiscount;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>bid succeeded</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pre-bid name.</p>
     * 
     * <strong>example:</strong>
     * <p>preview-xxxx</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The phase.</p>
     */
    @NameInMap("phase")
    public String phase;

    /**
     * <p>The number of replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
