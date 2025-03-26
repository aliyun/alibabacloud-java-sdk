// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebootRCInstancesShrinkRequest extends TeaModel {
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    @NameInMap("ForceReboot")
    public Boolean forceReboot;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static RebootRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootRCInstancesShrinkRequest self = new RebootRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RebootRCInstancesShrinkRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public RebootRCInstancesShrinkRequest setForceReboot(Boolean forceReboot) {
        this.forceReboot = forceReboot;
        return this;
    }
    public Boolean getForceReboot() {
        return this.forceReboot;
    }

    public RebootRCInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public RebootRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
