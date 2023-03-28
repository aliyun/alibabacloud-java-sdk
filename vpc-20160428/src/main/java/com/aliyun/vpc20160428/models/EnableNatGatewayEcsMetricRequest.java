// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableNatGatewayEcsMetricRequest extends TeaModel {
    /**
     * <p>Specifies whether to precheck only this request. Valid values:</p>
     * <br>
     * <p>**true**: The validity of the request is checked but the traffic monitoring feature is not enabled. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether the required parameters are specified. If the request fails the precheck, the corresponding error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <br>
     * <p>**false** (default): The validity of the request is checked. If the request passes the precheck, a 2XX HTTP status code is returned and the traffic monitoring feature is enabled.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the NAT gateway for which you want to enable the traffic monitoring feature.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The ID of the region where the NAT gateway is deployed. You can call the [DescribeRegions](~~36063~~) operation to query region IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableNatGatewayEcsMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableNatGatewayEcsMetricRequest self = new EnableNatGatewayEcsMetricRequest();
        return TeaModel.build(map, self);
    }

    public EnableNatGatewayEcsMetricRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableNatGatewayEcsMetricRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public EnableNatGatewayEcsMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
