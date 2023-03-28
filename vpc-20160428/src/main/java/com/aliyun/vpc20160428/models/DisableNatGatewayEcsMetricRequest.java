// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableNatGatewayEcsMetricRequest extends TeaModel {
    /**
     * <p>Specifies whether to precheck this request only. Valid values:</p>
     * <br>
     * <p>**true**: The validity of the request is checked but ECS traffic monitoring is not disabled. Check items include whether your AccessKey pair is valid, whether Resource Access Management (RAM) users are authorized, and whether the required parameters are set. If the request fails the precheck, the corresponding error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <br>
     * <p>**false** (default): The validity of the request is checked. If the request passes the precheck, a 2XX HTTP status code is returned and ECS traffic monitoring is disabled.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the NAT gateway for which you want to disable Elastic Compute Service (ECS) traffic monitoring.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The ID of the region where the NAT gateway is deployed. You can call the [DescribeRegions](~~36063~~) operation to query region IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisableNatGatewayEcsMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableNatGatewayEcsMetricRequest self = new DisableNatGatewayEcsMetricRequest();
        return TeaModel.build(map, self);
    }

    public DisableNatGatewayEcsMetricRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableNatGatewayEcsMetricRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DisableNatGatewayEcsMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
