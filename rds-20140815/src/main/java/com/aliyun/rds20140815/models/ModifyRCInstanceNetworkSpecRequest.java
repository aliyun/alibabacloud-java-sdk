// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceNetworkSpecRequest extends TeaModel {
    /**
     * <p>The ID of the RDS Custom instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-dh2jf9n6j4s14926****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
     * <p>Valid values: 0 to 1024. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public String internetMaxBandwidthOut;

    /**
     * <p>The billing method of the bandwidth. Only the <strong>pay-by-traffic</strong> billing method is supported.</p>
     * <blockquote>
     * <p> If the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be limited.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("NetworkChargeType")
    public String networkChargeType;

    /**
     * <p>The region ID of the instance. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
