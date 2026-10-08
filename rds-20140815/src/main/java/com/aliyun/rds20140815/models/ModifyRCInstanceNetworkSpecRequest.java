// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceNetworkSpecRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InternetMaxBandwidthOut")
    public String internetMaxBandwidthOut;

    @NameInMap("NetworkChargeType")
    public String networkChargeType;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCInstanceNetworkSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceNetworkSpecRequest self = new ModifyRCInstanceNetworkSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceNetworkSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCInstanceNetworkSpecRequest setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public String getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyRCInstanceNetworkSpecRequest setNetworkChargeType(String networkChargeType) {
        this.networkChargeType = networkChargeType;
        return this;
    }
    public String getNetworkChargeType() {
        return this.networkChargeType;
    }

    public ModifyRCInstanceNetworkSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
