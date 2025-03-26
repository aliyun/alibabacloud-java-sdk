// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstancesShrinkRequest extends TeaModel {
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    @NameInMap("ForceStop")
    public Boolean forceStop;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static StopRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRCInstancesShrinkRequest self = new StopRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopRCInstancesShrinkRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public StopRCInstancesShrinkRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopRCInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public StopRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
