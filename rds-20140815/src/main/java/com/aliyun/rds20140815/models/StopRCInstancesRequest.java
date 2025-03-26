// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstancesRequest extends TeaModel {
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    @NameInMap("ForceStop")
    public Boolean forceStop;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static StopRCInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRCInstancesRequest self = new StopRCInstancesRequest();
        return TeaModel.build(map, self);
    }

    public StopRCInstancesRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public StopRCInstancesRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopRCInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public StopRCInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
